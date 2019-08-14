<%-- 
    Document   : E_tickets
    Created on : Dec 5, 2016, 10:44:53 PM
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
        <INPUT type="button" value="Authorize" onclick="deleteRow('dataTabl')" />
        <TABLE id="dataTabl" width="1150px" height="50px" border="1">
            <tr>
                <th> Payment </th>
                <th> User_id </th>
                <th> User_E-mail </th>
                <th> Show_id </th>
                <th> Date </th>
                <th> Seat No. </th>
                <th> Hall_type </th>
                <th> Hall_no </th>
            </tr>
            <TR>
                <TD> <INPUT type="checkbox" name="chk"/> </TD>
		<TD>123</TD>
		<TD> is@gmail.com </TD>
		<TD> 122 </TD>
                <TD>16-12-2016</TD>
                <TD> A1 </TD>
		<TD> Premium </TD>
                <TD>2</TD>  
	    </TR>
            
	</TABLE>
    </body>
</html>
