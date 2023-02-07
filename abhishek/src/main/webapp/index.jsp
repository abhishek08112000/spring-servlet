<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<!-- <form class="d-flex">
				<a href="Casino.jsp" class="form-control me-2">Casino</a> <a
					href="Beach.jsp" class="form-control me-2">Beach</a>
			</form> -->

		</div>
	</nav>
	<h2>Welcome....</h2>

	<div class="container-fluid">
		<form action="email" method="get">
			<input type="submit" value="Submit" />
			<h6>My email id is : ${email}</h6>
		</form>


		<form action="mobile" method="get">
			<input type="submit" value="Submit" />
			<h6>My mobile no is : ${mobile}</h6>
		</form>

		<form action="adhar" method="get">
			<input type="submit" value="mobile" />
			<h6>My adhar no is : ${adhar}</h6>
		</form>

		<form action="age" method="get">
			<input type="submit" value="Age" />
			<h6>My age is : ${age}</h6>
		</form>


		<form action="dob" method="get">
			<input type="submit" value="DOB" />
			<h6>My DOB is : ${dob}</h6>
		</form>

		<form action="salary">
			<input type="submit" value="Salary" />
			<h6>My salary is : ${salary}</h6>
		</form>


		<form action="friends">
			<input type="submit" value="Best friends" />

			<h6>List of friends :</h6>
			<ul>
				<c:forEach items="${friends}" var="data">
					<li>${data}</li>
				</c:forEach>
			</ul>
		</form>

		<form action="place">
			<input type="submit" value="List of Places" />
			<h6>List of Places:</h6>
			<ul>
				<c:forEach items="${places}" var="place">
					<li>${place}</li>
				</c:forEach>
			</ul>
		</form>

		<form action="skills">
			<input type="submit" value="List of skills" />
			<h6>List of Skills:</h6>
			<ul>
				<c:forEach items="${skills}" var="skill">
					<li>${skill}</li>
				</c:forEach>
			</ul>
		</form>

		<form action="details">
			<input type="submit" value="Education" />
			<h6>Education details:</h6>
			<h6>schoolName: ${details.schoolName}</h6>
			<h6>schoolAddress: ${details.schoolAddress}</h6>
			<h6>sslcScore: ${details.sslcScore}</h6>
			<h6>diplomaCollegeName: ${details.diplomaCollegeName}</h6>
			<h6>collegeFees: ${details.collegeFees}</h6>
			<h6>collegeLocation: ${details.collegeLocation}</h6>
			<h6>aggregateInpercentage: ${details.aggregateInpercentage}</h6>
			<h6>degree: ${details.degree}</h6>
			<h6>collegeName: ${details.collegeName}</h6>
			<h6>location: ${details.location}</h6>
			<h6>cgpa: ${details.cgpa}</h6>
		</form>

		<form action="family">
			<input type="submit" value="Family" />
			<h6>Family details:</h6>
			<h6>fatherName: ${family.fatherName}</h6>
			<h6>motherName: ${family.motherName}</h6>
			<h6>fatherOccupation: ${family.fatherOccupation}</h6>
			<h6>noOfSiblings: ${family.noOfSiblings}</h6>
			<h6>sisterName: ${family.sisterName}</h6>
			<h6>brotherName: ${family.brotherName}</h6>
			<h6>monthlyIncome: ${family.monthlyIncome}</h6>
			<h6>motheroccupation: ${family.motheroccupation}</h6>
			<h6>noOfVehicles: ${family.noOfVehicles}</h6>
			<h6>location: ${family.location}</h6>
		</form>

		<form action="mobileDTO">
			<input type="submit" value="Mobile Details" />
			<h6>Mobile details:</h6>
			<h6>brandName: ${mobileDTO.brandName}</h6>
			<h6>modelName: ${mobileDTO.modelName}</h6>
			<h6>price: ${mobileDTO.price}</h6>
			<h6>colour: ${mobileDTO.colour}</h6>
			<h6>isWithCamera: ${mobileDTO.isWithCamera}</h6>
		</form>
		
		<form action="drink">
		<input type="submit" value="Bevarage"/>
		<h6>Bevarage: </h6>
		<h6>brandName: ${coldDrink.brandName}</h6>
		<h6>bevarageName: ${coldDrink.bevarageName}</h6>
		<h6>mfgDate: ${coldDrink.mfgDate}</h6>
		<h6>expiryDate: ${coldDrink.expiryDate}</h6>
		<h6>price: ${coldDrink.price}</h6>
		<h6>avalaibleIn: ${coldDrink.avalaibleIn}</h6>
		<h6>milkContentInGm: ${coldDrink.milkContentInGm}</h6>
		<h6>sugarContentInGm: ${coldDrink.sugarContentInGm}</h6>
		</form>
		
		<form action="chat">
		<input type="submit" value="Chat Details"/>
		<h6>ChatDTO</h6>
		<h6>chatShopName: ${chat.chatShopName}</h6>
		<h6>chatName: ${chat.chatName}</h6>
		<h6>noOfPiece: ${chat.noOfPiece}</h6>
		<h6>ingredient1: ${chat.ingredient1}</h6>
		<h6>ingredient2: ${chat.ingredient2}</h6>
		<h6>ingredient3: ${chat.ingredient3}</h6>
		<h6>ingredient4: ${chat.ingredient4}</h6>
		<h6>ingredient5: ${chat.ingredient5}</h6>
		<h6>ingredient6: ${chat.ingredient6}</h6>
		<h6>ingredient7: ${chat.ingredient7}</h6>
		<h6>price: ${chat.price}</h6>
		</form>

	</div>
</body>
</html>