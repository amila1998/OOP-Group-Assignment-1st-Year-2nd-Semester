<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
     <%@page import="java.util.ArrayList"%>
    
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/Default.css">
<link rel="stylesheet" type="text/css" href="styles/UserProfile.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
<%@include file="styles/Default.css"%>
<%@include file="styles/UserProfile.css"%>

</style>
<title>user account</title>
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
					<c:forEach var="userVar" items="${userDetails}">
			
						<c:set var="id" value="${userVar.id}"/>
						<c:set var="name" value="${userVar.name}"/>
						<c:set var="email" value="${userVar.email}"/>
						<c:set var="phone" value="${userVar.phone}"/>
						<c:set var="NIC_PassportNO" value="${userVar.NIC_PassportNO}"/>
						<c:set var="sex" value="${userVar.sex}"/>
						<c:set var="password" value="${userVar.password}"/>
	
				<center>
					<div id="profilepic">
						<img src="images/avatardefault_92824.png" alt="User Profile Logo">
					</div>
				</center>
			<fieldset>
		         <legend>Profile Details</legend><br>
		                    <div class="row">
								<div style="width:20%"> 
									<label for="uid" class="m">User ID</label>
								</div>
								<div style="width:2%">
									<label>:</label>
								</div>
								<div style="width:78%">
									<label for="uid" id="Uid">${userVar.id}</label>
								</div>
							</div>

							<div class="row">
								<div style="width:20%"> 
									<label for="name" class="m">Name</label>
								</div>
								<div style="width:2%">
									<label>:</label>
								</div>
								<div style="width:78%">
									<label for="name" id="name">${userVar.name}</label>
								</div>
							</div>


							<div class="row">
								<div style="width:20%">
									<label for="email" class="m">Email</label>
								</div>
								<div style="width:2%">
									<label>:</label>
								</div>
								<div style="width:78%">
									<label for="email" id="email">${userVar.email}</label>
								</div>
							</div>

							<div class="row">
								<div style="width:20%">
				        			<label for="Phone" class="m">Mobile Number</label>
				        		</div>
				        		<div style="width:2%">
									<label>:</label>
								</div>
				        		<div style="width:78%">
				        			<label for="Phone" id="Phone">${userVar.phone}</label>
				        		</div>
							</div>

							<div class="row">
								<div style="width:20%">
				        			<label for="NIC_PassportNO" class="m">NIC/Passport NO</label>
				        		</div>
				        		<div style="width:2%">
									<label>:</label>
								</div>
				        		<div style="width:78%">
				        			<label for="NIC_PassportNO" id="NIC_PassportNO">${userVar.NIC_PassportNO}</label>
				        		</div>
							</div>

							<div class="row">
								<div style="width:20%">
					    			<label for="Sex" class="m">Sex</label>
					    		</div>
					    		<div style="width:2%">
									<label>:</label>
								</div>
					    		<div style="width:78%">
					    			<label for="Sex" id="Sex">${userVar.sex}</label>
					    		</div>
							</div>
							
							<div class="row">
								<div style="width:20%">
					    			<label for="membershiptype" class="m">Membership Type :</label>
					    		</div>
					    		<div style="width:2%">
									<label>:</label>
								</div>
					    		<div style="width:78%">
					    			<label for="membershiptype" id="membershiptype">${userVar.membershiptype}</label>
					    		</div>
							</div>
							

			        </fieldset>  
			        </c:forEach>  
			        	
	    		</form>
    		</div>
    	<c:url value="updateuser.jsp" var="userupdate">
			<c:param name="id" value="${id}"/>
			<c:param name="name" value="${name}"/>
			<c:param name="email" value="${email}"/>
			<c:param name="phone" value="${phone}"/>
			<c:param name="NIC_PassportNO" value="${NIC_PassportNO}"/>
			<c:param name="sex" value="${sex}"/>
			<c:param name="pass" value="${password}"/>
		</c:url>
		<a href="${userupdate}"><button value="Ubtn" id="updateBtn" type="button" class="Btn2" onclick="UpdateProfilepage()">Update Profile</button></a>

	<c:url value="deleteuser.jsp" var="userdelete">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${user.email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="NIC_PassportNO" value="${NIC_PassportNO}"/>
		<c:param name="sex" value="${sex}"/>
		<c:param name="pass" value="${password}"/>
	</c:url>
    			<a href="${userdelete}"><button value="Dbtn" id="updateBtn" type="button" class="Btn2">Delete Profile</button></a>
				<form action="logout" method="post"><button value="Logout" id="logoutBtn" type="submit" class="Btn1">Logout</button></form>
    	</section>
    	<sectionstyle="width:30%">
			<div id="formStyle2">
						<c:url value="buyGoldmem" var="goldmem">
						<c:param name="id" value="${id}"/>
						<c:param name="membershiptype" value="${membershiptype}"/>
					</c:url>
						<form method="post" action="${goldmem}"><fieldset><button value="Buy Gold Membership" id="myadsBtn" type="submit" class="Btn5">Buy Gold Membership</button></fieldset> </form>
		              
		              
		              <c:url value="advertiser" var="advertiser">
						<c:param name="id" value="${id}"/>
						<c:param name="name" value="${name}"/>
					</c:url>
						<form method="post" action="${advertiser}"><fieldset><button value="I am an Advertiser" id="myadsBtn" type="submit" class="Btn5">I am an Advertiser</button></fieldset> </form>
						
						<c:url value="contentCreator" var="contentCreator">
						<c:param name="id" value="${id}"/>
						<c:param name="name" value="${name}"/>
					</c:url>
						<form method="post" action="${contentCreator}"><fieldset><button value="Content Creator Program" id="contentCreator" type="submit" class="Btn5">Content Creator Program</button></fieldset> </form>
				
					<c:url value="mypayments" var="mypayments">
						<c:param name="id" value="${id}"/>
						<c:param name="name" value="${name}"/>
					</c:url>
						<form method="post" action="${mypayments}"><fieldset><button value="My Payments" id="mypayments" type="submit" class="Btn5">My Payments</button></fieldset> </form>
					
				
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