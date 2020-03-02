package com.dh.hobbyist.lesson.model.dao;

import static com.dh.hobbyist.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.dh.hobbyist.lesson.model.vo.Image;
import com.dh.hobbyist.lesson.model.vo.Lesson;
import com.dh.hobbyist.lesson.model.vo.LessonOrder;
import com.dh.hobbyist.lesson.model.vo.LessonSchedule;

public class LessonRelatedDao {
	private Properties prop = new Properties();
	
	public LessonRelatedDao() {
		String fileName = LessonRelatedDao.class.getResource("/sql/lesson/lessonRelated-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//수업 개설 후 수업DB에 등록하기 위한 메소드
	public int insertLesson(Connection con, Lesson lesson) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertLesson");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, lesson.getLessonName());
			pstmt.setInt(2, lesson.getMinStudents());
			pstmt.setInt(3, lesson.getMaxStudents());
			pstmt.setInt(4, lesson.getTotalOrders());
			pstmt.setInt(5, lesson.getCostPerOrder());
			pstmt.setInt(6, lesson.getTotalCosts());
			pstmt.setString(7, lesson.getArtistIntro());
			pstmt.setString(8, lesson.getLessonIntro());
			pstmt.setInt(9, lesson.getCategoryCode());
			pstmt.setInt(10, lesson.getArtistCode());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	//lessonCode 조회용 메소드
	public int selectLessonCurrval(Connection con) {
		Statement stmt = null;
		ResultSet rset = null;
		int lessonCode = 0;
		
		String query = prop.getProperty("selectLessonCurrval");
		
		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				lessonCode = rset.getInt("CURRVAL");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return lessonCode;
	}

	public int insertSchedule(Connection con, LessonSchedule schedule) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertSchedule");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, schedule.getLessonCode());
			pstmt.setString(2, schedule.getRegion());
			pstmt.setString(3, schedule.getSubRegion());
			pstmt.setString(4, schedule.getAddress());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	//schedule code의 PK 값을 받아오기 위한 메소드
	public int selectScheduleCurrval(Connection con) {
		Statement stmt = null;
		ResultSet rset = null;
		int scheduleCode = 0;
		
		String query = prop.getProperty("selectScheduleCurrval");
		
		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				scheduleCode = rset.getInt("CURRVAL");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return scheduleCode;
	}

	public int insertOrder(Connection con, LessonOrder order) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertOrder");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, order.getScheduleCode());
			pstmt.setInt(2, order.getOrderTime());
			pstmt.setTimestamp(3, order.getOrderStart());
			pstmt.setTimestamp(4, order.getOrderEnd());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int insertImage(Connection con, Image image) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertImage");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, image.getImageRoute());
			pstmt.setString(2, image.getImageName());
			pstmt.setInt(3, image.getImageFkPk());
			pstmt.setInt(4, image.getImageMain());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}


}













