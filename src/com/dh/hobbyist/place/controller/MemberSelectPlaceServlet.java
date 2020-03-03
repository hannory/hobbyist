package com.dh.hobbyist.place.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MemberSelectPlaceServlet", urlPatterns = "/place/list.me")
public class MemberSelectPlaceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 최우선적으로 url 에서 뽑아올 주소값 등이 있는지 확인해본다.
        // 몇 페이지인지, 지역은 어디로 뒀는지, 공간스타일은 어떠한지?.

        // 문제점 1: 지역분류 안돼있음.... 이거 하려면 주소에서 이름 뽑아내던가 해야함. 아니면 디비에 칼럼 새로 넣던지.

        // 현 페이지, 또는 가야하는 페이지.
        int pageNum = 1;
        try {
            // 매개변수로 받아왔으면 뽑아오고, 안뽑히면 오류나는걸테니 기본값으로.
            pageNum = Integer.parseInt(request.getParameter("page"));
        } catch (Exception e) {
            System.out.println("parseError prolly. set to default of 1.");
        }

        // 가져왔으면 이제 필요한건 목록 불러오기.
        // 우선 페이징을 처리해야함.
        // 한 페이지에 몇개? - 기본 9개. 변경불가.
        int limit = 9;
        // 전체 조회할 시 마지막 페이지
        int maxPage;
        // 시각화된 페이지 중 페이지가 시작될 페이지.
        // e.g. 1 2 3 4 5  페이지가 보이면 1페이지
        int startPage;
        // 위와 반대로 마지막 페이지. 위로 예를들면 5페이지.
        int endPage;

        // 기본값으로 가나다순 어떪.


        String page = "/views/rental/list.jsp";

        // response.sendRedirect(request.getContextPath() + page);
        request.getRequestDispatcher(page).forward(request, response);


    }
}
