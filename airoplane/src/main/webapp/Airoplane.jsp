<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
				<a href="index.jsp" class="form-control me-4">Home</a>
			</form>
		</div>
	</nav>
	<h3 class="container-fluid">Enter the data</h3>
	<c:forEach items="${error}" var="e">
		<span style="color: red;">${e.message}</span>
	</c:forEach>
	<h3>
		<span style="color: red;">${message}</span>
	</h3>

	<form action="airoplane" class="form-control-lg" method="post">
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Company</label>
			</div>
			<div class="col-auto">
				<input type="text" id="inputPassword6" class="form-control"
					aria-describedby="passwordHelpInline" name="company"
					value="${dto.company}">
			</div>
		</div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Airoplane
					name</label>
			</div>
			<div class="col-auto">
				<input type="text" id="inputPassword6" class="form-control"
					aria-describedby="passwordHelpInline" name="name"
					value="${dto.name}">
			</div>
		</div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Airoplane
					cost</label>
			</div>
			<div class="col-auto">
				<input type="text" id="inputPassword6" class="form-control"
					aria-describedby="passwordHelpInline" name="cost"
					value="${dto.cost}">
			</div>
		</div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Airoplane
					type</label>
			</div>
			<div class="col-auto">
				<select name="type">
					<option value="">Select</option>
					<c:forEach items="${type}" var="t">
						<option value="${t}">${t}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Airoplane
					country</label>
			</div>
			<div class="col-auto">
				<select name="country">
					<option value="">Select</option>
					<c:forEach items="${country}" var="c">
						<option value="${c}">${c}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<input type="submit" value="Save" class="btn btn-outline-primary" />
	</form>

</body>
</html>