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
        <title>User Page</title>
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
                <tr><td>Set your preferred date.</tr>
                <%--<tr><td>Day&emsp;: <input type="number" name="dd" min="1" max="31">
                <tr><td>Month : <input type="number" name="mm" min="1" max="12">
                <tr><td>Year  : <input type="number" name="yy" min="2016" max="2017"></td>--%>
                <form action="Movies">
                <tr><td>Date : <input type="date" name="da"></td></tr>
                <tr><td> &emsp;    </td></tr> 
                <tr><td> <input type="submit" value="See List" style="height:50px; width:170px">
                </form>
            </table>
            </font>
        </div>
       
       
        
    </body>
</html>
