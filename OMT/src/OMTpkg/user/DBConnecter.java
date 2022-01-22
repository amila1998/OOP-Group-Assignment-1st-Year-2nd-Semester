/**
 * 
 */
package OMTpkg.user;


import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 *
 */
public class DBConnecter {
	//connect to the 'movieandtvseriassys' database

		private static String url = "jdbc:mysql://Localhost:3306/movieandtvseriassys";
		private static String userName = "root";
		private static String password = "9819";
		private static Connection con;

		public static Connection getConnection() {
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				con = DriverManager.getConnection(url, userName, password);
				
			}
			catch (Exception e) {
				System.out.println("Database connection is not success!!!");
			}
			
			return con;
		}
	}

