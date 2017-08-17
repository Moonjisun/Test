import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import client.dto.UserDTO;

public class DBServerTest {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	public DBServerTest() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java07", "java07");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public boolean insertUser(UserDTO userDTO) {
		String sql = "insert into musicuser values(?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userDTO.getId());
			pstmt.setString(2, userDTO.getPw());
			pstmt.setString(3, userDTO.getName());
			pstmt.setString(4, userDTO.getPhoneNumber());
			pstmt.setString(5, userDTO.getEmail());

			int count = pstmt.executeUpdate();
			if (count > 0) return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean isIdExsit(String id){
		String sql = "select * from musicuser where id=?";
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs= pstmt.executeQuery();
			while(rs.next()){
				return true;
			}
			return false;
		}catch(SQLException e){
			e.printStackTrace();
			return true;
		}
	}

	public String getId(String email,String phone){
		String sql = "select * from musicuser where email=?,phone=?";
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, phone);
			rs = pstmt.executeQuery();
			while(rs.next()){
				return rs.getString(1);
			}
			return null;
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}
	}

//	public boolean isPwExsit(String pw){
//		String sql = "select * from musicuser where pw=?";
//		try{
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, pw);
//			rs= pstmt.executeQuery();
//			while(rs.next()){
//				return true;
//			}
//			return false;
//		}catch(SQLException e){
//			e.printStackTrace();
//			return true;
//		}
//	}
	
	public String getPw(String id, String phone){
		String sql = "select * from musicuser where id=?,phone=?";
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, phone);
			rs = pstmt.executeQuery();
			while(rs.next()){
				return rs.getString(2);
			}
		}catch(SQLException e){
			e.printStackTrace();
			
		}
		return null;
	}
}

