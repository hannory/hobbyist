package com.dh.hobbyist.place.model.service;

import com.dh.hobbyist.common.model.vo.Image;
import com.dh.hobbyist.place.model.dao.PlaceDao;
import com.dh.hobbyist.place.model.vo.CompanyAds;
import com.dh.hobbyist.place.model.vo.PlaceCompany;

import static com.dh.hobbyist.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

public class PlaceService {
    // 공간대여업체 추가 (은석)
    public int insertPlaceCompany(PlaceCompany inputPC) {
        // 커넥션 객체 생성
        Connection con = getConnection();
        int result = 0;

        // 반환값은 단순히 0 1 이 아니라 인서트된 PK 값
        result = new PlaceDao().insertPlaceCompany(con, inputPC);

        if (result > 0) {
            commit(con);
        } else {
            rollback(con);
        }
        close(con);

        return result;
    }

    // 마지막으로 추가된 업체 가져오기 (은석)
    public PlaceCompany selectPlaceCompany(int pk) {
        Connection con = getConnection();

        PlaceCompany company = new PlaceDao().selectPlaceCompany(con, pk);
        return company;
    }

    // 광고일정 추가 (은석)
    public int insertAds(PlaceCompany company, CompanyAds inputAds) {
        Connection con = getConnection();
        int result = 0;

        result = new PlaceDao().insertAds(con, company, inputAds);

        if (result > 0) {
            commit(con);
        } else {
            System.out.println("rollback occurred wtf");
            rollback(con);
        }

        return result;
    }

    // 공간대여업체의 관련사진 추가 (은석)
    public int insertImageList(ArrayList<Image> fileList) {
        Connection con = getConnection();
        int result = 0;

        // int result = new PlaceDao().insertImageList(con, fileList);
        // 파일 포문 돌려가면서 하나하나 넣기.
        for (int i = 0; i < fileList.size(); i++) {
            int isMain = 0;
            // 첫 사진은 메인으로 분류한다.
            if (i == 0) {
                isMain = 1;
            }
            //
            result += new PlaceDao().insertImage(con, fileList.get(i), isMain);
        }

        if (result == fileList.size()) {
            commit(con);
            result = 1;
        } else {
            rollback(con);
        }
        return result;
    }
}
