<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<%@include file="head.jsp" %>
<body>
	<%@include file="cabecera.jsp" %>
	
	<table class="table">
	  <thead class="thead-dark">
	    <tr>
	      <th scope="col">Codigo</th>
	      <th scope="col">Usuario</th>
	      <th scope="col">Diastolica</th>
	      <th scope="col">Sistolica</th>
	      <th scope="col">Latitud</th>
	      <th scope="col">Longitud</th>
	      <th scope="col">Numero de pasos</th>
	      <th scope="col">Peso</th>
	      <th scope="col">Hora de reporte</th>
	    </tr>
	  </thead>
	  <tbody>
	    <c:forEach var="reporte" items="${reportes}">
	     	<tr>
		      <th scope="row">${reporte.codigo}</th>
		      <td>
		      	<ul class="list-group list-group-flush">
				  <li class="list-group-item">${reporte.usuario.dni}</li>
				  <li class="list-group-item">${reporte.usuario.nombre} ${reporte.usuario.apellido1} ${reporte.usuario.apellido2}</li>
				  <li class="list-group-item"><fmt:formatDate pattern="dd/MM/yyyy" value="${reporte.usuario.fechaNacimiento}" /></li>
				  <li class="list-group-item">${reporte.usuario.sexo}</li>
				  <li class="list-group-item">${reporte.usuario.altura} cm</li>
				  <li class="list-group-item">${reporte.usuario.observaciones}</li>
				</ul>
			  </td>
		      <td>${reporte.diastolica}</td>
		      <td>${reporte.sistolica}</td>
		      <td>${reporte.latitud}</td>
		      <td>${reporte.longitud}</td>
		      <td>${reporte.numeroPasos}</td>
		      <td>${reporte.peso}</td>
		      <td><fmt:formatDate pattern="dd/MM/yyyy HH:mm" value="${reporte.horaReporte}" /></td>
	    	</tr>
	    </c:forEach>

	  </tbody>
	</table>

	
	
	
	<%@include file="jquery.jsp" %>
</body>
</html>