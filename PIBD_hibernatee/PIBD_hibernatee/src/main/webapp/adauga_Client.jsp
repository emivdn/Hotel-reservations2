<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Clienti</title>
</head>
<body>
	<div id="add">
		<h1>Adauga client</h1>
		<form action="ClientiController" method="GET">
			<table>
				<tr>
					<td>Nume client:</td>
					<td><input type="text" name="nume"></td>
				</tr>
				<tr>
					<td>Prenume client:</td>
					<td><input type="text" name="prenume"></td>
				</tr>
				<tr>
					<td>Email client:</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>Numar de telefon:</td>
					<td><input type="text" name="nrtelefon"></td>
				</tr>
				<tr>
					<td>Data check-in:</td>
					<td><input type="text" name="datacheckin"></td>
				</tr>
				<tr>
					<td>Data check-out:</td>
					<td><input type="text" name="datacheckout"></td>
				</tr>
				<tr>
					<td><input type="submit" name="adaugaClient" value="Adauga"></td>
				</tr>
			</table>
		</form>
	</div>
	<form action="ClientiController" method="POST">
		<input type="submit" name="afiseazaClient" value="Afiseaza">
		&nbsp; &nbsp;<br>
	</form>
	<br>
	<a href="index.html"><b>Home</b></a>
</body>
</html>