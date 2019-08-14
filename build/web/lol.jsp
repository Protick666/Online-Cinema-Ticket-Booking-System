<%-- 
    Document   : Movies
    Created on : Dec 4, 2016, 12:54:16 AM
    Author     : hp
--%>

<%@page import="org.w3c.dom.Document"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ch01.employtime"%>
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
        
        
        <td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                <td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
        <font color="black" style="font-size:20px">
	<TABLE id="dataTable" width="1150px" height="50px" border="1">
            <caption> All Employee list(including you) </caption>
            <tr>
                <th> Username </th>
                <th> Password </th>
                <th> First_name </th>
                <th> Last_name </th>
                <th> JOB_TYPE </th>
                
            <tr/>
            <form action="Booking">
            <% 
            
            ArrayList<employtime> transactions = (ArrayList<employtime>) session.getAttribute("transactions");
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
                for(employtime trans: transactions)
                {
                    count++;
                    out.println("<tr>");
  
                    out.println( String.format("<td>%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td>", trans.user_name, trans.pass, trans.first_name,trans.last_name,trans.job_type) );
                    //out.println("<input type=\"hidden\" id=\"dd\" name=\"prod\" value=\"\"/>");
                    //session.setAttribute("flag", trans.movie_name);
                    //session.setAttribute("operation", trans.hall_type);
                    
                   
                    
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
