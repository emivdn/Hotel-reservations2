<%@page import="DAOImpl.CamereDaoImpl"%>
<%@page import="DAOImpl.ClientiDaoImpl"%>
<%@page import="pojo.Camere"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pojo.Clienti"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hoteluri</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#stergeHotel").hide();
		$("#modificaHotel").hide();
		$("#update").click(function() {
			$("#modificaHotel").show();
			$("#stergeHotel").hide();
		});
		$("#delete").click(function() {
			$("#stergeHotel").show();
			$("#modificaHotel").hide();
		});
	});
</script>
</head>
<body>
	<%
	CamereDaoImpl cameraDaoImpl = new CamereDaoImpl();
	ClientiDaoImpl clientDaoImpl = new ClientiDaoImpl();
	List<Camere> listaCamere = new ArrayList();
	listaCamere = cameraDaoImpl.afiseazaCamera();
	List<Clienti> listaClienti = new ArrayList();
	listaClienti = clientDaoImpl.afiseazaClient();
	request.setAttribute("listaCamere", listaCamere);
	request.setAttribute("listaClienti", listaClienti);
	%>
	<h1 align="center">Tabela Hoteluri:</h1>
	<table border="1" align="center">
		<tr>
			<td><b>IdHotel:</b></td>
			<td><b>IdCamera:</b></td>
			<td><b>Tip camera:</b></td>
			<td><b>Capacitate camera:</b></td>
			<td><b>Pret pe noapte:</b></td>
			<td><b>Disponibilitate:</b></td>
			<td><b>Facilitati:</b></td>
			<td><b>Data ultimei curatari:</b></td>
			<td><b>IdClient:</b></td>
			<td><b>Nume:</b></td>
			<td><b>Prenume:</b></td>
			<td><b>Email:</b></td>
			<td><b>Numar telefon:</b></td>
			<td><b>Data check-in:</b></td>
			<td><b>Data check-out:</b></td>
			<td><b>Nume hotel:</b></td>
			<td><b>Oras:</b></td>
			<td><b>Numar de stele:</b></td>
			<td><b>Animale de companie:</b></td>
		</tr>
		<c:forEach var="hoteluri" items="${listaHotel}">
			<tr>
				<td>${hoteluri.idhotel}</td>
				<td>${hoteluri.camere.idcamera}</td>
				<td>${hoteluri.camere.tipcamera}</td>
				<td>${hoteluri.camere.capacitate}</td>
				<td>${hoteluri.camere.pretnoapte}</td>
				<td>${hoteluri.camere.disponibilitate}</td>
				<td>${hoteluri.camere.facilitati}</td>
				<td>${hoteluri.camere.dataultimeicuratari}</td>
				<td>${hoteluri.clienti.idclient}</td>
				<td>${hoteluri.clienti.nume}</td>
				<td>${hoteluri.clienti.prenume}</td>
				<td>${hoteluri.clienti.email}</td>
				<td>${hoteluri.clienti.nrtelefon}</td>
				<td>${hoteluri.clienti.datacheckin}</td>
				<td>${hoteluri.clienti.datacheckout}</td>
				<td>${hoteluri.numehotel}</td>
				<td>${hoteluri.oras}</td>
				<td>${hoteluri.nrstele}</td>
				<td>${hoteluri.animaledecompanie}</td>
			</tr>
		</c:forEach>
	</table>
	<form action="HoteluriController" method="POST">
		<p align="center">
			Modifica: <input type="checkbox" id="update"> Sterge: <input
				type="checkbox" id="delete"
				onclick="document.getElementById('idcamera').disabled = this.checked; document.getElementById('idclient').disabled = this.checked; document.getElementById('numehotel').disabled = this.checked; document.getElementById('oras').disabled = this.checked; document.getElementById('nrstele').disabled = this.checked; document.getElementById('animaledecompanie').disabled = this.checked;"><br>
			<br> idhotel: <select name="idhotel">
				<c:forEach items="${listaHotel}" var="hoteluri">
					<option value="${hoteluri.idhotel}">${hoteluri.idhotel}</option>
				</c:forEach>
			</select> <br> <br> idcamera: <select name="idcamera">
				<c:forEach items="${listaCamere}" var="camere">
					<option value="${camere.idcamera}">${camere.idcamera},
						${camere.tipcamera}, ${camere.capacitate}, ${camere.pretnoapte}, ${camere.disponibilitate}, ${camere.facilitati}, ${camere.dataultimeicuratari}</option>
				</c:forEach>
			</select> <br> <br> idclient: <select name="idclient">
				<c:forEach items="${listaClienti}" var="clienti">
					<option value="${clienti.idclient}">${clienti.idclient},
						${clienti.nume}, ${clienti.prenume}, ${clienti.email}, ${clienti.nrtelefon}, ${clienti.datacheckin}, ${clienti.datacheckout}</option>
				</c:forEach>
			</select> <br> <br> Modifica numele hotelului: <input id="numehotel"
				type="text" name="numehotel"><br> <br>
			Modifica orasul: <input id="oras" type="text"
				name="oras"> <br> <br> Modifica numarul de stele:
			<input id="nrstele" type="text" name="nrstele"> <br> <br>
			 Modifica animale de companie:
			<input id="animaledecompanie" type="text" name="animaledecompanie"> <br> <br>
			<button type="submit" id="modificaHotel"
				name="modificaHotel">Modifica</button>
			<br> <br>
			<button type="submit" id="stergeHotel" name="stergeHotel">
				Sterge</button>
		</p>
	</form>
	<br>
	<p align="center">
		<a href="index.html"><b>Home</b></a>
	</p>
</body>
</html>