package com.dh.hobbyist.member.model.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.dh.hobbyist.artist.model.vo.ApplyArtist;
import com.dh.hobbyist.lesson.model.vo.LessonPayment;
import com.dh.hobbyist.member.model.dao.MemberDao;
import com.dh.hobbyist.member.model.vo.Member;
import com.dh.hobbyist.suggest.model.vo.PetitionWishList;

import static com.dh.hobbyist.common.JDBCTemplate.*;

public class MemberService {

	//회원가입용 메소드(유승)
	public int insertMember(Member member) {

		Connection con = getConnection();

		int result = new MemberDao().insertMember(con, member);

		if(result > 0) {
			commit(con);
		}else {
			rollback(con);
		}

		close(con);

		return result;
	}
	//로그인 메소드(유승)
	public Member loginCheck(Member member) {

		Connection con = getConnection();

		Member loginMember = new MemberDao().loginCheck(con, member);

		close(con);

		return loginMember;
	}
	//아이디 중복체크 메소드(유승)
	public int idCheck(String memberId) {
		Connection con = getConnection();

		int result = new MemberDao().idCheck(con, memberId);

		close(con);

		return result;
	}

	//관리자에서 회원정보 조회용 메소드 (찬영)
	public List<Member> selectList() {

		Connection con = getConnection();

		List<Member> memberList = new MemberDao().selectList(con);

		close(con);

		return memberList;
	}

	//관리자에서 아티스트 정보 조회용 메소드 (찬영)
	public List<Member> selectArtistList() {
		Connection con = getConnection();

		List<Member> artistList = new MemberDao().selectArtistList(con);

		close(con);

		return artistList;
	}



	//아이디 찾기 메소드(유승)
	public Member findId(Member member) {
		Connection con = getConnection();

		Member findMember = new MemberDao().findId(con, member);

		close(con);

		return findMember;
	}

	//비밀번호 찾기 메소드(유승)
	public Member findPassword(Member member) {
		Connection con = getConnection();

		Member findMember = new MemberDao().findPassword(con, member);

		close(con);

		return findMember;
	}

	//비밀번호 재설정(유승)
	public int setPassword(String memberPwd, String memberId) {
		Connection con = getConnection();

		int result = new MemberDao().setPassword(con, memberPwd, memberId);

		close(con);

		return result;
	}
	//휴대전화 중복 체크(유승)
	public int phoneCheck(String phone) {
		Connection con = getConnection();

		int result = new MemberDao().phoneCheck(con, phone);

		close(con);

		return result;
	}

	//첫 로그인 관심 카테고리 설정(유승)
	public int insertCategory(int memberCode, int[] categoryCodes) {
		Connection con = getConnection();

		int result = new MemberDao().insertCategory(con, memberCode, categoryCodes);

		if(result > 0) {
			commit(con);
		}else {
			rollback(con);
		}

		close(con);

		return result;
	}
	//첫 로그인 여부 확인용 로그인 카운트(유승)
	public int loginCount(Member member) {
		Connection con = getConnection();

		int result2 = new MemberDao().loginCount(con, member);

		if(result2 > 0) {
			commit(con);
		}else {
			rollback(con);
		}

		close(con);

		return result2;
	}


	   //회원의 프로필 이미지 경로 조회(지호)
	   public String selectImageRoot(int memberCode) {
	      Connection con = getConnection();

	      String imageRoot = new MemberDao().selectImageRoot(con, memberCode);

	      close(con);

	      return imageRoot;
	   }

	   //회원의 아티스트 승인 신청 내역 조회(지호)
	   public ApplyArtist selectOneApplyArtist(int memberCode) {
	      Connection con = getConnection();

	      ApplyArtist aa = new MemberDao().selectOneApplyArtist(con, memberCode);

	      close(con);

	      return aa;
	   }

	//회원의 찜한 건의 목록 내역 조회 (지호)
	public ArrayList<PetitionWishList> selectPetitionWishList(int memberCode) {
		Connection con = getConnection();

        ArrayList<PetitionWishList> list = new MemberDao().selectPetitionWishList(con, memberCode);

        close(con);

        return list;
	}

	// 사용자(Member)의 수업 결재 목록 조회 (은석)
    public ArrayList<LessonPayment> selectLessonPaymentList(int member_pk) {
	    Connection con = getConnection();

	    ArrayList<LessonPayment> paymentArrayList = new MemberDao().selectLessonPaymentList(con, member_pk);

	    close(con);

	    return paymentArrayList;
    }
    
    // 마이페이지 클릭 시 사용자의 포인트 새로 조회 (종현)
	public int selectPoint(int memberCode) {
		Connection con = getConnection();
		
		int point = new MemberDao().selectPoint(con, memberCode);
		
		close(con);
		
		return point;
	}
}
