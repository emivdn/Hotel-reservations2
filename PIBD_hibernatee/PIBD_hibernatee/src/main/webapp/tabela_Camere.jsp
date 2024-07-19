<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Camere</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#stergeCamera").hide();
		$("#modificaCamera").hide();
		$("#update").click(function() {
			$("#modificaCamera").show();
			$("#stergeCamera").hide();
		});
		$("#delete").click(function() {
			$("#stergeCamera").show();
			$("#modificaCamera").hide();
		});
	});
</script>
</head>
<body>
	<h1 align="center">Tabela Camere:</h1>
	<table border="1" align="center">
		<tr>
			<td><b>IdCamera:</b></td>
			<td><b>Tip camera:</b></td>
			<td><b>Capacitate camera:</b></td>
			<td><b>Pret pe noapte:</b></td>
			<td><b>Disponibilitate:</b></td>
			<td><b>Facilitati:</b></td>
			<td><b>Data ultimei curatari:</b></td>
		</tr>
		<c:forEach var="camere" items="${listaCamere}">
			<tr>
				<td>${camere.idcamera}</td>
				<td>${camere.tipcamera}</td>
				<td>${camere.capacitate}</td>
				<td>${camere.pretnoapte}</td>
				<td>${camere.disponibilitate}</td>
				<td>${camere.facilitati}</td>
				<td>${camere.dataultimeicuratari}</td>
			</tr>
		</c:forEach>
	</table>
	<form action="CamereController" method="POST">
		<p align="center">
			Modifica: <input type="checkbox" id="update"> Sterge: <input
				type="checkbox" id="delete"
				onclick="document.getElementById('tipcamera').disabled = this.checked; document.getElementById('capacitate').disabled = this.checked; document.getElementById('pretnoapte').disabled = this.checked; document.getElementById('disponibilitate').disabled = this.checked; document.getElementById('facilitati').disabled = this.checked; document.getElementById('dataultimeicuratari').disabled = this.checked;"><br>
			<br> <select name="idcamera">
				<c:forEach items="${listaCamere}" var="camere">
					<option value="${camere.idcamera}">${camere.idcamera}</option>
				</c:forEach>
			</select> <br> <br> Modifica Tipul camerei: <input id="tipcamera"
				type="text" name="tipcamera"><br> <br> Modifica
			Capacitatea camerei: <input id="capacitate" type="text"
				name="capacitate"> <br> <br> Modifica Pretul pe
			noapte: <input id="pretnoapte" type="text" name="pretnoapte">
			<br> <br> Modifica Disponibilitatea camerei: <input
				id="disponibilitate" type="text" name="disponibilitate"> <br>
			<br> Modifica Facilitatile camerei: <input id="facilitati"
				type="text" name="facilitati"> <br> <br>
			Modifica Data ultimei curatari: <input id="dataultimeicuratari" type="text"
				name="dataultimeicuratari"> <br> <br>

			<button type="submit" id="modificaCamera" name="modificaCamera">
				Modifica</button>
			<br> <br>
			<button type="submit" id="stergeCamera" name="stergeCamera">
				Sterge</button>
		</p>
	</form>
	<p align="center">
		<a href="index.html"><b>Home</b></a>
	</p>
</body>
</html>