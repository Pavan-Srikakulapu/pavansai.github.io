
package com.Virtusa.CopFriendlyApp;

import java.sql.Connection;
import java.sql.DriverManager;
 
public class ViolatorDBConnection {
 public static Connection createConnection()
 {
     Connection con = null;
     String url = "jdbc:mysql://localhost:3306/violater"; 
     String username = "root"; 
     String password = "17r01a0450"; 
     System.out.println("In ViolatorDBConnection.java class ");
      
     try
     {
         try
         {
            Class.forName("com.mysql.jdbc.Driver");
         } 
         catch (ClassNotFoundException e)
         {
            e.printStackTrace();
         }       
         con = DriverManager.getConnection(url, username, password); 
         System.out.println("Printing connection object "+con);
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }   
     return con; 
 }
}