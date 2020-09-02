package com.Virtusa.CopFriendlyApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class EmergencyDao { 
     public  String EmergencyPerson(EmergencyBean EmergencyBean)
     {
         
         String Name = EmergencyBean.getName();
         String accidentType = EmergencyBean.getAccidentType();
         String location = EmergencyBean.getLocation();
         String NoOfPeopleInjured = EmergencyBean.getNoOfPeopleInjured(); 
         
         Connection con = null;
         PreparedStatement preparedStatement = null;         
         try
         {
             con = EmergencyDBConnection.createConnection();
             String query = "insert into emergency(id,Name,accidentType,location,NoOfPeopleInjured) values (NULL,?,?,?,?)"; 
             preparedStatement = con.prepareStatement(query); 
             preparedStatement.setString(1, Name);
             preparedStatement.setString(2, accidentType);
             preparedStatement.setString(3, location);
             preparedStatement.setString(4, NoOfPeopleInjured);
             
             
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
