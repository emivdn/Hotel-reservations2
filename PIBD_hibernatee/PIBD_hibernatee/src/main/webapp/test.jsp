<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript"
	src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
<script type="text/javascript"
	src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<link
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
	rel="stylesheet" type="text/css">
<title>Camere</title>
</head>
<body>
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h2 contenteditable="true" class="text-justify">Adaugati o
						noua camera</h2>
				</div>
			</div>
		</div>
	</div>
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<form role="form" action="CamereController" method="GET">
						<div class="form-group">
							<label class="control-label">tipcamera</label> <input
								class="form-control" name="tipcamera"
								placeholder="Introduceti tipul camerei" type="text">
						</div>
						<div class="form-group">
							<label class="control-label">capacitate</label> <input
								class="form-control" name="capacitate"
								placeholder="Introduceti capacitatea" type="text">
						</div>
						<div class="form-group">
							<label class="control-label">pretnoapte</label> <input
								class="form-control" name="pretnoapte"
								placeholder="Introduceti pretul pe noapte" type="text">
						</div>
						<div class="form-group">
							<label class="control-label">disponibilitate</label> <input
								class="form-control" name="disponibilitate"
								placeholder="Introduceti disponibilitatea camerei" type="text">
						</div>
						<div class="form-group">
							<label class="control-label">facilitati</label> <input
								class="form-control" name="facilitati"
								placeholder="Introduceti facilitatile" type="text">
						</div>
						<div class="form-group">
							<label class="control-label">dataultimeicuratari</label> <input
								class="form-control" name="dataultimeicuratari"
								placeholder="Introduceti data ultimei curatari" type="text">
						</div>
						<input type="submit" class="btn btn-default" name="adaugaCamera"
							value="Adauga">
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<form role="form" action="CamereController" method="POST">
						<div class="form-group">
							<label class="control-label">Vizualizati datele din
								tabela Camere</label><br> <input type="submit"
								class="btn btn-default" name="afiseazaCamera" value="Afiseaza">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
