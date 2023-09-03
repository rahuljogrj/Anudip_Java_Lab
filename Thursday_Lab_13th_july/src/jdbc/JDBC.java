package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) {
		JDBC obj = new JDBC();
		obj.connect_db();
//		obj.update_data();
//		obj.delete_data();

	}

	public void connect_db() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip1", "root", "root");
			System.out.println("connected........\n");
			
			Statement st = con.createStatement();
			String qur = "select * from anudip";
			ResultSet rs = st.executeQuery(qur);
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" and "+ rs.getString(2));
			}
			
			st.close();
			con.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public void update_data() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip1", "root", "root");
			
			Statement st = con.createStatement();
			String qur ="update anudip set name ='akki jog' where name='deepak jog' ";
			int count = st.executeUpdate(qur);
			
			if(count>0) {
				System.out.println("updated....\n");
				connect_db();
				
			}
			else {
				System.out.println("error...");
			}
			
			st.close();
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void delete_data() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip1", "root", "root");
			
			Statement st = con.createStatement();
			String qur ="delete from anudip where name='akki jog' ";
			int count = st.executeUpdate(qur);
			
			if(count>0) {
				System.out.println("deleted ....\n");
				connect_db();
				
			}
			else {
				System.out.println("error...");
			}
			
			st.close();
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}