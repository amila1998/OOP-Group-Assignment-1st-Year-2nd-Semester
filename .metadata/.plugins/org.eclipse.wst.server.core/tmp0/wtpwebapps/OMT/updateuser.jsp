<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/Default.css">
<style>
<%@include file="styles/Default.css"%>


</style>
<title>update user details</title>
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

<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String sex = request.getParameter("sex");
		String NIC_PassportNO = request.getParameter("NIC_PassportNO");
		String password = request.getParameter("pass");
	%>

<br><br>
    	<center><h1 class="Ttxtstyle">Update User Details</h1></center>
<div class="RegisterBody">
<section style="width:100%">
	<div id="formStyle1">
		<form action="updateUser" target="_self" method="POST" onsubmit="return checkPassword()">
		<fieldset>
			<label for="name">User ID:</label>
  			<input type="text" id="id" name="id" value="<%= id %>" readonly>
  			
			<label for="name">User Name:</label>
  			<input type="text" id="name" name="name" value="<%= name %>" required>
			  				
			<label for="MobileNumber">Contact Number :</label>
			<input type="text" id="mobile" name="mobile"  pattern="[0-9]{10}" value="<%= phone %>" required>
			
			<label for="EmailAddress">Email Address :</label>
			<input type="email" id="emailAdd" name="email" pattern="[a-zA-Z0-9._%+-]+@[a-z0-9]+\.[a-z]{2,3}" value="<%= email %>" readonly>
			
			<label for="nic_passport">NIC or Passport No :</label>
			<input type="text" id="nic_passport" name="nic_passport"  value="<%= NIC_PassportNO %>" required>
			
			<label for="gender">Gender  :</label>		
			<input type="text" id="gender" name="gender"  value="<%= sex %>" readonly>
			
			<label for="Password">Password :</label>
			<input type="password" id="pwd" name="pwd" value="<%= password %>"  required >
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
			
			<input name="update" class="Btn1" type="submit" id="btn2" name="btn2"  value="Update">
			
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