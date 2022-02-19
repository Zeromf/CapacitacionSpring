<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de Registro</title>
</head>
<body>
	<form:form action="procesarFormulario" modelAttribute="elAlumno" >
	
		Nombre: <form:input path="nombre"/>
		<form:errors path="nombre" style="color:red"/>
		
		<br/><br/><br/>
		
		apellido: <form:input path="apellido" />
		<form:errors path="apellido" style="color:red"/>
		
		<br/><br/><br/>
		
		edad: <form:input path="edad" />
		<form:errors path="edad" style="color:blue"/>
		
		<br/><br/><br/>
		
		email: <form:input path="email" />
		<form:errors path="email" style="color:red"/>
		
		
		<br/><br/><br/>
		Codigo Postal: <form:input path="codigoPostal" />
		<form:errors path="codigoPostal" style="color:blue"/>
			
		<br/><br/><br/>
		
		
		Asignaturas:<br/>
		<form:select path="optativa" multiple="true">
		
			<form:option value="Diseño" label="Diseño"/>
			<form:option value="Karate" label="Karate"/>
			<form:option value="Matematicas" label="Matematicas"/>
			<form:option value="Ciencias" label="Ciencias"/>
		
		</form:select>
		<br/><br/><br/>
		
		
			Cordoba<form:radiobutton path="ciudadEstudios" value="Cordoba"/>
			BuenosAires<form:radiobutton path="ciudadEstudios" value="BuenosAires"/>
			Jujuy<form:radiobutton path="ciudadEstudios" value="Jujuy"/>
			Salta<form:radiobutton path="ciudadEstudios" value="Salta"/>
		
		<br/><br/><br/>
			Ingles<form:checkbox path="idiomasAlumno" value="Ingles"/>
			Frances<form:checkbox path="idiomasAlumno" value="Frances"/>
			Portugues<form:checkbox path="idiomasAlumno" value="Portugues"/>
			Aleman<form:checkbox path="idiomasAlumno" value="Aleman"/>
		
	
	
		<br/><br/><br/>
	
		<input type="submit" value="Enviar">
	
	</form:form>


</body>
</html>