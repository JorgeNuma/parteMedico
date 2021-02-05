<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@include file="head.jsp" %>
<body>
<%@include file="cabecera.jsp" %>

<form action="/partemedico/alta-reportes" method="post" class=" p-3">
	<div class="form-group">
	  <label for="dniUsuario">Dni</label>
	  <input type="text" class="form-control w-50" name="dniUsuario" size="9">
	</div>
	<div class="form-row">

	 <div class="form-group col-md-6">
	   <label for="longitud">Longitud:</label>
	   <input type="text" class="form-control" name="longitud" size="20">
	 </div>
	
	 <div class="form-group  col-md-6">
	   <label for="latitud">Latitud:</label>
	   <input type="text" class="form-control" name="latitud" size="20">
	 </div>
	</div>
	<div class="form-row">
	<div class="form-group col-md-6">
	  <label for="diastolica">Diastólica:</label>
	  <input type="number" class="form-control" name="diastolica" step="any">
	</div>
	<div class="form-group col-md-6">
	  <label for="sistolica">Sistólica:</label>
	  <input type="number" class="form-control" name="sistolica" step="any">
	</div>
	</div>
	<div class="form-group">
	  <label for="peso">Peso:</label>
	  <input type="number" class="form-control w-50" name="peso" step="any" placeholder="Kg">
	</div>
	<div class="form-group">
	  <label for="numeroPasos">Número de pasos:</label>
	  <input type="number" class="form-control w-50" name="numeroPasos">
	</div>
	<div class="form-group">
	  <input type="submit" class="btn btn-primary" value="Crear">
	</div>
</form>

	<%@include file="jquery.jsp" %>
</body>
</html>