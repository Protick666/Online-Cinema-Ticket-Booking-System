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
        <title>Employee Page</title>
    </head>
    <body>
        <form action="E_tickets"> <%--it'll show the list 6--%>
                        <input type="submit" value="Tickets waiting for authorization">
        </form>	
        <form action="Movie_authorize"> <%--it'll show the list 6--%>
                        <input type="submit" value="Movie_authorize">
        </form>	
                        <div align="right">
        <form action="E_Logout"> <%--it'll show the login page 3--%>
			<input type="submit" value="Logout">			
	</form>
                        </div>
        
    </body>
</html>
