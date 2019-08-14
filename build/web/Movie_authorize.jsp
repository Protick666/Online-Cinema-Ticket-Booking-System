<%-- 
    Document   : Movies
    Created on : Dec 4, 2016, 12:54:16 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <SCRIPT language="javascript">
		function addRow(tableID) {

			var table = document.getElementById(tableID);

			var rowCount = table.rows.length;
			var row = table.insertRow(rowCount);

			var cell1 = row.insertCell(0);
			var element1 = document.createElement("input");
			element1.type = "checkbox";
			element1.name="chkbox[]";
			cell1.appendChild(element1);

			var cell2 = row.insertCell(1);
			cell2.innerHTML = rowCount + 1;

			var cell3 = row.insertCell(2);
			var element2 = document.createElement("input");
			element2.type = "text";
			element2.name = "txtbox[]";
			cell3.appendChild(element2);


		}

		function deleteRow(tableID) {
			try {
			var table = document.getElementById(tableID);
			var rowCount = table.rows.length;

			for(var i=0; i<rowCount; i++) {
				var row = table.rows[i];
				var chkbox = row.cells[0].childNodes[0];
				if(null != chkbox && true == chkbox.checked) {
					table.deleteRow(i);
					rowCount--;
					i--;
				}


			}
			}catch(e) {
				alert(e);
			}
		}

	</SCRIPT>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%-- will change according to own query 
        <sql:query var="listUsers"   dataSource="${myDS}">   
            SELECT * FROM users;
        </sql:query> --%>
    
    
        <INPUT type="button" value="Add Row" onclick="addRow('dataTable')" />

	<INPUT type="button" value="Delete Row" onclick="deleteRow('dataTable')" />

	<TABLE id="dataTable" width="1050px" border="1">
                
		<TR>
			<TD><INPUT type="checkbox" name="chk"/></TD>
			<TD> Argo </TD>
			<TD> Drama </TD>
                        <td> 60 mins </td>
                        <TD> 17-12-2016 </TD>
			<TD> 9-30 AM</TD>
                        <td> Regular </td>
                        <TD> 450 tk. </TD>
			<TD> 1234</TD>
                        <td> 545 </td>
                       
		</TR>
	</TABLE>
                
                
    </body>
</html>
