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
	<div id="add">
		<h1>Adauga un nou hotel</h1>
		<form action="HoteluriController" method="GET">
			<table>
				<tr>
					<td>Camera:</td>
					<td><select name="idcamera">
							<c:forEach items="${listaCamere}" var="camere">
								<option value="${camere.idcamera}">${camere.idcamera},
									${camere.tipcamera}, ${camere.capacitate},
									${camere.pretnoapte}, ${camere.disponibilitate},
									${camere.facilitati}, ${camere.dataultimeicuratari}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>Client:</td>
					<td><select name="idclient">
							<c:forEach items="${listaClienti}" var="clienti">
								<option value="${clienti.idclient}">${clienti.idclient},
									${clienti.nume}, ${clienti.prenume}, ${clienti.email},
									${clienti.nrtelefon}, ${clienti.datacheckin},
									${clienti.datacheckout}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>Nume hotel:</td>
					<td><input type="text" name="numehotel"></td>
				</tr>
				<tr>
					<td>Oras:</td>
					<td><input type="text" name="oras"></td>
				</tr>
				<tr>
					<td>Numar de stele:</td>
					<td><input type="text" name="nrstele"></td>
				</tr>
				<tr>
					<td>Animale de companie:</td>
					<td><input type="text" name="animaledecompanie"></td>
				</tr>
				<tr>
					<td><input type="submit" name="adaugaHotel"
						value="Adauga"></td>
				</tr>
			</table>
		</form>
	</div>
	<form action="HoteluriController" method="POST">
		<input type="submit" name="afiseazaHotel" value="Afiseaza">
		&nbsp; &nbsp;<br>
	</form>
	<br>
	<a href="index.html"><b>Home</b></a>
</body>
</html>