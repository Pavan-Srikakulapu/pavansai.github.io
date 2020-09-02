package com.Virtusa.CopFriendlyApp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmergencyServelet extends HttpServlet {
 
     public EmergencyServelet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
         String Name = request.getParameter("name");
         String accidentType= request.getParameter("accidentType");
         String location = request.getParameter("location");
         String NoOfPeopleInjured = request.getParameter("NoOfPeopleInjured");
         
         EmergencyBean EmergencyBean = new EmergencyBean();
       
         EmergencyBean.setName(Name);
         EmergencyBean.setAccidentType(accidentType);
         EmergencyBean.setLocation(location);
         EmergencyBean.setNoOfPeopleInjured(NoOfPeopleInjured); 
         
         
         EmergencyDao EmergencyDao = new EmergencyDao();
         
      
         String Emergency = EmergencyDao.EmergencyPerson(EmergencyBean);
         
         if(Emergency.equals("SUCCESS"))  
         {
            request.getRequestDispatcher("/action.jsp").forward(request, response);
         }
         else   
         {
            request.setAttribute("errMessage", Emergency);
            request.getRequestDispatcher("/Home.jsp").forward(request, response);
         }
     }
}