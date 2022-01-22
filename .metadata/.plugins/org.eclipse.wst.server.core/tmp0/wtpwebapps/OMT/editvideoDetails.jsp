<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/Default.css">
<link rel="stylesheet" type="text/css" href="styles/userRegister.css">
<style>
<%@include file="styles/Default.css"%>
<%@include file="styles/userRegister.css"%>

</style>
<title>Update Video Details</title>
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
    	<center><h1 class="Ttxtstyle">Upload a Video</h1></center>
<div class="RegisterBody">
<section style="width:100%">
	<div id="formStyle1">
		<form action="updateDetails" target="_self" method="POST">
		<fieldset>
		<c:forEach items="${myvideos}" var="video">
			<label for="name">Video ID:</label>
  			<input type="text" id="vid" name="vid" value="${video.videoID}" readonly>
  			
			<label for="name">Title:</label>
  			<input type="text" id="title" name="title"  value="${video.title}" required>
			  				
			<label for="MobileNumber">Description :</label>
			<input type="text" id="description" name="description"  value="${video.description}" required>
			
			<label for="ageRestrictio">Age Restriction :</label>
			<input type="text" id="ageRestriction" name="ageRestriction" value="${video.ageRestriction}" required>
			
			<label for="category">Category :</label>
			<input type="text" id="category" name="category"  value="${video.category}" required>
			
				
			
			<label for="file">Thumbnail :</label>
			<input type="file" id="thumbnail" name="thumbnail">
			
			</c:forEach>
										 
			<br><br>
			
			<input name="Update" class="Btn1" type="submit" id="btn2" name="btn2"  value="Update">
			
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