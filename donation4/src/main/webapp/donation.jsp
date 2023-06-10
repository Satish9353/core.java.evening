<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

<h1>-:Blood Donation Form:-</h1>

<c:forEach items="${error}" var="errors">
<span style="color: red;">${errors.defaultMessage}</span></br>
</c:forEach>

<span style="color: green;">${sucessMsg}</span>

<form action = "donate" method="post" enctype="multipart/form-data">


<pre>
<nav class="navbar  bg-dark navbar-dark">
	
  <div class="container-fluid">
    <span class="navbar-brand mb-0 h1">X-workz</span>
  </div>
Name:<input type="text" name="name" value="$(dto.name)"><br>
Address:<textarea rows="3" cols="30" name="address"></textarea><br>
Age:<input type="number" name="age" value="$(dto.age)"><br>
Weight:<input type="number" name="weight" value="$(dto.weight)"><br>
BloodGroup:<select name="bloodGroup" value="$(dto.bloodGroup)"><br>
<option value=" " >Select</option><br>
<option>A+</option>
<option>A-</option>
<option>B+</option>
<option>B-</option>
<option>AB+</option>
<option>AB-</option>
<option>O+</option>
<option>O-</option>
</select>

select file : <input type="file" name="file">

<input type="submit" value="Save">
</pre>
</form>


</body>
</html>