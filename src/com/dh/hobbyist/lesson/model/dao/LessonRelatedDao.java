package com.dh.hobbyist.lesson.model.dao;

import static com.dh.hobbyist.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.dh.hobbyist.lesson.model.vo.Lesson;

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

}












