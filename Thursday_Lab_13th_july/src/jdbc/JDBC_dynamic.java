package jdbc;

// import for program
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC_dynamic extends Thread {
	static Scanner sc = new Scanner(System.in);
	char repeat;

	// all data store in private variables to
	private final String driver = "com.mysql.cj.jdbc.Driver";
	private final String db_con = "jdbc:mysql://localhost:3306/jdbclab";
	private final String user = "root";
	private final String password = "root";

	public static void main(String[] args) {
		JDBC_dynamic obj = new JDBC_dynamic();

		obj.sleep_time();

		System.out.println(".....................Database connected successfully.....................\n");

		obj.sleep_time();

		int choice;
		char char1;

//		perform all CRUD operation using do while loop
		do {

			System.out.println("1. Insert data\n2. Show data\n3. Update data\n4. Delete data\n5. Show All tables");
			System.out.println("\nEnter number from (1 to 5):- ");

			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("\n=========================Insertion operation========================");
				obj.insert_data();
				System.out.println("\n====================================================================");
				break;
			}
			case 2: {
				System.out.println("\n=========================Show table data========================");
				obj.show_table_data();
				System.out.println("\n====================================================================");
				break;
			}
			case 3: {
				System.out.println("\n=========================Update operation========================");
				obj.update_data();
				System.out.println("\n====================================================================");
				break;
			}
			case 4: {
				System.out.println("\n=========================Delete operation========================");
				obj.delete_data();
				System.out.println("\n====================================================================");
				break;
			}
			case 5: {
				System.out.println(
						"\n========================= All Tables from database 'jdbclab' ========================");
				obj.show_tables();
				System.out.println("\n====================================================================");
				break;
			}
			}

			// condition for repeat process.
			System.out.println("\nDo you want perform another operation...(y / n): ");
			char1 = sc.next().charAt(0);

		} while (char1 == 'y' || char1 == 'Y');

	}

	// for delay process
	public void sleep_time() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// for insertion of data in table
	public void insert_data() {

		// do while to insert row atleast one row
		do {

			try {
				// connect databasea and driver
				Class.forName(driver);
				Connection con = DriverManager.getConnection(db_con, user, password);

				// Construct the SQL query with the table name
				String qur = "insert into product value(?, ?, ?, ?, ?)";
				PreparedStatement st = con.prepareStatement(qur);

				// row values from user
				System.out.println("enter product id:- ");
				int p_id = sc.nextInt();

				System.out.println("enter product name:- ");
				String p_name = sc.next();

				System.out.println("enter product quantity:- ");
				int qun = sc.nextInt();

				System.out.println("enter product price:- ");
				int price = sc.nextInt();

				System.out.println("enter product category:- ");
				String cate = sc.next();

				// set user values in query
				st.setInt(1, p_id);
				st.setString(2, p_name);
				st.setInt(3, qun);
				st.setInt(4, price);
				st.setString(5, cate);

				// to execute qur
				int count = st.executeUpdate();

				if (count > 0) {
					System.out.println("Data inserted.....");
				} else {
					System.out.println("error...");
				}

				// close reference
				st.close();
				con.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("\ndo you want add more rows (type y / n):- ");
			repeat = sc.next().charAt(0);

		} while (repeat == 'Y' || repeat == 'y');

	}

	// for fetching table values (shoe table value)
	public void show_table_data() {
		try {
			// connect databasea and driver
			Class.forName(driver);
			Connection con = DriverManager.getConnection(db_con, user, password);

			// row values from user
			System.out.println("Enter table name: ");
			String tablename = sc.next();

			// Construct the SQL query with the table name
			String query = "SELECT * FROM " + tablename;
			PreparedStatement pt = con.prepareStatement(query);

			// to execute qur
			ResultSet rs = pt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " || " + rs.getString(2) + " || " + rs.getInt(3) + " || "
						+ rs.getInt(4) + " || " + rs.getString(5));
			}

			// Close resources
			rs.close();
			pt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// update row
	public void update_data() {
		try {
			// connect databasea and driver
			Class.forName(driver);
			Connection con = DriverManager.getConnection(db_con, user, password);

			// Construct the SQL query with the table name
			String query = "UPDATE product SET p_name = ?, qun=?, price=?, cate=? WHERE p_id = ?";
			PreparedStatement pt = con.prepareStatement(query);

			// row values from user
			System.out.println("Enter product id where you want update: ");
			int p_id = sc.nextInt();

			System.out.println("Enter new name: ");
			String p_name = sc.next();

			System.out.println("Enter new quantity of product: ");
			int qun = sc.nextInt();

			System.out.println("Enter product price: ");
			int price = sc.nextInt();

			System.out.println("Enter product category: ");
			String cate = sc.next();

			// set user values in query
			pt.setString(1, p_name);
			pt.setInt(2, qun);
			pt.setInt(3, price);
			pt.setString(4, cate);
			pt.setInt(5, p_id);

			// to execute qur
			int count = pt.executeUpdate();

			if (count > 0) {
				System.out.println("Data updated......");
			} else {
				System.out.println("No rows updated or an error occurred.");
			}

			// Close resources
			pt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// delete row
	public void delete_data() {
		try {
			// connect databasea and driver
			Class.forName(driver);
			Connection con = DriverManager.getConnection(db_con, user, password);

			// Construct the SQL query with the table name
			String query = "delete from product WHERE p_id = ?";
			PreparedStatement pt = con.prepareStatement(query);

			// row values from user
			System.out.println("Enter product id which you want delete: ");
			int p_id = sc.nextInt();

			// set user values in query
			pt.setInt(1, p_id);

			// to execute qur
			int count = pt.executeUpdate();

			if (count > 0) {
				System.out.println("Data deleted.");
			} else {
				System.out.println("No rows updated or an error occurred.");
			}

			// Close resources
			pt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// fetching all tables from database
	public void show_tables() {
		try {
			// connect databasea and driver
			Class.forName(driver);
			Connection con = DriverManager.getConnection(db_con, user, password);

			// Construct the SQL query with the table name
			String query = "SHOW TABLES";
			PreparedStatement pt = con.prepareStatement(query);

			// to execute qur
			ResultSet rs = pt.executeQuery();
			int count = 1;
			while (rs.next()) {
				System.out.println(count + ") " + rs.getString(1));
				count++;
			}

			// Close resources
			rs.close();
			pt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
