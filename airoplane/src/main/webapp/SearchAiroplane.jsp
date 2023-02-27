<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				width="80" height="48">
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<form class="d-flex">
				<a href="index.jsp" class="form-control me-4">Home</a> <a
					href="airoplane" class="form-control me-4">Register</a>
			</form>
		</div>
	</nav>
	<h3 class="container-fluid">Airoplane Search</h3>

	<h3>
		<span style="color: red;">${message}</span>
	</h3>

	<form action="search" method="get" class="form-control-lg">

		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Search by
					Id</label>
			</div>
			<div class="col-auto">
				<input type="text" class="form-control" name="id">
			</div>
		</div>
		<input type="submit" value="Search" class="btn btn-outline-primary" />
	</form>

	<div>
		<h4>Search result:</h4>
		Airoplane Company: ${dto.company}<br> Airoplane Name: ${dto.name}<br>
		Airoplane Cost: ${dto.cost}<br> Airoplane Type: ${dto.type}<br>
		Airoplane Country: ${dto.country}
	</div>
</body>
</html>