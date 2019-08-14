<%-- 
    Document   : myfirstJSP
    Created on : Dec 2, 2016, 1:46:42 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Login</title>
    </head>
    <body>
        <form action="EmployeeServlet">
            <div align="center">
                <font color="blue" size="20">Online Cinema Booking System
            </div>
            &emsp14;&emsp14;&emsp14;&emsp14;&emsp14;&emsp14;&emsp14;&emsp14;&emsp14;&emsp14;
                &emsp14;&emsp14;
                        <font color="black" style="font-size: 24px">Sign In.
                        UserName 	
			<input type="text" name="un"/>
			Password
                        <input type="text" name="pw"/>     
                        <input type="submit" value="Login" style="height:25px; width:50px"><br/>			
		</form>
        
    </body>
</html>
