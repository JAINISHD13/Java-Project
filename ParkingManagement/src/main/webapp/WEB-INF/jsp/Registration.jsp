<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin| Insert Customer</title>
<link type="text/css"
	href="<c:url value ="bootstrap/css/bootstrap.min.css"/>"
	rel="stylesheet">
<link type="text/css"
	href="<c:url value ="bootstrap/css/bootstrap-responsive.min.css"/>"
	rel="stylesheet">
<link type="text/css" href="<c:url value ="css/theme.css"/>"
	rel="stylesheet">
<link type="text/css"
	href="<c:url value ="images/icons/css/font-awesome.css"/>"
	rel="stylesheet">
<link type="text/css"
	href='<c:url value ="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600"/>'
	rel='stylesheet'>
<script src="<c:url value ="http://js.nicedit.com/nicEdit-latest.js"/>"
	type="text/javascript"></script>
<script type="text/javascript">
	bkLib.onDomLoaded(nicEditors.allTextAreas);
</script>




</head>
<body>

	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".navbar-inverse-collapse"> <i
					class="icon-reorder shaded"></i>
				</a> <a class="brand" href="#"> Parking | Admin </a>

					<!-- /.nav-collapse -->
			</div>
		</div>
		<!-- /navbar-inner -->
	</div>
	<!-- /navbar -->


	<div class="wrapper">
		<div class="container">
			<div class="row">


				<div class="span3">
					<div class="sidebar">


						<ul class="widget widget-menu unstyled">
							<!-- 							<li><a class="collapsed" data-toggle="collapse" -->
							<!-- 								href="#togglePages"> <i class="menu-icon icon-cog"></i> <i -->
							<!-- 									class="icon-chevron-down pull-right"></i><i -->
							<!-- 									class="icon-chevron-up pull-right"></i> Order Management -->
							<!-- 							</a> -->
							<ul id="togglePages" class="collapse unstyled">
								<li><a href="todays-orders.php"> <i class="icon-tasks"></i>
										Today' s Orders
								</a></li>
								<li><a href="pending-orders.php"> <i class="icon-tasks"></i>
										Pending Orders
								</a></li>
								<li><a href="delivered-orders.php"> <i
										class="icon-inbox"></i> Delivered Orders

								</a></li>
							</ul>
							</li>
							
						</ul>


						<ul class="widget widget-menu unstyled">
							
							<li><a
								href="${pageContext.request.contextPath}/floor.html"><i
									class="menu-icon icon-paste"></i>View Alloted Slots</a></li>
									
							<li><a
								href="${pageContext.request.contextPath}/registration.html"><i
									class="menu-icon icon-paste"></i>Allot Parking Slot</a></li>
							<li><a 
								href="${pageContext.request.contextPath}/ViewCustomer.html"><i
									class="menu-icon icon-table"></i>Parking Details </a></li>

						</ul>
						<!--/.widget-nav-->

					</div>
					<!--/.sidebar-->
				</div>
				<!--/.span3-->


				<div class="span9">
					<div class="content">

						<div class="module">
							<div class="module-head">
							</div>
							<div class="module-body">



								<br />

								<form:form class="form-horizontal row-fluid"
									action="addCustomer.html" commandName="customer">

									<div class="control-group">
										<label class="control-label" for="basicinput">Customer
											Name </label>
										<div class="controls">
											<form:input type="text" name="name"
												placeholder="Enter Customer name" class="span8 tip"
												path="name" required="true" id="name" />
										</div>
									</div>

									<div class="control-group">
										<label class="control-label" for="basicinput">Car no </label>
										<div class="controls">
											<form:input type="text" name="carno"
												placeholder="Enter car no" class="span8 tip" path="carno"
												required="true" id="carno" />
										</div>
									</div>

									<div class="control-group">
										<label class="control-label" for="basicinput">Mobile
											no </label>
										<div class="controls">
											<form:input type="text" name="mobileno"
												placeholder="Enter Mobile" class="span8 tip" path="mobileno"
												required="true" id="mobileno" />
										</div>
									</div>

									<div class="control-group">
										<label class="control-label" for="basicinput">Email Id
										</label>
										<div class="controls">
											<form:input type="text" name="email"
												placeholder="Enter EmailId" class="span8 tip" path="email"
												required="true" id="email" />
										</div>
									</div>


									<div class="control-group">
										<label class="control-label" for="basicinput">Timings</label>
										<div class="controls">
											<form:select path="parking.t_id" name="timeid"
												class="span8 tip" required="true">

												<form:option value="">Select Time</form:option>
												<c:forEach var="t" items="${tid}">
													<form:option value="${t.value}">
															${t.key}
														</form:option>
												</c:forEach>
											</form:select>
										</div>
									</div>


									<div class="control-group">
										<div class="controls">
											<button type="submit" name="submit" class="btn">Insert</button>
										</div>
									</div>
								</form:form>
							</div>
						</div>

					</div>
					<!--/.content-->
				</div>
				<!--/.span9-->
			</div>
		</div>
		<!--/.container-->
	</div>
	<!--/.wrapper-->

	<div class="footer">
		<div class="container">


			<b class="copyright">&copy; 2017 Parking </b> All rights reserved.
		</div>
	</div>


	<script src="<c:url value ="scripts/jquery-1.9.1.min.js"/>"
		type="text/javascript"></script>
	<script src="<c:url value ="scripts/jquery-ui-1.10.1.custom.min.js"/>"
		type="text/javascript"></script>
	<script src="<c:url value ="bootstrap/js/bootstrap.min.js"/>"
		type="text/javascript"></script>
	<script src="<c:url value ="scripts/flot/jquery.flot.js"/>"
		type="text/javascript"></script>
	<script src="<c:url value ="scripts/datatables/jquery.dataTables.js"/>"></script>
	<script>
		$(document).ready(
				function() {
					$('.datatable-1').dataTable();
					$('.dataTables_paginate').addClass(
							"btn-group datatable-pagination");
					$('.dataTables_paginate > a').wrapInner('<span />');
					$('.dataTables_paginate > a:first-child').append(
							'<i class="icon-chevron-left shaded"></i>');
					$('.dataTables_paginate > a:last-child').append(
							'<i class="icon-chevron-right shaded"></i>');
				});
	</script>
</html>