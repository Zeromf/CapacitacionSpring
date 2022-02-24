<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hemos llegado a la lista de futuro clientes!!

<table>

	<tr>
	
		<th>Nombre</th>
		<th>Apellido</th>
		<th>Email</th>
	
	</tr>

	<c:forEach var="clienteTemp" items="${clientes}"> 
	
	<tr>
		<td>${clienteTemp.nombre}ClientesTemp</td>
		<td>${clienteTemp.apellido}ClientesTemp</td>
		<td>${clienteTemp.email}ClientesTemp</td>
	
	
	</tr>
	
	
	</c:forEach>



</table>


</body>
</html>