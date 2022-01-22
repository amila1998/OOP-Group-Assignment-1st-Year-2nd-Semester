<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>My Advertistments</title>
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
<link rel="stylesheet" type="text/css" href="styles/Default.css">
<style>
<%@include file="../styles/Default.css"%>


</style>
<style>
.table {
  border-collapse: collapse;
  width: 100%;
  height: 70px;
  text-align: left;
  background-color: #98000d;
  
}
th {
  background-color: #98000d;
  color: black;
}

.table {
  border-collapse: collapse;
  margin: 25px 0;
  font-size: 0.9em;
  min-width: 400px;
  border-radius: 5px 5px 0 0;
  overflow: hidden;
  box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
  margin-left: auto;
  margin-right: auto;
  
}

.table {
  background-color: #98000d;
  color: black;
  text-align: left;
  font-weight: bold;
}

.table th,
.table td {
  padding: 12px 15px;
  color:black;
  text-align:center;
}

.table tbody tr {
  border-bottom: 1px solid #dddddd;
}

.table tbody tr {
  background-color: #f3f3f3;
}

}</style>
</head>
<body>
	
	<br><br><br>

	
		<div class="container">
			<center><h1 class="Ttxtstyle">My Advertistments</h1>
						
			<br>
			<table class="table" style="color:white;">
				<thead>
					<tr>
						<th>ad_id</th>
						<th>ad_name</th>
						<th>category</th>
						<th>period</th>
						<th>filename</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${myads}" var="ads">  
							
                 <tr>     
                   <td align="left">${ads.ad_id}</td>                     
                     <td align="left">${ads.ad_name}</td> 
                     <td align="left">${ads.category}</td> 
                     <td align="left">${ads.period}</td>
                     <td align="left">${ads.filename}</td>
                     
                     
                     
                     <td> 
                     
						<form action="editAdDetails.jsp?uid=${ads.UID}&ad_id=${ads.ad_id}&ad_name=${ads.ad_name}&adCategory=${ads.category}&period=${ads.period}" method="post"><button type ="sumbit" class="btn5">Edit</button></form>		</td> 	
					
					<td>			
						<form action="DeleteAnAd.jsp?vid=${ads.ad_id}&uid=${ads.UID}" method="post"><button type ="sumbit" class="btn5">Delete</button></form>
								                     
                     </td>  
                  </tr>  
             </c:forEach> 
				</tbody>

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