<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../styles/Default.css">
<link rel="stylesheet" type="text/css" href="../styles/payment.css">
	<style>
<%@include file="../styles/Default.css"%>
<%@include file="../styles/payment.css"%>


</style>
<title>payment list</title>
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
<br><br><br><br><br><br><br>

	<div class="form1">	
	<center><h2 class="h2">List of Payments</h2></center>
	<a href="<%=request.getContextPath()%>/new" class="btn btn-success">
	<button type="submit" class="button">Add New Payment</button>
	</a>
	<br>
	<hr>
	<br>
	<table id="paymentlist">
	<tr>
		<th>ID</th>
		<th>Card Name</th>
		<th>Card Number</th>
		<th>Amount</th>
		<th>Year</th>
		<th>Month</th>
		<th>CVC</th>
		<th>Actions</th>
	</tr>
				
				
	<c:forEach var="payment" items="${listPayment}">
	<tr>
		<td><c:out value="${payment.id}" /></td>
		<td><c:out value="${payment.cardname}" /></td>
		<td><c:out value="${payment.cardnumber}" /></td>
		<td><c:out value="${payment.amount}" /></td>
		<td><c:out value="${payment.year}" /></td>
		<td><c:out value="${payment.month}" /></td>
		<td><c:out value="${payment.cvc}" /></td>
		<td>
			<a href="edit?id=<c:out value='${payment.id}' />">
			<button class="button" type="submit">
				Edit
			</button>
			</a> 
			
			<a href="delete?id=<c:out value='${payment.id}'/>">
			<button class="button" type="submit" >
			Delete
			</button>
			</a> 
		</td>
	</tr>
	</c:forEach>
		
	</table>
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