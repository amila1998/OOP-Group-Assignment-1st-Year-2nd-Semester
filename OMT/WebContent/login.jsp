<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
<link rel="stylesheet" type="text/css" href="styles/Default.css">
<link rel="stylesheet" type="text/css" href="styles/Login.css"></style>
<style>
<%@include file="styles/Default.css"%>
<%@include file="styles/Login.css"%>

</style>

<title>Login</title>
</head>
<body>


<center><h1 class="Ttxtstyle">Login</h1>
<section style="width=100%;" class="logingbody">
	
	<div id="formStyle3">
		
		<form action="login" method="POST" >
			<div class="col-50">
				<div  class="Plogo1">
					<img src="images/avatardefault_92824.png" alt="User Profile Logo" >
				</div>
				<% String msg = request.getParameter("msg");
						if("invalid".equals(msg)){%>
					<br><br><div class="invalid">Invalid Email or Password </div><br><br>
					<%} %>
					
					<%	if("regsucc".equals(msg)){%>
					<br><br><div class="invalid2">Successfully Registered</div><br><br>
					<%} %>
					
					<%	if("successfullyLogout".equals(msg)){%>
					<br><br><div class="invalid2">Successfully Logout</div><br><br>
					<%} %>
					
					<%	if("loginFirst".equals(msg)){%>
					<br><br><div class="invalid">YOU MUST LOGING FIRST</div><br><br>
					<%} %>
					
					<%	if("resetSucc".equals(msg)){%>
					<br><br><div class="invalid2">Reset Password Successfull</div><br><br>
					<%} %>
					
					<label for="email">Email:</label>
					<input type="email" name="uemail" placeholder="Enter Email here " required>
					<label for="password">Password:</label>
					<input type="password" id="pwd" name="upassword" placeholder="Enter Password here" required>
					<input type="checkbox" onclick="visiblepass()">:  Show Password

				<script>
				function visiblepass() {
				  var x = document.getElementById("pwd");
				  if (x.type === "password") {
				    x.type = "text";
				  } else {
				    x.type = "password";
				  }
				}
				</script>
				</div>
				
				<div class="row">
					<div class="col-50">				
						<button value="submit" id="login" type="submit" class="Btn3">Login</button>
					</div>
				</div>
				<div class="row">
					<div class="col-50">				
						<a href="userRegister.jsp"><button value="register" id="signin" type="button" class="Btn3">Create a New Account</button></a>
					</div>
				</div>
				<div class="row">
					<div class="col-50">
						<a href="forgetpassword.jsp" style="color:white" class="">Forgot password?</a>
					</div>
				</div>
			</div>
		</form>
		
    </div>
    
</section>

</center>

</body>
<footer style="display: block;
  width:100%;
  height:auto;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  position:fixed;">
<div class="FtopPadding">
				<p class="copyRSing" >Copyright &#169; 2021 - Online Movie & Tv Series System - All Right Reserved</p>
			</div>	
</footer>

</html>
