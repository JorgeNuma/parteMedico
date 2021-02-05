<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<%@ include file="head.jsp" %>  
<body>
	<%@ include file="cabecera.jsp" %>
	<h2>Reportes de Usuarios</h2>
	<hr />
	<table>
		 <!-- <tr>
			<th rowspan="2">Código</th>
			<th colspan="9">Usuario</th>
			<th rowspan="2">Hora de Reporte</th>
			<th rowspan="2">Hora Reporte</th>
			<th colspan="2">Longitud</th>
			<th rowspan="2">Observaciones</th>
			<th rowspan="2">Número de Tracking</th>
		</tr>-->
		<tr>
			<th>Código  </th>
			<th>Usuario </th>
			<th>Dni     </th>
			<th>Fecha Nacimiento   </th>
			<th>Hora Reporte</th>
			<th>Longitud</th>
			<th>Latitud</th>
			<th>Sistólica</th>
			<th>Diastólica</th>
			<th>Peso</th>
			<th>Numero de Pasos</th>
		</tr>
  		<c:forEach var="reportes" items="${reportesUsuarios}">
		<tr>
			<td>${reportes.codigo}</td>
			<td>${reportes.usuario.dni}</td>
			<td><fmt:formatDate value="${reportes.usuario.fechaNacimiento}"/></td>
			<td><fmt:formatDate value="${reportes.horaReporte}"/></td>
			<td>${reportes.longitud}</td>
			<td>${reportes.latitud}</td>
			<td>${reportes.sistolica}</td>
			<td>${reportes.diastolica}</td>
			<td>${reportes.peso}</td>
			<td>${reportes.numeroPasos}</td>
			
			
			
		</tr>
		</c:forEach>
	</table>
</body>
</html>