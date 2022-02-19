<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmacion de registro</title>
</head>
<body>


El alumno con nombre: <strong>${elAlumno.nombre}</strong> y apellido : <strong>${elAlumno.apellido}</strong> y edad
<strong>${elAlumno.edad}</strong> , E-mail <strong>${elAlumno.email}</strong>y Codigo postal es :
<strong>${elAlumno.codigoPostal}</strong> se ha registrado con exito
La asignatura elegida es: <strong>${elAlumno.optativa}</strong>
<br/>
La provincia donde iniciara los estudios ${elAlumno.nombre} es: ${elAlumno.ciudadEstudios}
<br/>
Los idiomas elegidos por el alumno son: ${elAlumno.idiomasAlumno}
<br/>



</body>
</html>