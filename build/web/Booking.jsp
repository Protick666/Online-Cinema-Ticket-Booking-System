<%-- 
    Document   : Booking
    Created on : Dec 5, 2016, 9:48:20 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
            <font color="blue" size="20">Online Cinema Booking System
        </div>
        <div align="left"><font color="black" style="font-size:20px">
            <table>
                <form action="myfirstservlet"> 
                <tr>
                    <td><input type="submit" value="Movies" style="height:70px; width:270px">
                </form>
                <form action="Tickets"> 
                    <td><input type="submit" value="Tickets" style="height:70px; width:270px">
                </form>	
                <td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                <td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                <form action="Logout"> 
                    <td><input type="submit" value="Logout" style="height:70px; width:270px">
                </tr>
                </form>
            </table>
            </font>
        </div>
        
        
        <font style="font-size: 20px" color="black">
        <table>
        <%--    <tr><td>Hall Type</td><td></td></tr>
        
        Hall_type:Premium<br>
        <tr><td>Date</td><td></td><br>--%>
        <tr><td>Select Hall</td>
        No. of Tickets <input type="number" name="quantity" min="1" max="5"><br>
        <%--Seat Arrangement:<br>
        <INPUT type="checkbox" name="A1"/>A1&emsp;
        <INPUT type="checkbox" name="A2"/>A2<br>--%>
        <form action="Tickets">
        <INPUT type="submit" value="Buy" style="font-size:20px"/><br>
        </form>
        </table>
    </body>
</html>
