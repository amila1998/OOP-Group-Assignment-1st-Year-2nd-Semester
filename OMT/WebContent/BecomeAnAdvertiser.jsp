<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/Default.css">
<style>
<%@include file="styles/Default.css"%>


</style>
<title>Advertiser Registration</title>
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
		
%>

<br><br>
    	<center><h1 class="Ttxtstyle">Become an Advertiser</h1></center>

<section style="width:100%">
	<div id="formStyle1">
		<form action="contentCreaterRegistration" target="_self" method="POST">
		<fieldset>
		
		
		
			<label for="name">User ID:</label>
  			<input type="text" id="uid" name="uid" value="<%= id %>" readonly>
  			
			<label for="name">User Name:</label>
  			<input type="text" id="name" name="name" value="<%= name %>" readonly>
			  				
						
			<label for="companyName">Company Name :</label>
			<input type="text" id="companyName" name="companyName" required>
			
			<label for="companyAddress">Company Address :</label>
			<input type="text" id="companyAddress" name="companyAddress"  required>
			
													 
			<br><br>
			
			<input name="AdRegister" class="Btn1" type="submit" id="btn2" name="btn2"  value="Register">
			
	</fieldset>
		</form>
        </div>
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