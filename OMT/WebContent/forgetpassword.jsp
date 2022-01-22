<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/Default.css">
<link rel="stylesheet" type="text/css" href="styles/resetpassword.css">
<style>
<%@include file="styles/Default.css"%>
<%@include file="styles/resetpassword.css"%>

</style>
<title>Forget Password</title>
<header>
<%@ page import = "java.io.*,java.util.*" %>
<%
   // Get session creation time.
   Date createTime = new Date(session.getCreationTime());
      // Get last access time of this Webpage.
   Date lastAccessTime = new Date(session.getLastAccessedTime());
  
   Integer visitCount = new Integer(0);
   String visitCountKey = new String("visitCount");
   String userIDKey = new String("userID");
   String userID = new String("ABCD");

   // Check if this is new comer on your Webpage.
   if (session.isNew() ){
	   response.sendRedirect("login.jsp?msg=loginFirst");
   }
   if (session == null){
	   response.sendRedirect("login.jsp?msg=loginFirst");
   }
   String Email =(String)session.getAttribute("email");
     
%>
<style>
.navbar {
  width: 100%;
  background-color: #555;
  overflow: auto;
  
}

.navbar a {
  float: left;
  padding: 12px;
  color: white;
  text-decoration: none;
  font-size: 17px;
}

.navbar a:hover {
  background-color: #000;
}

.active {
  background-color: #d14959;
}

@media screen and (max-width: 500px) {
  .navbar a {
    float: none;
    display: block;
  }
}
</style>
<div class="navbar">
  <a href="#"><i class="fa fa-fw fa-home"></i> Home</a> 
  <a href="#"><i class="fa fa-fw fa-search"></i> Search</a> 
  <a href="userProfile"><i class="fa fa-fw fa-user"></i> <%=Email %></a>
</div>

</header>
</head>
<body>
<center><h1 class="Ttxtstyle">Forget Password</h1>
<section style="width=100%;" class="logingbody">
	
	<div id="formStyle3">
		
		<form action="forgetpassword" method="POST" >
		<fieldset>
			<div class="col-50">
						<% String msg = request.getParameter("msg");
						if("invalid".equals(msg)){%>
					<br><br><div class="invalid">Invalid Email or Name </div><br><br>
					<%} %>
					<% 
						if("resetUNSucc".equals(msg)){%>
					<br><br><div class="invalid">Reset Password Unsuccess </div><br><br>
					<%} %>
					
					
					<label for="email">Email:</label>
					<input type="email" name="uemail" placeholder="Enter Email here " required>
					<label for="name">Name:</label>
					<input type="text"  name="name" placeholder="Enter your name here" required>
					
					<label for="Password">New Password :</label>
					<input type="password" id="pwd" name="pwd" placeholder="enter your new password here"  required >
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
			 <br><br>
			<label for="rePassword">Re-enter Password :</label>
			<input type="password" id="rpwd" name="rpwd" placeholder="re-enter your password here" required>
			<input type="checkbox" onclick="visiblepassw()">:  Show Password

				<script>
				function visiblepassw() {
				  var x = document.getElementById("rpwd");
				  if (x.type === "password") {
				    x.type = "text";
				  } else {
				    x.type = "password";
				  }
				}
				</script>
			
			
			 <br><br>
			<input type="checkbox" id="policy" name="policy" required onclick ="enableButton2()">:  I am not a Robot
			<br><br>
			<input name="register" class="Btn1" type="submit" id="btn2" name="btn2"  value="Reset" disable><br>
			
			
			<script>function enableButton2(){

						if(document.getElementById("policy").checked){
							if(document.getElementById("pwd").value != document.getElementById("rpwd").value ){
								
								alert("password are mismatched!!");
								document.getElementById("policy").checked = false;
							}
							else{					
							}
				
							document.getElementById("btn2").disabled= false;//this means submit button is enabled
						}
						else{
							document.getElementById("btn2").disabled= true;
						
						}
					} 
		</script>
		
				</div>
				</div>
				
			</div>
		</fieldset></form></center>
    
</section>



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