package com.Virtusa.CopFriendlyApp;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LoginServlet extends HttpServlet {
 
    public LoginServlet() 
    {
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
       
 
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
 
        LoginBean loginBean = new LoginBean(); 
        loginBean.setUserName(userName); 
         loginBean.setPassword(password);
 
        LoginDao loginDao = new LoginDao(); 
 
        String userValidate = loginDao.authenticateUser(loginBean);  
        if(userValidate.equals("SUCCESS")) 
         {
             request.setAttribute("userName", userName); 
             request.getRequestDispatcher("/Home.jsp").forward(request, response);
         }
         else
         {
             request.setAttribute("errMessage", userValidate); 
             request.getRequestDispatcher("/Login.jsp").forward(request, response);
             }
    }
}