package com.dh.hobbyist.place.controller;

import com.dh.hobbyist.common.MyFileRenamePolicy;
import com.dh.hobbyist.place.model.service.PlaceService;
import com.dh.hobbyist.place.model.vo.CompanyAds;
import com.dh.hobbyist.place.model.vo.PlaceCompany;
import com.oreilly.servlet.MultipartRequest;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Enumeration;

// 관리자 페이지에서 공간대여업체를 추가함.
@WebServlet(name = "AddPlaceServlet", urlPatterns = "/add_place.ad")
public class AddPlaceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("gotten into add_place ");
        // request 가 multipart/form-data 방식으로 들어온건가?
        if (ServletFileUpload.isMultipartContent(request)) {
            // 20mb
            int maxSize = 20 * 1024 * 1024;
            System.out.println("isMultipartContent");

            //웹 서버 컨테이너(톰캣 내부의 web 폴더) 경로 추출
            String root = request.getSession().getServletContext().getRealPath("/");

            System.out.println("root : " + root);

            //파일 저장 경로
            String savePath = root + "static/upload/place";

            // 사진파일은 이 객체가 생성되는 순간 알아서 저장됨.
            MultipartRequest multipartRequest =
                    new MultipartRequest(request, savePath, maxSize, new MyFileRenamePolicy());
            // 저장될 파일이름
            ArrayList<String> fileName = new ArrayList<>();


            //파일이 전송된 폼의 name값을 반환
            Enumeration<String> files = multipartRequest.getFileNames();

            // 내용물 확인.
            // 이때 역순으로 파일이 불러져온다.
            // 중요한 참고사항임
            // nextElement() 하면 가장 마지막으로 들어갔을 pic5 부터 불러와진다는 소리.
            while (files.hasMoreElements()) {
                String name = files.nextElement();
                System.out.println("name: " + name);

                // 저장된 파일명들 다 넣기
                fileName.add(multipartRequest.getFilesystemName(name));
            }

            // 파일명 확인좀
            for (int i = 0; i < fileName.size(); i++) {
                System.out.println(i + ": " + fileName.get(i));
            }
            System.out.println("fileName: " + fileName);

            // 파일건은 위로 끝. 이제 다른 값들 가져오기.
            // 회사명
            String companyName = multipartRequest.getParameter("companyName");
            // 폰번
            String phone = multipartRequest.getParameter("phone");
            // 주소
            String addr = multipartRequest.getParameter("addr");
            // 사이트 주소
            String  website = multipartRequest.getParameter("website");
            // 업체소개
            String intro = multipartRequest.getParameter("intro");
            // 영업시간
            String serviceTime = multipartRequest.getParameter("serviceTime");
            // 공간규모
            String roomSize = multipartRequest.getParameter("roomSize");

            // 위 까지가 PLACE_COMPANY 테이블
            // 다음은 COMPANY_ADS table
            // 광고 게제 시작일
            Date startDate = Date.valueOf(multipartRequest.getParameter("startDate"));
            // 종료일
            Date endDate = Date.valueOf(multipartRequest.getParameter("endDate"));

            // 공간대여업체 객체
            PlaceCompany inputPC = new PlaceCompany();
            // 받은 값 넣기
            inputPC.setCompany_name(companyName);
            inputPC.setPhone(phone);
            inputPC.setAddress(addr);
            inputPC.setWebsite(website);
            inputPC.setIntro(intro);
            inputPC.setService_time(serviceTime);
            inputPC.setRoom_size(roomSize);

            // 공간대여업체 광고게제 관련 객체
            CompanyAds inputAds  = new CompanyAds();
            inputAds.setStartDate(startDate);
            inputAds.setEndDate(endDate);

            int insert_company_result = new PlaceService().insertPlaceCompany(inputPC);
            // 들어가짐? 그럼 바로 광고게제정보도 넣는다
            if (insert_company_result > 0) {
                // 위에 커밋된 대여업체 바로 불러온다
                PlaceCompany company = new PlaceService().getLatestInserted();
                // int insert_ads_result = new PlaceService().
            }

        }
    }
}
