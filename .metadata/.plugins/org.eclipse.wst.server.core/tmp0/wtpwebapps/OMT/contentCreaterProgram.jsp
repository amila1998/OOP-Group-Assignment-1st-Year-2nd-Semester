<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
     <%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/Default.css">
<link rel="stylesheet" type="text/css" href="styles/advertiser.css">
<style>
<%@include file="styles/Default.css"%>
<%@include file="styles/advertiser.css"%>

</style>
<title>Content Creator Profile</title>
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
<div class="UPbody">
		<section style="width:70%">
			<div id="formStyle4">
<form action="#" method="post" >

			<c:forEach var="ccVar" items="${contentCreaterDetails}">
			
						<c:set var="id" value="${ccVar.id}"/>
						<c:set var="contentCreaterID" value="${ccVar.contentCreaterID}"/>
						<c:set var="companyName" value="${ccVar.companyName}"/>
						<c:set var="companyLocation" value="${ccVar.companyLocation}"/>
						

		
			<fieldset>
		         <legend>Content Creator Profile Details</legend><br>
		                    <div class="row">
								<div style="width:20%"> 
									<label for="uid" class="m">User ID</label>
								</div>
								<div style="width:2%">
									<label>:</label>
								</div>
								<div style="width:78%">
									<label for="uid" id="Uid">${ccVar.id}</label>
								</div>
							</div>


							<div class="row">
								<div style="width:20%">
									<label for="companyName" class="m">Company Name</label>
								</div>
								<div style="width:2%">
									<label>:</label>
								</div>
								<div style="width:78%">
									<label for="companyName" id="companyName">${ccVar.companyName}</label>
								</div>
							</div>

							<div class="row">
								<div style="width:20%">
				        			<label for="companyAddress" class="m">Company Address</label>
				        		</div>
				        		<div style="width:2%">
									<label>:</label>
								</div>
				        		<div style="width:78%">
				        			<label for="companyLocation" id="companyLocation">${ccVar.companyLocation}</label>
				        		</div>
							</div>					
							
			        </c:forEach>  
			        	<button type="submit" class="Btn1">Update Content Creator Details</button>
			        	</fieldset>  
	    		</form>
    		</div>
		



</section>

<section style="width:30%">
<div id="formStyle2">
 	<c:url value="myVideo" var="myVideo">
			<c:param name="uid" value="${id}"/>
			
		</c:url>
<form action="${myVideo}" method="post">


<center>
<button type="submit" class="Btn5">My Videos</button>
</center>

</form>
 	<c:url value="insertvideo.jsp" var="insertvideo">
			<c:param name="uid" value="${id}"/>
			
		</c:url>
<form action="${insertvideo}" method="post">
<center>
<button type="submit" class="Btn5">Add a Video</button>
</center>
</div>

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