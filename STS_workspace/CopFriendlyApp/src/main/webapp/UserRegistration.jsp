<%@ page import="java.sql.*"%>
<%
    String userName = request.getParameter("userName");   
    String password = request.getParameter("password");
    String fullName = request.getParameter("fullname");
    String email = request.getParameter("email");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee",
            "root", "17r01a0450");
    Statement st = con.createStatement();
    int i = st.executeUpdate("insert into USER(full_name,  email, username, password, regdate) values ('" + fullName + "','" + email + "','" + userName + "','" + password + "', CURDATE())");
    if (i > 0) {
        response.sendRedirect("welcome.jsp");
        
    } else {
        response.sendRedirect("Login.jsp");
    }
%>