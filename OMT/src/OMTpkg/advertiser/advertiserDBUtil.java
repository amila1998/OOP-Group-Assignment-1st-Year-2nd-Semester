/**
 * 
 */
package OMTpkg.advertiser;

import OMTpkg.user.DBConnecter;


import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author amila
 *
 */
public class advertiserDBUtil {
	
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	// method for validate user login from the database
	
	public static boolean advertiserconformation(String id) {
		boolean conform = false;
		try {
			//validation
			con = DBConnecter.getConnection(); //connect to the database
			stmt = con.createStatement();
			String sql = "select * from advertiser where UID='"+id+"'"; //SQL query
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) { //If result set (rs) is true 
				conform = true;
			} else {//If result set (rs) is false then 
				conform = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conform;
	}

	public static boolean advertiserRegister(String uid, String companyName, String companyAddress) {
		boolean isSuccess = false;
    	
    	try {
    		con = DBConnecter.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into advertiser values (0,'"+uid+"','"+companyName+"','"+companyAddress+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    
		
	}

	public static List<advertiser> getadvertiserDetails(String uid) {
		int convertedID = Integer.parseInt(uid);
		
		ArrayList<advertiser> padvertiser = new ArrayList<>();
		
		try {
			
			con = DBConnecter.getConnection();
			stmt = con.createStatement();
			String sql = "select u.UID,u.name,u.email,u.phone,u.NIC_PassportNo,u.sex,u.password,u.membershiptype,a.advertiserID,a.companyName,a.companyAddress from movieandtvseriassys.advertiser a, movieandtvseriassys.user u where u.UID='"+convertedID+"'and a.UID='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String NIC_PassportNO = rs.getString(5);
				String sex= rs.getString(6);
				String password  = rs.getString(7);
				String membershiptype  = rs.getString(8);
				int advertiserID  = rs.getInt(9);
				String companyName  = rs.getString(10);
				String companyAddress  = rs.getString(11);
				
				
				advertiser a = new advertiser(id, name, email, phone, NIC_PassportNO, sex,
						password, membershiptype,advertiserID,companyName, companyAddress);
				padvertiser.add(a);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return padvertiser;
	}


	
	

}
