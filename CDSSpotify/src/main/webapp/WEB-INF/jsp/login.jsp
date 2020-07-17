<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>


<html lang="es">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1, shrink-to-fit=no" name="viewport">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/resources/css/login.css">

<title>CDSpotify</title>
</head>


<body>


	<div id="header">
		<div class="logo"></div>
	</div>
	
	<div id="main1" class="logUser">
	
	<c:if test="${errorMessageBool}">
		<div class="alert alert-danger" role="alert">
			  ${errorMessage}
		</div>
	
	</c:if>

		<div class="loginfb"></div>
		<div class="linel"></div>
		<div class="liner"></div>
		<br>
		
		<div class="row" id="form">
			<form:form method="POST" action="/login/log" modelAttribute="user">
				
				<div class="row">
					<div class="col-md-12">
						<form:input class="col-md-12" path="name" name="name" id="name" placeholder="Username" type="text" />
					</div>
					
					<div class="col-md-12">
							<form:input class="col-md-12" path="password" name="password" id="password" placeholder="Password" type="password" />
						
					</div>
					
					<div class="col-md-12">
						<h5>Remember</h5>
						<input class="btn-toggle btn-toggle-round" id="btn-toggle-1" name="remember" type="checkbox" /><label for="btn-toggle-1"></label>
						<input name="login" type="submit" value="Log in" />
					</div>
			
				</div>
			</form:form>
		</div>

		<div id="footer">
			<a onclick='singUp();'>Sign Up</a>
			<br> 
			<a>Forgot Password?</a>
		</div>

	</div>

<br><br>

	<div id="main2" class="createUser">
		<div class="loginfb"></div>
		<div class="linel"></div>
		<div class="liner"></div>
		<br>
		<div id="form">
			<form:form method="POST" action="/login/createUser" modelAttribute="user">
			
				<form:input path="name" name="createuser_name" id="createuser_name" placeholder="Username" type="text" />
				<form:input path="email" name="input" id="createuser_email" placeholder="Email" type="text" />
				<form:input path="password" name="input" id="createuser_password"  placeholder="Password" type="password" />

				<input name="login" type="submit" value="Create user" />
			</form:form>
		</div>
		<div id="footer">
			<a  onclick='logIn();'>Log in</a><br />
		</div>
	</div>




<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

<script src="/resources/js/login.js"></script>


</body>
</html>
