<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Camere</title>
</head>
<body>
	<div id="add">
		<h1>Adauga camera</h1>
		<form action="CamereController" method="GET">
			<table>
				<tr>
					<td>Tip Camera:</td>
					<td><input type="text" name="tipcamera"></td>
				</tr>
				<tr>
					<td>Capacitate camera:</td>
					<td><input type="text" name="capacitate"></td>
				</tr>
				<tr>
					<td>Pret pe noapte:</td>
					<td><input type="text" name="pretnoapte"></td>
				</tr>
				<tr>
					<td>Disponibilitate camera:</td>
					<td><input type="text" name="disponibilitate"></td>
				</tr>
				<tr>
					<td>Facilitati camera:</td>
					<td><input type="text" name="facilitati"></td>
				</tr>
				<tr>
					<td>Data ultimei curatari:</td>
					<td><input type="text" name="dataultimeicuratari"></td>
				</tr>
				<tr>
					<td><input type="submit" name="adaugaCamera" value="Adauga"></td>
				</tr>
			</table>
		</form>
	</div>
	<form action="CamereController" method="POST">
		<input type="submit" name="afiseazaCamera" value="Afiseaza">
		&nbsp; &nbsp;<br>
	</form>
	<br>
	<a href="index.html"><b>Home</b></a>
</body>
</html>