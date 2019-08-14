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
            <font color="blue" size="20">Online Cinema booking
        </div>
        <div align="left"><font color="black" style="font-size:20px">
            <%
                String s=(String) session.getAttribute("username");
                session.setAttribute("username", s);
                out.println(String.format("%s",s));
            %>
            <table>
                <form action="employ1"> 
                <tr>
                    <td><input type="submit" value="SEE shows" style="height:70px; width:270px">
                </form>
                
                <td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                <td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                <form action="Logout"> 
                    <td><input type="submit" value="Logout" style="height:70px; width:270px">
                </tr>
                </form>
                
            </table>
            </font>
            <br><br><font color="blue" style="font-size: 24px">Add New Show.<br>
            <font color="black" style="font-size: 24px">
             <form action="employ2">
                    <%
                        
                        session.setAttribute("username", s);
                    %>
                        <table>
                            <tr><td>Date : <input type="date" name="da"></td></tr>
                            <tr>
                            <tr>
                                <td>Movie ID	
                                <td><input type="text" name="a"/><br>		
                            </tr>
                            <tr>
                                <td>Movie Name
                                <td><input type="text" name="b"/><br>
                            </tr>
                            <tr>
                                <td>Genre
                                <td><input type="text" name="c"/><br>
                            </tr>
                            <tr>
                                <td>Length 
                                <td><input type="text" name="d"/><br>
                            </tr>
                            <tr>
                                <td>Start time
                                <td><input type="text" name="e"/><br>
                            </tr>
                            <tr>
                                <td>Show ID
                                <td><input type="text" name="f" /></td>
                            </tr>
                            <tr>
                                <td>Hall No
                                <td><input type="text" name="g" /></td>
                            </tr>
                        </table>
                        
                            <input type="submit" value="Add" style="height:50px; width:170px"></form>
        </div>
       
       
        
    </body>
</html>
