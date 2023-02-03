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

			<div class="d-flex">
				<a href="index.jsp" class="form-control me-2">Home</a>
			</div>
		</div>
	</nav>
	<h4>Send candidate details</h4>
	
	
	<form action="attend" method="post" class="form-control-lg ">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Candidate Name</label> <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="Enter your name"
				name="name">
		</div>
		<div>
			<label for="exampleFormControlInput2" class="form-label">Company Name</label> <select class="form-select" name="type" aria-label="Default select example">
				<option selected>Select Company</option >
				<option value="X-workz-Raj">X-workz-Raj</option>
				<option value="X-workz-Btm">X-workz-Btm</option>
				<option value="X-workz">X-workz</option>
			</select>
		</div>

		<div class="mb-3">
			<label for="exampleFormControlInput2" class="form-label">Role</label> 
			<input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="Enter the Role"
				name="role">
		</div>
		<input type="submit" value="Send" class="btn btn-dark"/>
	</form>

</body>
</html>