<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<script> 
function validate()
{ 
     var username = document.form.username.value; 
     var password = document.form.password.value;
 
     if (username==null || username=="")
     { 
     alert("Username cannot be blank"); 
     return false; 
     }
     else if(password==null || password=="")
     { 
     alert("Password cannot be blank"); 
     return false; 
     } 
}
</script> 
 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        
    </head>
    <body>
        <center><img src="https://lh3.googleusercontent.com/ImBuZ0Ff5AsuBI2gciRbAtUD4akpC5ONqpV7QSXwCNp-zJE80YQilhVhNUmC4zj_ozZ0" width="20%" height="auto">
        <form name="form" action="LoginServlet" method="post" onsubmit="return validate()">           
            <table border="0" width="30%" cellpadding="3">
                <thead>
                    <tr>
                        <th colspan="2">Cop Login</th>
                    </tr>
                </thead> 
                <tbody>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="userName" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" value="" /></i></td>
                    </tr>
                    <tr>
                        <td><div class = "submit"><input type="submit" value="Login" /></div></td>
                    </tr>
                    <tr>
                        <td colspan="2"><div class = "register">New User >> <a href="register.jsp"><span style="font-size: 26px;">Register Here</span></a
                            ></div></td>
                    </tr>
                </tbody>
            </table>            
        </form>
    </center>
    </body>
</html>