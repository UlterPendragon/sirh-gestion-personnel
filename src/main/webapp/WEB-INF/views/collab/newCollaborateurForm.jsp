<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>SGP - App</title>

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.3.1-dist/css/bootstrap.css">

</head>

<body>

	<div class="header">

		<h1 class="jumbotron">Nouveau collaborateur</h1>

	</div>

	<div class="container">

		<form  class="post" method="post">

			<div class="row">

				<div class="col-sm-4">Nom</div>

				<div class="col-sm-8">

					<input id="nom" name="nom" type="text" class="form-control"
						required="">


				</div>

			</div>

			<br>

			<div class="row">

				<div class="col-sm-4">Prénom</div>

				<div class="col-sm-8">

					<input id="prenom" name="prenom" type="text" name="inputPrenom"
						class="form-control" required="">

				</div>

			</div>

			<br>

			<div class="row">

				<div class="col-sm-4">Date de Naissance</div>

				<div class="col-sm-8">
					<input id="birthdate" name="birthdate" type="date"
						class="form-control" required="">
				</div>

			</div>

			<br>

			<div class="row">

				<div class="col-sm-4">Adresse</div>

				<div class="col-sm-8">

					<textarea id="adresse" name="adresse" class="form-control" rows="3"
						required=""></textarea>

				</div>

			</div>

			<br>

			<div class="row">

				<div class="col-sm-4">Numéro de sécurité sociale</div>

				<div class="col-sm-8">

					<input id="numSecuSociale" name="numSecuSociale" type="text"
						maxlength="15" class="form-control" required="">

				</div>
			</div>

			<br>

			<div class="row">

				<div class="col-sm-11"></div>

				<div class="col-sm-1">

					<input type="submit" value="Créer"
						class="btn btn-success float-right">

				</div>

			</div>

		</form>

	</div>

</body>

</html>