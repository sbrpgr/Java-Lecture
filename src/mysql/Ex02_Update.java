package mysql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Ex02_Update {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
			        "jdbc:mysql://localhost:3306/world", 
			        "mcuser", "mcpass");
			
			String sql = "UPDATE koreancity SET name=? WHERE id=?;";
			String city = "서울";
			int id = 2331;
			
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1,city);
			pStmt.setInt(2,id);
			
			pStmt.executeUpdate();
			pStmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
