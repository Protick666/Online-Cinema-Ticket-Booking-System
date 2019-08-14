<%-- 
    Document   : Tickets
    Created on : Dec 5, 2016, 10:35:25 PM
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
                <form action="myservlet"> 
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
        <font color="black" style="font-size: 20px">
        <div align="center">
        <table border="1">
            <caption>Waiting for Authorization<br></caption>
            <tr>
                <th> Ticket No </th>
                <th> Hall No. </th>
                <%--<th> Seat No. </th>--%>
                <th> Movie Name </th>
                <th> Date </th>
                <th> Start_time </th>
                <th> Hall_type </th>
                <th> Price </th>
            <tr/>
            
        </table>
            <br>
        <table border="1">
            <caption>Bought Tickets<br></caption>
            <tr>
                <th> Ticket No. </th>
                <th> Hall No. </th>
                <th> Movie Name </th>
                <th> Date </th>
                <th> Start_time </th>
                <th> Hall_type </th>
                <th> Price </th>
            <tr/>
            
        </table>
        </div>
    </body>
</html>
