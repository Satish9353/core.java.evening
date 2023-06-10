<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
	integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
	integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
	crossorigin="anonymous"></script>
<style>
body {
	background-color: skyblue
}
</style>

</head>
<body>
	<nav class="navbar  bg-dark navbar-dark">
		<div class="container-fluid">
			<span class="navbar-brand mb-0 h1">X-workz</span>
		</div>
		<div>
			<a href="list">List Of Donors</a>
		</div>
	</nav>

	<h1>-:Blood Donation Form:-</h1>

	<c:forEach items="${error}" var="errors">
		<span style="color: red;">${errors.defaultMessage}</span>
		</br>
	</c:forEach>

	<span style="color: green;">${sucessMsg}</span>

	<form action="donate" method="post" enctype="multipart/form-data">
		<pre>
		<div>
  <a href="donation2.jsp">View Image</a>
			</div>
Name:<input type="text" name="name"><br><br>
Address:<textarea rows="3" cols="30" name="address"></textarea>
			<br>
Age:<input type="number" name="age"><br><br>
Weight:<input type="number" name="weight"><br><br>
BloodGroup:<select name="bloodGroup"></br>
			<br>
<option value=" ">Select</option>
				<br>
<option>A+</option>
<option>A-</option>
<option>B+</option>
<option>B-</option>
<option>AB+</option>
<option>AB-</option>
<option>O+</option>
<option>O-</option>
</select><br>
select file : <input type="file" name="file"><br>
<input type="submit" value="Save">
</pre>
	</form>

</body>
</html>