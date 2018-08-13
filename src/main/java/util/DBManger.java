package util;
import java.sql.*;

public class DBManger {
	static String url="jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
    static String user="root";
    static String password="sasa";
    static String serverTimezone ="GMT";
    static{
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
    
	public static Connection getConnection()throws SQLException{
		
		
		Connection con=DriverManager.getConnection(url,user,password);
		return con;
		
		
	}
	public static void dbClose1(Statement st,Connection con){
		if(st!=null){
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void dbClose(ResultSet rs,Statement st,Connection con){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		dbClose1(st,con);
	}
}
