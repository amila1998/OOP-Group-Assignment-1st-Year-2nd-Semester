package OMTpkg.videos;
import OMTpkg.user.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



//Database operations for the table content creator in the database 
public class videoDBUtil {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	//Linking to a database(URL/Username/Password)
	
	public static List<video> getMyvideos(String uid) {
		ArrayList<video> video = new ArrayList<>(); 
		
		try {
			
						
			con = DBConnecter.getConnection();
			stmt = con.createStatement();
			String sql = "select * from movieandtvseriassys.video where UID ='"+uid+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) { //to get all details from each user
				int videoID = rs.getInt(1);
				String title = rs.getString(2);
				String description = rs.getString(3);
				String ageRestriction = rs.getString(4);
				String UID = rs.getString(5);
				String category = rs.getString(6);
				
				
				video pvideo = new video(videoID,title,description,ageRestriction,category,UID);
				video.add(pvideo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return video;
	}

	public static boolean insertVideo(String uid, String title, String description, String ageRestriction,
			String category) {
		boolean Success = false;
    	
    	try {
    		con = DBConnecter.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into video values (0,'"+title+"','"+description+"','"+ageRestriction+"','"+uid+"','"+category+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			Success = true;
    		} else {
    			Success = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return Success;
    }

	public static int updatevideoDetails(String vid, String title, String description, String ageRestriction,
			String category) {
		int UID = 0;
		try {
			
			con = DBConnecter.getConnection();
			stmt = con.createStatement();
			String sql = "update video set title='"+title+"', description='"+description+"', ageRestriction='"+ageRestriction+"',category='"+category+"' where videoID='"+vid+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				con = DBConnecter.getConnection();
				stmt = con.createStatement();
				sql = "Select UID from video where videoID='"+vid+"'";
				ResultSet rs2 = stmt.executeQuery(sql);
				
				while (rs2.next()) { //to get all details from each user
					UID = rs2.getInt(1);
					
				}
			}
			else {
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return UID;
	}
	public static List<video> getvideoDetails(String vid) {
		ArrayList<video> video = new ArrayList<>(); 
		
		try {
			
						
			con = DBConnecter.getConnection();
			stmt = con.createStatement();
			String sql = "select * from movieandtvseriassys.video where videoID ='"+vid+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) { //to get all details from each user
				int videoID = rs.getInt(1);
				String title = rs.getString(2);
				String description = rs.getString(3);
				String ageRestriction = rs.getString(4);
				String UID = rs.getString(5);
				String category = rs.getString(6);
				
				
				video pvideo = new video(videoID,title,description,ageRestriction,category,UID);
				video.add(pvideo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return video;
	}

	public static boolean deletevideo(String vid) {
		boolean isSuccess = false;
		int convId = Integer.parseInt(vid);
		
		try {
			
			con = DBConnecter.getConnection();
			stmt = con.createStatement();
			String sql = "delete from video where videoID='"+convId+"'";
			int r = stmt.executeUpdate(sql);
			
			if (r > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}

	
	

}