<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@include file="head.jsp" %>
<body>
<%@include file="cabecera.jsp" %>

<form action="/alta-reportes" method="post">
	<table>
		<tr>
			<td>Dni:</td>
			<td><input type="text" name="dniUsuario" size="9"></td>
		</tr>
		<tr>
			<td>Longitud:</td>
			<td><input type="text" name="longitud" size="20"></td>
		</tr>
		<tr>
			<td>latitud:</td>
			<td><input type="text" name="latitud" size="20"></td>
		</tr>
		<tr>
			<td>Diastólica:</td>
			<td><input type="number" name="diastolica" step="any"></td>
		</tr>
		<tr>
			<td>Sistólica:</td>
			<td><input type="number" name="sistolica" step="any"></td>
		</tr>
		<tr>
			<td>Peso:</td>
			<td><input type="number" name="peso" step="any" placeholder="Kg"></td>
		</tr>
		<tr>
			<td>Número de pasos:</td>
			<td><input type="number" name="numeroPasos"></td>
		</tr>
		<tr>
			<td><input type="submit" value="Crear"></td>
			<td></td>
		</tr>
</table>
</form>

</body>
</html>