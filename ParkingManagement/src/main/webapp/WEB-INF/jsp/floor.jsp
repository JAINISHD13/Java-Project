<%@page import="com.parking.learning.model.Customer"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Floor Details</title>
<link type="text/css" href="<c:url value ="css/style.css"/>"
	rel="stylesheet" />
</head>
<body>

	<div class="p1">
		<div class="fname1">Floor1</div>
		<div class="data1">
			<table>
				<thead>
					<tr>
						
						<th>Slot</th>
						<th>Time</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="clist" items="${clist[0]}">
						<tr>
							
							<td>${clist.p_id }</td>
							<td>${clist.t_id} </td>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	
	<div class="p2">
		<div class="fname1">Floor2</div>
		<div class="data2">
			<table>
				<thead>
					<tr>
						
						<th>Slot</th>
						<th>Time</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="clist" items="${clist[1]}">
						<tr>
							
							<td>${clist.p_id }</td>
							<td>${clist.t_id} </td>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	
	<div class="p1">
		<div class="fname1">Floor3</div>
		<div class="data1">
			<table>
				<thead>
					<tr>
						
						<th>Slot</th>
						<th>Time</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="clist" items="${clist[2]}">
						<tr>
							
							<td>${clist.p_id }</td>
							<td>${clist.t_id} </td>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<div class="p2">
		<div class="fname1">Floor4</div>
		<div class="data2">
			<table>
				<thead>
					<tr>
						
						<th>Slot</th>
						<th>Time</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="clist" items="${clist[3]}">
						<tr>
							
							<td>${clist.p_id }</td>
							<td>${clist.t_id} </td>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<div class="p1">
		<div class="fname1">Floor5</div>
		<div class="data1">
			<table>
				<thead>
					<tr>
						
						<th>Slot</th>
						<th>Time</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="clist" items="${clist[4]}">
						<tr>
							
							<td>${clist.p_id }</td>
							<td>${clist.t_id} </td>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<div class="p2">
		<div class="fname1">Floor6</div>
		<div class="data2">
			<table>
				<thead>
					<tr>
						
						<th>Slot</th>
						<th>Time</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="clist" items="${clist[5]}">
						<tr>
							
							<td>${clist.p_id }</td>
							<td>${clist.t_id} </td>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>




</body>
</html>