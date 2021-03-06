/**
 * 
 */
package OMTpkg.advertistments;
import OMTpkg.user.*;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 */
public class advertistmentDBUtil {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static List<advertistment> getMyads(String uid) {
		ArrayList<advertistment> advertistment = new ArrayList<>();
		int convertedID = Integer.parseInt(uid);
		try {
			
			
			con = DBConnecter.getConnection();
			stmt = con.createStatement();
			String sql = "select * from advertisement where UID='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) { //to get all details from each user
				int ad_id = rs.getInt(1);
				int UID = rs.getInt(2);
				String ad_name = rs.getString(3);
				String category = rs.getString(4);
				String period = rs.getString(5);
				String filename = rs.getString(6);
				String thumbnail = rs.getString(7);
			
				
				
				advertistment a = new advertistment(ad_id,UID,ad_name,category,period,filename,thumbnail);
				advertistment.add(a);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return advertistment;
	}

	public static boolean insertadvertistment(String uid, String ad_name,String period,String adCategory) {
		
		boolean Success = false;
    	
    	try {
    		con = DBConnecter.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into advertisement values (0,'"+uid+"','"+ad_name+"','"+adCategory+"','"+period+"','null','null')";
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

	public static List<advertistment> getMyadDetails(String vid, String uid2) {
			ArrayList<advertistment> advertistment = new ArrayList<>(); 
			int convertedID = Integer.parseInt(vid);
			int convertedID2 = Integer.parseInt(uid2);
		try {
			
						
			con = DBConnecter.getConnection();
			stmt = con.createStatement();
			String sql = "select * from movieandtvseriassys.advertisement where ad_id ='"+convertedID+"'and UID='"+convertedID2+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) { //to get all details from each user
				int ad_id = rs.getInt(1);
				int UID = rs.getInt(2);
				String ad_name = rs.getString(3);
				String category = rs.getString(4);
				String period = rs.getString(5);
				String filename = rs.getString(6);
				String thumbnail = rs.getString(7);
				
				
				advertistment a = new advertistment(ad_id,UID,ad_name,category,period,filename,thumbnail);
				advertistment.add(a);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return advertistment;
	}

	public static boolean updateAdDetails(String uid, String ad_id, String ad_name, String period, String adCategory) {
			boolean succ= false;
		
		try {
			
			con = DBConnecter.getConnection();
			stmt = con.createStatement();
			String sql = "update advertisement set ad_name='"+ad_name+"', period='"+period+"', category='"+adCategory+"' where ad_id='"+ad_id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				
				succ = true;
			}
			else {
				succ = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return succ;
	}

	public static boolean deleteAds(String vid) {
		boolean isSuccess = false;
		int convId = Integer.parseInt(vid);
		
		try {
			
			con = DBConnecter.getConnection();
			stmt = con.createStatement();
			String sql = "delete from advertisement where ad_id='"+convId+"'";
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
