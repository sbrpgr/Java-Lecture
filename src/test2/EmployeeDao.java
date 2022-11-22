package test2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import mysql.kbo.Player;
import mysql.kbo.Position;
import test1.Employee;

public class EmployeeDao {
	
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	EmployeeDao() {
		try {
			InputStream is = new FileInputStream("/Workspace/mysql.properties");
			Properties props = new Properties();
			props.load(is);
			is.close();
			
			host = props.getProperty("host");
			user = props.getProperty("user");
			password = props.getProperty("password");
			database = props.getProperty("database");
			port = props.getProperty("port", "3306");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection myGetConnection() {
		Connection conn = null;
		try {
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void createTable( ) {
		Connection conn = myGetConnection();
		String sql = "" + 
				"CREATE TABLE employee\r\n"
				+ "(\r\n"
				+ "	id int NOT NULL,\r\n"
				+ "	name varchar(4) NOT NULL,\r\n"
				+ "	position varchar(4) NOT NULL,\r\n"
				+ "	joinDate date,\r\n"
				+ "	PRIMARY KEY (id)\r\n"
				+ ");";
		try {
			Statement stmt = conn.createStatement();
			
			stmt.execute(sql);
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void insertEmployee(Employee emp) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO Employee VALUES (?, ?, ?, ?);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, emp.getId());
			pStmt.setString(2, emp.getName());
			pStmt.setString(3, emp.getPosition());
			pStmt.setString(4, emp.getJoinDate().toString());
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printAllEmployee( ) {
		
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM Employee"
				+ "	ORDER BY JoinDate;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery(sql);
			while (rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPosition(rs.getString(3));
				e.setJoinDate(LocalDate.parse(rs.getString(4)));
				System.out.println(e);
			}
			rs.close();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	
		
		
	}
	
}
