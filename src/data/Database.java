package data;
import java.sql.*;

public class Database {
    
    
   public static Connection getConnection(){
   try{
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/dipti","root","");
       System.out.println("Database Connected Successfully");
       return con;
   }catch(SQLException ex){
       System.out.println("Database Connection Failed");
       return null;
   }
   }
}
