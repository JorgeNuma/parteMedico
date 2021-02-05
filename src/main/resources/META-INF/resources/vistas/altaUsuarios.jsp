<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@include file="head.jsp" %>
<body>
<%@include file="cabecera.jsp" %>

<form action="/partemedico/alta-usuarios" method="post" class="p-3">
	<div class="form-group">
	  <label for="dni">DNI:</label>
	  <input type="text" class="form-control w-50"  name="dni" size="9">
	</div>
	<div class="form-row">
		<div class="form-group col-md-4">
		  <label for="nombre">Nombre:</label>
		  <input type="text" class="form-control" name="nombre" size="40">
		</div>
		<div class="form-group col-md-4">
		  <label for="apellido1">Primer apellido:</label>
		  <input type="text" class="form-control" name="apellido1" size="40">
		</div>
		<div class="form-group col-md-4">
		  <label for="apellido2">Segundo apellido:</label>
		  <input type="text" class="form-control" name="apellido2" size="40">
		</div>
	</div>
	<div class="form-row">
		
	    <div class="form-group col-md-4">
	    <span>Sexo:</span>
	    <div class="col-sm-10">
	        <div class="form-check">
	        	
	          <input class="form-check-input" type="radio" name="sexo" value="HOMBRE" checked>
	          <label class="form-check-label" for="sexo">
	            Hombre
	          </label>
	        </div>
	        <div class="form-check">
	          <input class="form-check-input" type="radio" name="sexo" value="MUJER">
	          <label class="form-check-label" for="sexo">
	            Mujer
	          </label>
	          </div>
	      </div>
	    </div>
		<div class="form-group col-md-4">
			<label for="observaciones">Fecha Nacimiento: </label>
			<input type="Date" class="form-control" name="fechaNacimiento"  >
		</div>
		<div class="form-group col-md-4">
			<label for="altura">Altura:</label>
			<input type="number" class="form-control" name="altura" >
		</div>
	</div>
	<div class="form-group">
		<label for="observaciones">Observaciones: </label>
		<textarea rows="4" cols="40"  name="observaciones" class="form-control"></textarea>
	</div>
	<div class="form-group">
		<input type="submit" class="btn btn-primary"  value="Crear">
	</div>			
</form>

</body>
</html>