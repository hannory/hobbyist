package com.dh.hobbyist.artist.model.dao;

import static com.dh.hobbyist.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.dh.hobbyist.artist.model.vo.ArtistCerts;

public class ArtistInfoDao {
	private Properties prop = new Properties();
	
	public ArtistInfoDao() {
		String fileName = ArtistInfoDao.class.getResource("/sql/artist/artist-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<ArtistCerts> selectCerts(Connection con, int aCode) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<ArtistCerts> list = null;
		ArtistCerts ac = null;
		
		//System.out.println("aCode : " + aCode);
		
		String query = prop.getProperty("selectCerts");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, aCode);
			
			rset = pstmt.executeQuery();
			
			list = new ArrayList<ArtistCerts>();
			
			while(rset.next()) {
				ac = new ArtistCerts();
				ac.setCertCode(rset.getInt("CERT_PK"));
				ac.setCertName(rset.getString("CERT_NAME"));
				ac.setCertDate(rset.getDate("CERT_DATE"));
				ac.setCertOrg(rset.getString("CERT_ORG"));
				ac.setMemberPk(rset.getInt("MEMBER_PK"));
				
				System.out.println("ac : " + ac);
				
				list.add(ac);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

}













