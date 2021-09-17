package br.com.db.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
	private static final String url = "jdbc:mysql://localhost:3306/Biblioteca?useTimezone=true&serverTimezone=UTC";
	private static final String Driver = "com.mysql.cj.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "28027374";

	public static Connection getConnection() {

		try {

			Class.forName(Driver);
			
			Connection connection = DriverManager.getConnection(url, user, password);

			return connection;
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public static void close(Connection conn) {
		try {
			
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, Statement stnt) {
		close(conn);
		
		try {
			
			if (stnt != null) {
				stnt.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void close(Connection conn, Statement stnt, ResultSet rsts) {
		close(conn, stnt);
		
		try {
			
			if (rsts != null) {
				rsts.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
