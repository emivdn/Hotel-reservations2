<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Clienti</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#stergeClient").hide();
		$("#modificaClient").hide();
		$("#update").click(function() {
			$("#modificaClient").show();
			$("#stergeClient").hide();
		});
		$("#delete").click(function() {
			$("#stergeClient").show();
			$("#modificaClient").hide();
		});
	});
</script>
</head>
<body>
	<h1 align="center">Tabela Clienti:</h1>
	<table border="1" align="center">
		<tr>
			<td><b>IdClient:</b></td>
			<td><b>Nume:</b></td>
			<td><b>Prenume:</b></td>
			<td><b>Email:</b></td>
			<td><b>Numar telefon:</b></td>
			<td><b>Data check-in:</b></td>
			<td><b>Data check-out:</b></td>
		</tr>
		<c:forEach var="clienti" items="${listaClienti}">
			<tr>
				<td>${clienti.idclient}</td>
				<td>${clienti.nume}</td>
				<td>${clienti.prenume}</td>
				<td>${clienti.email}</td>
				<td>${clienti.nrtelefon}</td>
				<td>${clienti.datacheckin}</td>
				<td>${clienti.datacheckout}</td>
			</tr>
		</c:forEach>
	</table>
	<form action="ClientiController" method="POST">
		<p align="center">
			Modifica: <input type="checkbox" id="update"> Sterge: <input
				type="checkbox" id="delete"
				onclick="document.getElementById('nume').disabled = this.checked; document.getElementById('prenume').disabled = this.checked; document.getElementById('email').disabled = this.checked; document.getElementById('nrtelefon').disabled = this.checked; document.getElementById('datacheckin').disabled = this.checked; document.getElementById('datacheckout').disabled = this.checked;"><br>
			<br> <select name="idclient">
				<c:forEach items="${listaClienti}" var="clienti">
					<option value="${clienti.idclient}">${clienti.idclient}</option>
				</c:forEach>
			</select> <br> <br> Modifica Nume: <input id="nume" type="text"
				name="nume"><br> <br> Modifica Prenume: <input
				id="prenume" type="text" name="prenume"> <br> <br>
			Modifica Email: <input id="email" type="text" name="email">
			<br> <br>
			Modifica Numar de telefon: <input
				id="nrtelefon" type="text" name="nrtelefon"> <br> <br>
				Modifica Data check-in: <input
				id="datacheckin" type="text" name="datacheckin"> <br> <br>
				Modifica Data check-out: <input
				id="datacheckout" type="text" name="datacheckout"> <br> <br>
			<button type="submit" id="modificaClient" name="modificaClient">
				Modifica</button>
			<br> <br>
			<button type="submit" id="stergeClient" name="stergeClient">
				Sterge</button>
		</p>
	</form>
	<p align="center">
		<a href="index.html"><b>Home</b></a>
	</p>
</body>
</html>