<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Emergency here</title>
</head>
<body>
		 <form name="form" action="EmergencyServelet" method="post" onsubmit="return validate()">
        <center><div class = "reghere">Emergency Registration</div></center>
        <table align="center" cellpadding="5">
         <tr>
         <td>Name</td>
         <td><input type="text" name="name" /></td>
         </tr>
         <tr>
         <td>accident type</td>
         <td><input type="text" name="accidentType" /></td>
         </tr>
         <tr>
         <td>location</td>
         <td><input type="text" name="location" /></td>
         </tr>
         <td>No_of_people_injured</td>
         <td><input type="text" name="NoOfPeopleInjured" /></td>
         </tr>
         <tr>
         <td><input type="submit" name="SOS" value="SOS"/><a href="action.jsp"></a></td>
         </tr>
         
         
   

</body>
</html>