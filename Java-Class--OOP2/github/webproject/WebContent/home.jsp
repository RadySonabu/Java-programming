<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>

<p>
<h1>
TGIT
</h1>
</p>

<form actions = "StudentServlet" method = "post">

<table>
	<tr>
		<td> Student Information Form
			
		</td>
	</tr>
	<tr>
		<td>
		Program ID: 
		</td>
		<td><input type = "text" name = "program_id"/></td>
	</tr>
	<tr>
		<td>
		Contact number: 
		</td>
		<td><input type = "text" name = "contact_number"/></td>
	</tr>
	<tr>
		<td>
		firstname: 
		</td>
		<td><input type = "text" name = "firstname"/></td>
	</tr>
	<tr>
		<td>lastname:</td>
		<td><input type = "text" name = "lastname"/></td>
		<td>
		<input type = "button" name = "submit" value = "Register"/>
		</td>
	</tr>
	
</table>
</form>
</body>
</html>