<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="static/sitestyle.css" />
<script type = "text/javascript">
//var modelSySection = eval('('+'${sy_section_jsonstr}'+')'); //Security risk using eval()
var modelSySection = JSON.parse('${sy_section_jsonstr}');
</script>
<script type = "text/javascript" src = "static/local.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Weld Track Application</title>
</head>
<body>

	<a href="j_spring_security_logout">Logout: <security:authentication
			property="principal.username" />
	</a>
	<h1>Weld Track Application</h1>
	Current
	<i>Weld List</i> is:
	<br />
	<div id = "debuginfo">
	body table is ${stn_btable}
	</div>
	<div id = "panel">

	<table id="main_table">
	<tr id="headings">
	<th>Row</th>
	<c:forEach items="${sy_secfields}" var="sy_secfield" varStatus="row">
	<th>
	${sy_secfield.sfd_label}
	</th>
	<c:set var="table" value="${sy_section.sfd_name}"/>
	</c:forEach>
	</tr>
	<tr id="newrecord">
	<form action="create/${stn_btable}.html" method="post" onsubmit="submitNewRecord()">
	<td>0</td>
		<c:forEach items="${sy_secfields}" var="sy_secfield">
		<c:set var="property" value="${sy_secfield.sfd_name}"/>	
			<td><input type="${sy_secfield.sfd_input_type}" id="important" name="${sy_secfield.sfd_name}" value=""
				size="${sy_secfield.sfd_size}px" required></td>	
		</c:forEach>
		<td>
		<input type="submit" value="create/${stn_btable}.html"  accesskey="s">
		</td>
	</form>
	</tr>
	<tr id="findrecord">
	<form action="find.html" method="post" onsubmit="submitFindRecord()">
	<td>0</td>
		<c:forEach items="${sy_secfields}" var="sy_secfield">
		<c:set var="property" value="${sy_secfield.sfd_name}"/>	
			<td><input type="${sy_secfield.sfd_input_type}" id="important" name="${sy_secfield.sfd_name}" value=""
				size="${sy_secfield.sfd_size}px" required></td>	
		</c:forEach>
		<td>
		<input type="submit" value="Find"  accesskey="s">
		</td>
	</form>
	</tr>
	<c:forEach items="${btable}" var="btable" varStatus="row">
		<tr id="body">
		<form action="update.html" method="post" id = "${btable.id}">
		<td>${row.count}</td>
		<c:forEach items="${sy_secfields}" var="sy_secfield">
		<c:set var="property" value="${sy_secfield.sfd_name}"/>	
			<td><input type="${sy_secfield.sfd_input_type}" id="important" name="${sy_secfield.sfd_name}" value="${btable[property]}"
				size="${sy_secfield.sfd_size}px" required></td>	
		</c:forEach>
		<td>
		<input type="submit" value="Update"  accesskey="s">
		</td>
		</form>
		</tr>
	</c:forEach>
	</table>
	</div>
	<br />
	<br />
</div>
	<a href="http://www.bmd.ie/"> <img src="images/logo-bmd.gif"
		alt="BMD Homepage" width="185" height="66"></a>

</body>
</html>