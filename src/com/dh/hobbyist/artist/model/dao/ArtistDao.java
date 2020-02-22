package com.dh.hobbyist.artist.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Properties;
import static com.dh.hobbyist.common.JDBCTemplate.*;

public class ArtistDao {

	private Properties prop = new Properties();
	
	public ArtistDao() {
		String fileName = ArtistDao.class.getResource("/sql/artist/artist-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int nickCheck(Connection con, String nick) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;
		
		String query = prop.getProperty("nickCheck");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, nick);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				result = rset.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		
		return result;
	}
	
	//아티스트 전문 카테고리 삽입 메소드 
	public int insertCategory(Connection con, String memberPk, String[] details) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertCategory");
		
		try {
			
			for(int i = 0; i < details.length; i++) {
				
				if(!details[i].equals("")) {
					pstmt = con.prepareStatement(query);
					pstmt.setInt(1, Integer.parseInt(memberPk));
					pstmt.setString(2, details[i]);
					result = pstmt.executeUpdate();
				}
				
			}
						
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		
		return result;
	}

	//아티스트 자격증 삽입 메소드
	public int insertCerts(Connection con, String memberPk, HashMap<String, String[]> certsMap) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertCerts");
		
		String[] certiNames = certsMap.get("certiNames");
		String[] certiDays = certsMap.get("certiDays");
		String[] certiSpaces = certsMap.get("certiSpaces");
		
		
		try {
			for(int i = 0; i < 3; i++) {
				if(!certiNames[i].equals("") && !certiDays[i].equals("") && !certiSpaces[i].equals("")) {
					
					Date certsDate = Date.valueOf(certiDays[i]);
					
					pstmt = con.prepareStatement(query);
					pstmt.setString(1, certiNames[i]);
					pstmt.setDate(2, certsDate);
					pstmt.setString(3, certiSpaces[i]);
					pstmt.setInt(4, Integer.parseInt(memberPk));
					result = pstmt.executeUpdate();
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	// 학력/전공 삽입 메소드
	public int insertEdu(Connection con, String memberPk, HashMap<String, String[]> eduMap) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertEdu");
		
		String[] schoolNames = eduMap.get("schoolNames");
		String[] majors = eduMap.get("majors");
		String[] statuses = eduMap.get("statuses");
		
		try {
			for(int i = 0; i < 3; i++) {
				if(!schoolNames[i].equals("") && !majors[i].equals("") && !statuses[i].equals("")) {
					pstmt = con.prepareStatement(query);
					pstmt.setString(1, schoolNames[i]);
					pstmt.setString(2, majors[i]);
					if(statuses[i].equals("inSchool")) {
						pstmt.setInt(3, 0);
					} else if(statuses[i].equals("graduate")) {
						pstmt.setInt(3, 1);
					}
					pstmt.setInt(4, Integer.parseInt(memberPk));
					result = pstmt.executeUpdate();
				}
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	//경력 삽입 메소드
	public int insertCareer(Connection con, String memberPk, HashMap<String, String[]> careerMap) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertCareer");
		
		String[] officeNames = careerMap.get("officeNames");
		String[] positions = careerMap.get("positions");
		String[] workContents = careerMap.get("workContents");
		String[] workYears = careerMap.get("workYears");
		String[] workMonths = careerMap.get("workMonths");
		
		try {
					
				for(int i = 0; i < 3; i++) {
						
					if(!officeNames[i].equals("") && !positions[i].equals("") && !workContents[i].equals("") && !workYears[i].equals("") && !workMonths[i].equals("")) {
						
						String term = workYears[i] + "년 " + workMonths[i] +"개월"; 
						
						pstmt = con.prepareStatement(query);
						pstmt.setString(1, officeNames[i]);
						pstmt.setString(2, positions[i]);
						pstmt.setString(3, workContents[i]);
						pstmt.setString(4, term);
						pstmt.setInt(5, Integer.parseInt(memberPk));
						result = pstmt.executeUpdate();
					}
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close(pstmt);
			}
		
		return result;
	}
	

}
