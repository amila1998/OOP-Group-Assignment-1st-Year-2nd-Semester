<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="../styles/Default.css">
	<style>
<%@include file="../styles/Default.css"%>
<%@include file="../styles/payment.css"%>


</style>
<link rel="stylesheet" type="text/css" href="../styles/payment.css">

	
	<title> Payment Form </title>
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
<br><br><br>


		<div class="form2">	
		<a href="<%=request.getContextPath()%>/list" >
		<button type="submit" class="buttons">Users</button>
		</a>	
	<br>
	
	<c:if test="${payment != null}">
		<form action="update" method="post">
	</c:if>
				
	<c:if test="${payment == null}">
		<form action="insert" method="post">
	</c:if>

	<center>
	<h2 class="h2">
		<c:if test="${payment != null}">
            Edit Payment
         </c:if>
		<c:if test="${payment == null}">
            Add New Payment
         </c:if>
	</h2>
	</center>

	<c:if test="${payment != null}">
		<input type="hidden" class="input" name="id" value="<c:out value='${payment.id}' />" />
	</c:if>
	
	<hr>
	<br>
	<center>
	<table class="qwe" >
		<tr>
			<td><lable class="lable"><b>Card Name</b></lable><br>
			<input type="text" class="input" value="<c:out value='${payment.cardname}'/>" name="cardname" required="required"></td>

			<td><lable class="lable"><b>Card Number</b></lable><br>
			<input type="text" class="input" value="<c:out value='${payment.cardnumber}' />" 
			name="cardnumber"></td>
		</tr>
		<tr>
			<td><lable class="lable"><b>Amount</b></lable><br>
			<input type="text" class="input" value="<c:out value='${payment.amount}' />" name="amount"></td>

			<td><lable class="lable"><b>CVC</b></lable><br>
			<input type="text" class="input" value="<c:out value='${payment.cvc}' />" name="cvc"></td>
		</tr>
		<tr>
			<td><lable class="lable"><b>Year(expiry)</b></lable>

				<br>
			<input type="text" class="input" value="<c:out value='${payment.year}' />" name="year"></td>

			<td><lable class="lable"><b>Month(expiry)</b></lable><br>
			<input type="text" class="input" value="<c:out value='${payment.month}' />" name="month"></td>
		</tr>
	</table>
	</center>
	<br>
	<hr>
	<br>
	<button type="submit" class="buttons">Submit
	</button>
	</form>
	</div>
<br>
<br>
<br>
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