package client.dao;

import client.dto.UserDTO;
import java.sql.*;

public class UserDAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public UserDAO(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java07", "java07");
		} catch(SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public boolean isIdExsit(String id){
		String sql = "select * from musicuser where id=?";
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				return true;
			}
			return false;
		
		} catch(SQLException e){
			e.printStackTrace();
			return true;
		}
	}

}
