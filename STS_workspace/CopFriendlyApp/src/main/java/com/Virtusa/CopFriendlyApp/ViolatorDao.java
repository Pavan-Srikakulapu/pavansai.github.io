package com.Virtusa.CopFriendlyApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ViolatorDao { 
     public  String violatedPerson(ViolatorBean violatorBean)
     {
         
         String Name = violatorBean.getName();
         String violationType = violatorBean.getviolationType();
         String vehicleNumber = violatorBean.getvehicleNumber();
         String DrivingLicense = violatorBean.getDrivingLicense(); 
         String vehicleType = violatorBean.getvehicleType();
         String date = violatorBean.getdate();
         String location = violatorBean.getlocation();
         String fine = violatorBean.getfine();
         
         Connection con = null;
         PreparedStatement preparedStatement = null;         
         try
         {
             con = ViolatorDBConnection.createConnection();
             String query = "insert into violater(id,Name,violationType,vehicleNumber,DrivingLicense,vehicleType,date,location,fine) values (NULL,?,?,?,?,?,?,?,?)"; 
             preparedStatement = con.prepareStatement(query); 
             preparedStatement.setString(1, Name);
             preparedStatement.setString(2, violationType);
             preparedStatement.setString(3, vehicleNumber);
             preparedStatement.setString(4, DrivingLicense);
             preparedStatement.setString(5, vehicleType);
             preparedStatement.setString(6, date);
             preparedStatement.setString(7, location);
             preparedStatement.setString(8, fine);
             
             
             int i= preparedStatement.executeUpdate();
             
             if (i!=0)  
             return "SUCCESS"; 
         }
         catch(SQLException e)
         {
            e.printStackTrace();
         }       
         return "Oops.. Something went wrong there..!";  
     }
}
