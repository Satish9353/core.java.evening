<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>X-Workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
	integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
	integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
	crossorigin="anonymous"></script>
<style>
.form {
	width: 50%;
	margin: auto;
	background-color: rgba(228, 231, 231, 0.685);
	padding: 50px;
	margin-top: 40px;
	border-radius: 15px;
}

.button {
	position: relative;
	top: 20px;
}
</style>
</head>

<body>

	<div class="navs">
		<nav class="navbar navbar-expand-lg bg-body-tertiary">
			<div class="container-fluid">
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="list">List
								of Contacts</a></li>
						<li class="nav-item"><a class="nav-link" href="contact2.jsp">View
								Image</a></li>

					</ul>
					<form class="d-flex" role="search">
						<input class="form-control me-2" type="search"
							placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-success " type="submit">Search</button>
					</form>
				</div>
			</div>
		</nav>
	</div>



	<div class="form">

		<form action="contact" method="post" enctype="multipart/form-data">
			<div class="form-group">
				<label for="exampleInputEmail1">Name:</label> <input type="text"
					name="name" onchange="validName()" id="nameId" class="form-control"
					id="exampleInputName" aria-describedby="emailHelp"
					placeholder="Enter name"><span id="nameError"
					style="color: red"></span>
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Email</label> <input type="email"
					name="email" onchange="valideEmail()" id="emailId"
					class="form-control" id="exampleInputEmail"
					placeholder="Enter email"><span id="emailError"
					style="color: red"></span>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Mobile number:</label> <input
					type="number" name="mobile_No" onchange="valideMobileNumber()"
					id="number" class="form-control" id="exampleInputMobileNumber"
					aria-describedby="emailHelp" placeholder="Enter mobile number"><span
					id="numberError" style="color: red"></span>
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Comments</label> <input
					type="text" class="form-control" name="comments"
					onchange="valideComment()" id="comment" id="exampleInputComments"
					placeholder="Comments"><span id="error" style="color: red"></span>
			</div>
			<br>
			<div class="form-group">
				<input type="file" name="file" class="form-control-file"
					id="exampleFormControlFile1">
			</div>

			<button type="submit" class="btn btn-primary button">Submit</button>
		</form>
	</div>


	<script>
function validName(){
	var userName = document.getElementById('nameId');
	var userValue = userName.value;
	console.log(userName);
	
	if (userValue != null && userValue != " " && userValue.length > 3
			&& userValue.length < 15) {

		document.getElementById('nameError').innerHTML = ' ';
	} else {
		document.getElementById('nameError').innerHTML = 'user name must be greater then 3 and less then 15';
	}
}


function validateEmail(){ 
	 
	 var email =document.getElementById("emailId")
    var emails =document.getElementById("emailError")
    emails.innerHTML="";
	 if(email.value == null ||email.value == ""){
		 emails.innerHTML='please enter the EmailId'
			 emails.style.color=" red" 
        
}	
	 else if(email.value.length < 12 ){
		 emails.innerHTML='Please enter valid EmailId ';
			 emails.style.color=" red"
           	 
    }	}

 
function valideMobileNumber(){
	 var mobileNo =document.getElementById("number")
     var mobileNos =document.getElementById("numberError")
     mobileNos.innerHTML="";
	 if(mobileNo.value == 0){
		 mobileNos.innerHTML='please enter the contactNo'
			 mobileNos.style.color=" red"
        	 
 }	
	 else if(mobileNo.value <= 1000000000 | mobileNo.value >9999999999){
		 mobileNos.innerHTML='please enter valid contact No.contact number should be of 10 digits';
			 mobileNos.style.color=" red" 
            	 
     }	
	 
	
}
function valideComment(){
	 var comment =document.getElementById("comment")
     var comments =document.getElementById("error")
     comments.innerHTML=""
     if(comment.value == ''){
    	 comments.innerHTML='please enter address ';
    		 comments.style.color=" red"
    			 
       }	
     }
}
</script>





</body>

</html>