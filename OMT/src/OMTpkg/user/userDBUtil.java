/**
 * 
 */
package OMTpkg.user;
import OMTpkg.*;

import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



public class userDBUtil {
	private static boolean loginSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static boolean validate(String email, String password) {// method for validate user login from the database
		try {
			//validation
			con = DBConnecter.getConnection(); //connect to the database
			stmt = con.createStatement();
			String sql = "select * from user where email='"+email+"' and password='"+password+"'"; //SQL query
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) { //If result set (rs) is true then login Successfully is true
				loginSuccess = true;
			} else {//If result set (rs) is false then login Successfully is false
				loginSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return loginSuccess;
	}

	public static List<user> getuser(String uemail) {
		ArrayList<user> user = new ArrayList<>(); //create an array to include user details and return a object
		
		try {
			
						
			con = DBConnecter.getConnection();
			stmt = con.createStatement();
			String sql = "select * from user where email='"+uemail+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) { //to get all details from each user
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String NIC_PassportNO = rs.getString(5);
				String sex= rs.getString(6);
				String password  = rs.getString(7);
				String membershiptype  = rs.getString(8);
				
				user puser = new user(id,name,email,phone,NIC_PassportNO,sex,password, membershiptype);
				user.add(puser);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}

public static boolean userRegister(String name, String email, String phone,String NIC_PassportNO, String sex, String password, String membershiptype) {// method for insert user details in th database
	boolean isSuccess = false;
    	
    	try {
    		con = DBConnecter.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into user values (0,'"+name+"','"+email+"','"+phone+"','"+NIC_PassportNO+"','"+sex+"','"+password+"','"+membershiptype+"')";
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

public static boolean updateuser(String id, String name, String email, String phone, String sex, String NIC_PassportNO, String password) {// method for update user details in th database
	boolean isSuccess = false;
	try {
		
		con = DBConnecter.getConnection();
		stmt = con.createStatement();
		String sql = "update user set name='"+name+"', email='"+email+"', phone='"+phone+"',NIC_PassportNo='"+NIC_PassportNO+"', sex='"+sex+"', password='"+password+"' where UID='"+id+"' ";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
	
}
public static List<user> getUserDetails(String uid) {// method for rectrive user details in th database
	
	int convertedID = Integer.parseInt(uid);
	
	ArrayList<user> puser = new ArrayList<>();
	
	try {
		
		con = DBConnecter.getConnection();
		stmt = con.createStatement();
		String sql = "select * from user where UID='"+convertedID+"'";
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
			
			user u = new user(id,name,email,phone,NIC_PassportNO,sex,password,membershiptype);
			puser.add(u);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return puser;
}


public static boolean deleteuser(String id) { // method for delete user details in th database
	boolean isSuccess = false;
	int convId = Integer.parseInt(id);
	
	try {
		
		con = DBConnecter.getConnection();
		stmt = con.createStatement();
		String sql = "delete from user where UID='"+convId+"'";
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

public static boolean validateToResetPassword(String email, String name) {
	boolean Success = false;
	try {
		//validation
		con = DBConnecter.getConnection(); //connect to the database
		stmt = con.createStatement();
		String sql = "select * from user where email='"+email+"' and name='"+name+"'"; //SQL query
		rs = stmt.executeQuery(sql);
		
		if (rs.next()) { //If result set (rs) is true
			Success = true;
		} else {//If result set (rs) is false 
			Success = false;
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return Success;
}

public static boolean ResetPassword(String password, String email) {
	boolean isSuccess = false;
	try {
		
		con = DBConnecter.getConnection();
		stmt = con.createStatement();
		String sql = "update user set password='"+password+"' where email='"+email+"' ";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}




}
    
