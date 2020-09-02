<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fine</title>
</head>
<body>
	<p>added to data base succesfully</p>

</body>
</html>
-->
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "violater";
String userid = "root";
String password = "17r01a0450";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Fine</title>
    <style type="text/css">
        table { border: 0; }
        table td { padding: 10px; }
    </style>
</head>
<body>
<div align="center">
    <h1>Reciept</h1>
    <br/>
    <form action="authorize_payment" method="post">
<table align="center">
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="SELECT * FROM violater ORDER BY Id DESC LIMIT 1";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
 <tr> <td><b>name:</b><td><%=resultSet.getString("Name") %></td></tr>
<tr><td><b>violationType:</b></td><td><%=resultSet.getString("violationType") %></td></tr>
<tr><td><b>vehicleNumber:</b></td><td><%=resultSet.getString("vehicleNumber") %></td></tr>
<tr><td><b>DrivingLicense:</b></td><td><%=resultSet.getString("DrivingLicense") %></td></tr>
<tr><td><b>vehicleType:</b></td><td><%=resultSet.getString("vehicleType") %></td></tr>
<tr><td><b>date:</b></td><td><%=resultSet.getString("date") %></td></tr>
<tr><td><b>location:</b></td><td><%=resultSet.getString("location") %></td></tr>
<tr><td><b>Fine:</b></td><td><%=resultSet.getString("fine") %></td></tr>
   
 <%
    }
 } catch (Exception e) {
e.printStackTrace();
}
%>
</table>

	<a href="Home.jsp">click here to continue</a>
    </form>
</div>
</body>
</html>