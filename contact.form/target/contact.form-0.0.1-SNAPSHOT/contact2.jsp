<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
	
</head>
</head>
<style>
body {
	background-color: lightgreen;
}
.forms{
width:500px;
height:500px;
margin:auto;
}

</style>
<body>
<nav class="navbar  bg-dark navbar-dark">
		<div class="container-fluid">
			<span class="navbar-brand mb-0 h1">X-Workz</span>
		</div>
	</nav>
	<h2 style="text-align: center; color: orange">-:Downloading
		Image:-</h2>
	<br>
  <div class="forms">
	<form action="filedownload" method="get">
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">File Name:</label>
			<input type="text" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" name="fileName">
			
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">ContentType:</label>
			<input type="text" class="form-control" id="exampleInputPassword1"
				name="contentType">
		</div>

		<button type="submit" class="btn btn-primary">Download</button>
		 
	</form>
</div>
</body>
</html>