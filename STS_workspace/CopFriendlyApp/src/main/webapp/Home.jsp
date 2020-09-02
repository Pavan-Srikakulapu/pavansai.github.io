<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Home Page</title>
</head>
<body>
 Welcome <%=request.getAttribute("userName") %> 
 <div style="text-align: right"><a href="LogoutServlet">Logout</a></div>
    <form class = "copform" name="form" action="violatorServelet" method="post">
      <table cellpadding="5">
      <b><div class = "heading">Home Page</div></b>
         <tr>
         <td>Name</td>
         <td><input type="text" name="name" /></td>
         </tr>
         <tr>
         <td>Violation type</td>
         <td>
            <select id = "type" name = "violationType">
               <option value="license" />No License</option>
               <option value="rc" />No R.C.</option>
               <option value="insurance" />No Insurance</option>
               <option value="pollution" />No Pollution Check</option>
               <option value="rash_driving" />Rash Driving</option>
               <option value="wrong_route" />No License</option>
            </select>
         </td>
          </tr>
          <tr>
         <td>Fine</td>
         <td><input type="number" name="fine"/></td>
         </tr>
         
         </tr>
          <tr>
         <td>Vehicle Number</td>
         <td><input type="text" name="vehicleNumber" /></td>
         </tr>
         <tr>
         <td>Driving_License</td>
         <td><input type="text" name="DrivingLicense" /></td>
         </tr>
         <tr>
         <td>vehicle_type</td>
         <td>
            <select id = "type" name = "vehicleType">
               <option value="bike" />Bike</option>
               <option value="car" />Car</option>
               <option value="lorry" />Lorry</option>
               <option value="taxi" />Taxi</option>
               <option value="private_taxi" />Private Taxi</option>
            </select>
         </td>
         </tr>
         <tr>
         <td>Date</td>
         <td><input type="date" name="date" min="2020-08-20"/></td>
         </tr>
         <tr>
         <td>Location</td>
         <td><input type="text" name="location" /></td>
         </tr>
         <!-- <tr>
        <td>Repeated Offender</td>
         <td><input type="text" name="name" /></td>
         </tr>
         <tr>
         <td>Others</td>
         <td><input type="text" name="name" /></td>
         </tr>-->
         <tr>
         <!-- <td>Submit</td> -->
         <td><input type="submit" value="submit" /></td>
         
        <tr>
             <td colspan="2"><div class = "register"> <a href="Emergency.jsp"><span style="font-size: 26px;">Emergency Register Here</span></a></div></td>
        </tr>
        </table>
    </form>
</body>
</html>
</body>
</html>