<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X- Workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<nav class="navbar  bg-dark navbar-dark">
  <div class="container-fluid">
    <span class="navbar-brand mb-0 h1">X-workz</span>
  </div>
</nav>
</head>
<body>
	<h1>-:Contact Form:-</h1>

<c:forEach items="${error}" var="errors">
<span style="color: red;">${errors.defaultMessage}</span></br>
</c:forEach>

<span style="color: green;">${sucessMsg}</span>

<form action = "contact" method="post" enctype="multipart/form-data">


<pre>
<nav class="navbar  bg-dark navbar-dark">
	
  <div class="container-fluid">
    <span class="navbar-brand mb-0 h1">X-workz</span>
  </div>
 </nav> 
Name:<input type="text" name="name" value=$(dto.name)><br>
Email:<input type="text" name="email" value=$(dto.email)><br><br>
Mobile_No:<input type="number" name="mobile_No" value=$(dto.mobile_No)><br><br>
Comments:<input type = "text" name="comments" value=$(dto.comments)><br>
select file : <input type="file" name="file"><br>
<input type="submit" value="Save">
</pre>
</form>
</body>
</html>