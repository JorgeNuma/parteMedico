<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@include file="head.jsp" %>
<body>
<%@include file="cabecera.jsp" %>

<form action="/alta-usuarios" method="post">
	<table>
		<tr>
			<td>DNI: </td>
			<td><input type="text" name="dni" size="9"></td>
		</tr>
		<tr>
		<td>Nombre: </td>
		<td><input type="text" name="nombre" size="40"></td>
		</tr>
		<tr>
		<td>Primer apellido:</td>
		<td> <input type="text" name="apellido1" size="40"></td>
		</tr>
		<tr>
		<td>Segundo apellido:</td>
		<td> <input type="text" name="apellido2" size="40"></td>
		</tr>
		<tr>
		<td>Sexo:</td>
			<td>
				<input type="radio" name="sexo" value="HOMBRE">Hombre
				<input type="radio" name="sexo" value="MUJER">Mujer
			</td>
		</tr>
		<tr>
			<td>Fecha Nacimiento:</td>
			<td> <input type="Date" name="fechaNacimiento"></td>
		</tr>
		<tr>
			<td>Altura:</td>
			<td> <input type="number" name="altura" ></td>
		</tr>
		<tr>
			<td>Observaciones: </td>
			<td><textarea rows="4" cols="40" name="observaciones" size="400"></textarea></td>
		</tr>
		<tr>
			<td><input type="submit" value="Crear"></td>
			<td></td>
		</tr>
		
</table>
</form>

</body>
</html>