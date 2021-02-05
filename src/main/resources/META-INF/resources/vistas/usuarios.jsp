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
	      <th scope="col">DNI</th>
	      <th scope="col">Nombre y Apellidos</th>
	      <th scope="col">Fecha de nacimiento</th>
	      <th scope="col">Sexo</th>
	      <th scope="col">Altura</th>
	      <th scope="col">Observaciones</th>
	    </tr>
	  </thead>
	  <tbody>
	    <c:forEach var="usuario" items="${usuarios}">
	     	<tr>
		      <th scope="row">${usuario.dni}</th>
		      <td>${usuario.nombre} ${usuario.apellido1} ${usuario.apellido2}</td>
		      <td><fmt:formatDate pattern="dd/MM/yyyy" value="${usuario.fechaNacimiento}" /></td>
		      <td>${usuario.sexo}</td>
		      <td>${usuario.altura}</td>
		      <td>${usuario.observaciones}</td>
	    	</tr>
	    </c:forEach>
		<%@include file="jquery.jsp" %>
</body>
</html>