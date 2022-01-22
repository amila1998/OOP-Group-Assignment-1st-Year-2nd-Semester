<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/Default.css">
<link rel="stylesheet" type="text/css" href="styles/userRegister.css">
<style>
<%@include file="styles/Default.css"%>
<%@include file="styles/userRegister.css"%>

</style>

<title>user register</title>
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
<br><br>
    	<center><h1 class="Ttxtstyle">Registeration Form</h1></center>
<div class="RegisterBody">
<section style="width:100%">
	<div id="formStyle1">
		<form action="register" target="_self" method="POST">
		<fieldset>
		
			<label for="name">Beginner Membership Type :</label>
  			<input type="text" id="membershiptype" name="membershiptype" value="SILVER" Readonly>
  			
			<label for="name">User Name:</label>
  			<input type="text" id="name" name="name" placeholder="enter your name here" required>
			  				
			<label for="MobileNumber">Contact Number :</label>
			<input type="text" id="mobile" name="mobile"  pattern="[0-9]{10}" placeholder="enter your contact here" required>
			
			<label for="EmailAddress">Email Address :</label>
			<input type="email" id="emailAdd" name="email" pattern="[a-zA-Z0-9._%+-]+@[a-z0-9]+\.[a-z]{2,3}" placeholder="enter your email here" required>
			
			<label for="nic_passport">NIC or Passport No :</label>
			<input type="text" id="nic_passport" name="nic_passport"  placeholder="enter your NIC/Passport number here" required>
			
			<label for="gender">Gender  :</label>		
			<div class="row">
				
			<div class="col-25">
			<input type="radio" id="male" name="gender" value="male">			
			<label for="male">  Male  :</label>			
			</div>
			<div class="col-25">
			<input type="radio" id="female" name="gender" value="female">
			<label for="female">  Female  :</label>
			</div>
			<div class="col-25">
			<input type="radio" id="other" name="gender" value="other">
			<label for="other">  Other  :</label>
			</div>
			</div>
			<br><br>

			
			<label for="Password">Password :</label>
			<input type="password" id="pwd" name="pwd" placeholder="enter your password here"  required >
			
			<label for="rePassword">Re-enter Password :</label>
			<input type="password" id="rpwd" name="rpwd" placeholder="re-enter your password here" required>
			
			
			 
			<input type="checkbox" id="policy" name="policy" required onclick ="enableButton()">:  Accept privacy policy terms 
			<br><br>
			<input name="register" class="Btn1" type="submit" id="btn2" name="btn2"  value="submit" disable><br>
			
			<script>function enableButton(){

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
		
		
	</fieldset>
		</form>
        </div>
		</section>
</div>

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
