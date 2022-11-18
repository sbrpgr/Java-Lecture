package mysql.customer2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import mysql.customer.Customer;


public class DAO2 {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	public DAO2() {
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
	
	public void deletePeople(String bnumber) {
		Connection conn = myGetConnection();
		String sql = "UPDATE baseball SET isDeleted=1 WHERE bnumber=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, bnumber);
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updatePeople(People c) {
		Connection conn = myGetConnection();
		String sql = "UPDATE baseball SET bname=?, bpos=?, bir=?, h=? WHERE bnumber=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, c.getBname());
			pStmt.setString(2, c.getBpos());
			pStmt.setString(3, c.getBir().toString());
			pStmt.setInt(4, c.getH());
			pStmt.setInt(5, c.getBnumber());
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public People getPeople(int bnumber) {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM people WHERE uid=?;";
		People c = new People();
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, bnumber);
			
			// Select 실행
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				c.setBname(rs.getString(1));
				c.setBnumber(rs.getInt(2));
				c.setH(rs.getInt(3));
				c.setBir(LocalDate.parse(rs.getString(4)));
			}
			rs.close();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public List<People> getPeople() {
		Connection conn = myGetConnection();
		List<People> list = new ArrayList<>();
		String sql = "SELECT * FROM People;";
		try {
			Statement stmt = conn.createStatement();
			
			// Select 실행
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				People c = new People();
				c.setBname(rs.getString(1));
				c.setBnumber(rs.getInt(2));
				c.setH(rs.getInt(3));
				c.setBir(LocalDate.parse(rs.getString(4)));
				list.add(c);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}
	
	public void insertPeople(People c) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO customer(bname, bnumber, bpos, bir, h) VALUES(?, ?, ?, ?, ?);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, c.getBname());
			pStmt.setInt(2, c.getBnumber());
			pStmt.setString(3, c.getBpos());
			pStmt.setString(4, c.getBir().toString());
			pStmt.setInt(5, c.getH());
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}