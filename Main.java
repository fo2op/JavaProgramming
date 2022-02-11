package database;


import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
	//connection to a database. here i used mysql workbench

	public static void main(String[] args)  throws Exception{//throws exception becuase it would show an error here
		// TODO Auto-generated method stub
		
	getConnection();

	}
	
	
	

	public static Connection getConnection() throws Exception {
		
		//open a connection
		try {

			//String driver = "com.mysql.jdbc.Driver";//deprecated but still work. The new driver class is `com.mysql.cj.jdbc.Driver'.
			String driver ="com.mysql.cj.jdbc.Driver";//
			/*
			 * jdbc--> the api
			 * mysql--> the database
			 * localhost or 1237.0.0.1-->the servername or ip adress on which the mysql is running
			 *3306 -->is the port number 
			 *webapp --> the database name.
			 */
			String url = "jdbc:mysql://127.0.0.1:3306/webapp";//acces the database and the table
			String username = "sqluser";//username of mysql database
			String password = "password";//if the mysql user has a password given by the user by the time of installing the mysql database
			
			Class.forName(driver);

			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("connected");
			return conn;

		} catch (Exception e) {
			System.out.println(e);}
		

		return null;
		}
	

}

