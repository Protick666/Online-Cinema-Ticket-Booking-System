<%-- 
    Document   : Movies
    Created on : Dec 4, 2016, 12:54:16 AM
    Author     : hp
--%>

<%@page import="org.w3c.dom.Document"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ch01.MovieTime"%>
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
        
        
        <font color="black" style="font-size:20px">
	<TABLE id="dataTable" width="1150px" height="50px" border="1">
            <caption> Available Movies</caption>
            <tr>
                <th> Movie_name </th>
                <th> Genre </th>
                <th> Movie_Length </th>
                <th> Date </th>
                <th> Start_time </th>
                <th> Hall_type </th>
                <th> Price </th>
                <th> Booking</th>
            <tr/>
            <form action="Booking">
            <% 
            
            ArrayList<MovieTime> transactions = (ArrayList<MovieTime>) session.getAttribute("transactions");
            if(transactions==null)
            {
                out.println("");
            }
            else if(transactions.size()==0)
            {
                out.println("No Available Movie For Your Selected Date");
            }
            else 
            {session.setAttribute("ope",transactions);
                //out.println("<table>");
                //out.println("<hr><td>Sl.</td><td>Amount</td><td>Datetime</td></tr>");
                int count=0;
                for(MovieTime trans: transactions)
                {
                    count++;
                    out.println("<tr>");
  
                    out.println( String.format("<td>%s</td><td>%s</td><td>%d mins</td><td>%s</td><td>%s</td><td>%s</td><td>%d</td>", trans.movie_name, trans.genre, trans.length,trans.date,trans.start_time,trans.hall_type,trans.price) );
                    //out.println("<input type=\"hidden\" id=\"dd\" name=\"prod\" value=\"\"/>");
                    //session.setAttribute("flag", trans.movie_name);
                    //session.setAttribute("operation", trans.hall_type);
                    
                   
                    out.println("<td><input type=\"submit\" value=\"BOOK\"></td>");
                    //out.println("");
                    out.println("</tr>");
                }
                out.println("</table>");
            }
        %>
            
            </form>
	</TABLE>
                
                
    </body>
</html>
