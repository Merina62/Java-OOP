
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class local {

		static final String DB_URL="jdbc:mysql://localhost";
	    static final String USER="root";
	    static final String PASS="";
	   
	    
	    public static void main(String[] args) {
	        try(Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
	                Statement stmt=conn.createStatement();
	){
	String sql="Create Database Tutorial";
	        	stmt.executeUpdate(sql);
	            System.out.println("Table Created Successfully");
	        }catch(SQLException e) {
	            e.printStackTrace();
	        }
	}
	}