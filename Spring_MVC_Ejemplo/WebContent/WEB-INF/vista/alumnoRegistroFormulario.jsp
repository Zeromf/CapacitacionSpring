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
		
		<br/><br/><br/>
		
		apellido: <form:input path="apellido"/>
		
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