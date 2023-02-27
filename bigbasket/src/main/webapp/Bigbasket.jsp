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

	<h3 class="container-fluid">Welcome to BigBasket</h3>
	
	<c:forEach items="${error}" var="e">
		<span style="color: red;">${e.message}</span>
	</c:forEach>

	<form action="bigbasket" method="post" class="form-control-lg">
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Owner
					Name</label>
			</div>
			<div class="col-auto">
				<input type="text" id="inputPassword6" class="form-control"
					aria-describedby="passwordHelpInline" name="ownerName"
					value="${dto.ownerName}">
			</div>
		</div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Owner
					Mobile No</label>
			</div>
			<div class="col-auto">
				<input type="text" id="inputPassword6" class="form-control"
					aria-describedby="passwordHelpInline" name="mobileNo"
					value="${dto.mobileNo}">
			</div>
		</div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">No of
					employees</label>
			</div>
			<div class="col-auto">
				<input type="text" id="inputPassword6" class="form-control"
					aria-describedby="passwordHelpInline" name="noOfEmployees"
					value="${dto.noOfEmployees}">
			</div>
		</div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Email</label>
			</div>
			<div class="col-auto">
				<input type="ema" id="inputPassword6" class="form-control"
					aria-describedby="passwordHelpInline" name="email"
					value="${dto.email}">
			</div>
		</div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Password</label>
			</div>
			<div class="col-auto">
				<input type="text" id="inputPassword6" class="form-control"
					aria-describedby="passwordHelpInline" name="password"
					value="${dto.password}">
			</div>
		</div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Shop name</label>
			</div>
			<div class="col-auto">
				<input type="text" id="inputPassword6" class="form-control"
					aria-describedby="passwordHelpInline" name="shopName"
					value="${dto.shopName}">
			</div>
		</div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Area</label>
			</div>
			<div class="col-auto">
				<select name="area">
					<option value="">Select</option>
					<c:forEach items="${areas}" var="a">
						<option value="${a}">${a}</option>
					</c:forEach>
				</select>>
			</div>
		</div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Item</label>
			</div>
			<div class="col-auto">
				<select name="item">
					<option value="">Select</option>
					<c:forEach items="${items}" var="p">
						<option value="${p}">${p}</option>
					</c:forEach>
				</select>>
			</div>
		</div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Price</label>
			</div>
			<div class="col-auto">
				<input type="text" id="inputPassword6" class="form-control"
					aria-describedby="passwordHelpInline" name="price"
					value="${dto.price}">
			</div>
		</div>
		<div class="row g-3 align-items-center">
			<div>
				<label>Security</label><br> <label style="margin-left: 80px">Yes</label>
				<input type="radio" value="true" class="form-check-input"
					name="security" /><br> <label style="margin-left: 80px">No</label>
				<input type="radio" value="false" class="form-check-input"
					name="security" />
			</div>
		</div>
		<input type="submit" value="Save" class="btn btn-outline-primary" />
	</form>

</body>
</html>