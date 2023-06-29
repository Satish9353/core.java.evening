<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"rel="stylesheet"></link>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
<style>
table{
background-color:skyblue;
margin: auto;

}
</style>
</head>
<body>
	<table class="table">
<tr>
<th>Name</th>
<th>Email</th>
<th>Mobile_No</th>
<th>Comments</th>
<th>Data</th>
</tr>

<c:forEach items="${dtos}" var="dto">
<tr>
<td>${dto.name}</td>
<td>${dto.email}</td>
<td>${dto.mobile_No}</td>
<td>${dto.comments}</td>
<td><a target="_blank" href="filedownload?fileName=${dto.files}&contentType=${dto.contentType}"> ${dto.files}</a></td>

</tr>
</c:forEach>
</table>
</body>
</html>