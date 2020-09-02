package com.Virtusa.CopFriendlyApp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class violatorServelet extends HttpServlet {
 
     public violatorServelet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
         String Name = request.getParameter("name");
         String violationType= request.getParameter("violationType");
         String vehicleNumber = request.getParameter("vehicleNumber");
         String DrivingLicense = request.getParameter("DrivingLicense");
         String vehicleType = request.getParameter("vehicleType");
         String date = request.getParameter("date");
         String location = request.getParameter("location");
         String fine = request.getParameter("fine");
        
         
         
         ViolatorBean violatorBean = new ViolatorBean();
       
         violatorBean.setName(Name);
         violatorBean.setviolationType(violationType);
         violatorBean.setvehicleNumber(vehicleNumber);
         violatorBean.setDrivingLicense(DrivingLicense); 
         violatorBean.setvehicleType(vehicleType);
         violatorBean.setdate(date);
         violatorBean.setlocation(location);
         violatorBean.setfine(fine);
        
         
         ViolatorDao violatorDao = new ViolatorDao();
         
      
         String Violator = violatorDao.violatedPerson(violatorBean);
         
         if(Violator.equals("SUCCESS"))  
         {
            request.getRequestDispatcher("/Fine.jsp").forward(request, response);
         }
         else   
         {
            request.setAttribute("errMessage", Violator);
            request.getRequestDispatcher("/Home.jsp").forward(request, response);
         }
     }
}