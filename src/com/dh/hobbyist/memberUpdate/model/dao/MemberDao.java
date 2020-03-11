package com.dh.hobbyist.memberUpdate.model.dao;

import static com.dh.hobbyist.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.dh.hobbyist.member.model.vo.*;

public class MemberDao {

	private Properties prop = new Properties();

	public MemberDao() {
		String fileName = MemberDao.class.getResource("/sql/memberUpdate/memberUpdate-query.properties").getPath();

		System.out.println(fileName);
		try {
			prop.load(new FileReader(fileName));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//회원 정보수정
	public int memberUpdate(Connection con, Member member) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "";
		int memberUpdate = 0;

		if(member.getBankName() != null) {
			query = prop.getProperty("memberUpdate");
		}else{
		System.out.println("dao값:"+member.getMemberId());
		System.out.println("dao값:"+member.getMemberPwd());
		System.out.println("dao값:"+member.getMemberName());
		System.out.println("dao값:"+member.getEmail());
		System.out.println("dao값:"+member.getPhone());
		System.out.println("dao값:"+member.getBankName());
		System.out.println("dao값:"+member.getBankNum());
		System.out.println("dao값:"+member.getMemberCode());
		}
		if(member.getBankName() != null) {
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, member.getMemberPwd());
			pstmt.setString(2, member.getMemberName());
			pstmt.setString(3, member.getEmail());
			pstmt.setString(4, member.getPhone());
			pstmt.setString(5, member.getBankName());
			pstmt.setString(6, member.getBankNum());
			pstmt.setInt(7, member.getMemberCode());
		
			// MEMEBER_PK(프라이머리키 ) = ? 값에 대한 정보를  dao에서 써줘야한다

			memberUpdate = pstmt.executeUpdate();

			System.out.println("db에서 받은 dao값:"+member.getMemberId());
			System.out.println("db에서 받은 dao값:"+member.getMemberPwd());
			System.out.println("db에서 받은 dao값:"+member.getMemberName());
			System.out.println("db에서 받은 dao값:"+member.getEmail());
			System.out.println("db에서 받은 dao값:"+member.getPhone());
			System.out.println("db에서 받은 dao값:"+member.getBankName());
			System.out.println("db에서 받은 dao값:"+member.getBankNum());
			System.out.println("db에서 받은 dao값:"+member.getMemberCode());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			close(pstmt);
		}  
		
		}else {
			System.out.println("Null값으로 값이 저장되지않았습니다.");
		}
		return memberUpdate;  
	}


	//패스워드 확인
	public int pwConfirm(Connection con, String member) {
		int result =0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = prop.getProperty("pwConfirm");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, member);

			rset = pstmt.executeQuery();

			if(rset.next()) {
				result =rset.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return result;

	}



	//패스워드 확인
	public int pwCheck(Connection con, String userPw) {
		int result = 0;
		PreparedStatement pstmt =null;
		ResultSet rset =null;

		String query = prop.getProperty("pwCheck");


		try {
			pstmt =con.prepareStatement(query);
			pstmt.setString(1, userPw);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				result = rset.getInt(1);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return result;
	}






	//전화 번호 확인
	public int telCheck(Connection con, String userTel) {
		PreparedStatement pstmt = null;
		ResultSet rset =null;
		int result =0;

		String query= prop.getProperty("userTel");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userTel);

			rset = pstmt.executeQuery();

			if(rset.next()) {
				result = rset.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return result;
	}

}
