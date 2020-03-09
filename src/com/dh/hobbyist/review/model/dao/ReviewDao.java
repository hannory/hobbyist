package com.dh.hobbyist.review.model.dao;

import com.dh.hobbyist.common.model.vo.Image;
import com.dh.hobbyist.lesson.model.vo.Lesson;
import com.dh.hobbyist.lesson.model.vo.LessonPayment;
import com.dh.hobbyist.lesson.model.vo.LessonSchedule;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import static com.dh.hobbyist.common.JDBCTemplate.close;

public class ReviewDao {
	
	private Properties prop = new Properties();
	
	public ReviewDao() {
		String fileName = ReviewDao.class.getResource("/sql/review/review-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	// 사용자(Member)의 수업 결재 목록 조회 (은석)
	public ArrayList<LessonPayment> selectLessonPaymentList_lessonPayment(Connection con, int member_pk) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		ArrayList<LessonPayment> paymentArrayList = null;
		
		// 멤버리뷰 목록조회 1단계: 멤버 PK 에 따른 LESSON_PAYMENT, LESSON_SCHEDULE 불러오기.
		String query = prop.getProperty("selectLessonPaymentListByMember");
		
		try {
			preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setInt(1, member_pk);
			
			resultSet = preparedStatement.executeQuery();
			
			paymentArrayList = new ArrayList<>();
			while (resultSet.next()) {
				LessonPayment payment = new LessonPayment();
				
				payment.setArtist_pk(resultSet.getInt("payment_pk"));
				payment.setPoints_used(resultSet.getInt("points_used"));
				payment.setPoints_given(resultSet.getInt("points_given"));
				payment.setPayment_costs(resultSet.getInt("payment_costs"));
				payment.setPayment_method(resultSet.getString("payment_method"));
				payment.setPayment_imp_num(resultSet.getString("payment_imp_num"));
				payment.setPayment_date(resultSet.getTimestamp("payment_date"));
				payment.setLesson_schedule_pk(resultSet.getInt("lesson_schedule_pk"));
				payment.setArtist_pk(resultSet.getInt("artist_pk"));
				payment.setMember_pk(resultSet.getInt("member_pk"));
				
				paymentArrayList.add(payment);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(resultSet);
			close(preparedStatement);
		}
		
		return paymentArrayList;
	}
	
	// 위에 selectLessonPaymentList_lessonPayment 와 동일, 반환값만 다름.
	public ArrayList<LessonSchedule> selectLessonPaymentList_LessonSchedule(Connection con, int member_pk) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		ArrayList<LessonSchedule> scheduleArrayList = null;
		
		// 멤버리뷰 목록조회 1단계: 멤버 PK 에 따른 LESSON_PAYMENT, LESSON_SCHEDULE 불러오기.
		String query = prop.getProperty("selectLessonPaymentListByMember");
		
		try {
			preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setInt(1, member_pk);
			
			resultSet = preparedStatement.executeQuery();
			
			scheduleArrayList = new ArrayList<>();
			while (resultSet.next()) {
				LessonSchedule schedule = new LessonSchedule();
				
				schedule.setScheduleCode(resultSet.getInt("schedule_pk"));
				schedule.setLessonCode(resultSet.getInt("lesson_pk"));
				schedule.setRegion(resultSet.getString("region"));
				schedule.setSubRegion(resultSet.getString("sub_region"));
				schedule.setAddress(resultSet.getString("address"));
				schedule.setStatus(resultSet.getInt("status"));
				
				scheduleArrayList.add(schedule);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(resultSet);
			close(preparedStatement);
		}
		return scheduleArrayList;
	}
	
	// 레슨 불러오기
	public Lesson selectLesson(Connection con, int pk) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Lesson lesson = null;
		
		String query = prop.getProperty("selectLesson");
		
		try {
			preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setInt(1, pk);
			
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				
				lesson = new Lesson();
				
				lesson.setLessonCode(resultSet.getInt("lesson_pk"));
				lesson.setLessonName(resultSet.getString("lesson_name"));
				lesson.setMinStudents(resultSet.getInt("min_students"));
				lesson.setMaxStudents(resultSet.getInt("max_students"));
				lesson.setTotalOrders(resultSet.getInt("total_orders"));
				lesson.setCostPerOrder(resultSet.getInt("cost_per_order"));
				lesson.setTotalCosts(resultSet.getInt("total_costs"));
				lesson.setArtistIntro(resultSet.getString("artist_intro"));
				lesson.setLessonIntro(resultSet.getString("lesson_intro"));
				lesson.setPetitionCode(resultSet.getInt("petition_pk"));
				lesson.setRegisteredDate(resultSet.getDate("registered_date"));
				lesson.setStatus(resultSet.getInt("status"));
				lesson.setCategoryCode(resultSet.getInt("category_pk"));
				lesson.setArtistCode(resultSet.getInt("artist_pk"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(resultSet);
			close(preparedStatement);
		}
		
		return null;
	}
	
	public Image selectImage(Connection con, String img_type, int pk, int img_main) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Image image = null;
		
		String query = prop.getProperty("selectImage");
		
		try {
			preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setString(1, img_type);
			preparedStatement.setInt(2, pk);
			preparedStatement.setInt(3, img_main);
			
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				image = new Image();
				
				image.setImageFkPk(resultSet.getInt("image_pk"));
				image.setImageRoute(resultSet.getString("image_route"));
				image.setImageName(resultSet.getString("image_name"));
				image.setImageType(resultSet.getString("image_type"));
				image.setImageFkPk(resultSet.getInt("image_fk_pk"));
				image.setImageMain(resultSet.getInt("image_main"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(resultSet);
			close(preparedStatement);
		}
		
		return image;
	}
}
