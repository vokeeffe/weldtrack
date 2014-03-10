<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="static/sitestyle.css?version=9" />
<script type = "text/javascript">

var modelSySection = JSON.parse('${sy_section_jsonstr}');
</script>
<script type = "text/javascript" src = "static/javascript.js?version=3"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<br>
</head>
<body>
	<div id = "debuginfo" style="display:none">
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
	<c:set var="table" value="${sy_section.stn_btable}"/>
	</c:forEach>
	</tr>
	<tr id="newrecord">
	<form action="create-${stn_btable}?MainArea=${sy_section.stn_code}" method="post" onsubmit="submitNewRecord()">
	<td>0</td>
		<c:forEach items="${sy_secfields}" var="sy_secfield">
		<c:set var="property" value="${sy_secfield.sfd_name}"/>	
			<td><input type="${sy_secfield.sfd_input_type}" id="important" name="${sy_secfield.sfd_name}" value=""
				size="${sy_secfield.sfd_size}px" ${sy_secfield.sfd_required} ${sy_secfield.sfd_readonly}></td>	
		</c:forEach>
		<td>
		<input type="submit" value="New"  accesskey="s">
		</td>
	</form>
	</tr>
	<tr id="findrecord" style="display:none">
	<form action="find.html" method="post" onsubmit="submitFindRecord()">
	<td>0</td>
		<c:forEach items="${sy_secfields}" var="sy_secfield">
		<c:set var="property" value="${sy_secfield.sfd_name}"/>	
			<td><input type="${sy_secfield.sfd_input_type}" id="important" name="${sy_secfield.sfd_name}" value=""
				size="${sy_secfield.sfd_size}px"></td>	
		</c:forEach>
		<td>
		<input type="submit" value="Find"  accesskey="s">
		</td>
	</form>
	</tr>
	<c:forEach items="${btable}" var="btable" varStatus="row">
		<tr id="body">
		<form action="update-${stn_btable}.html?MainArea=${sy_section.stn_code}" method="post" id = "${btable.id}">
		<td>${row.count}</td>
		<c:forEach items="${sy_secfields}" var="sy_secfield">
		<c:set var="property" value="${sy_secfield.sfd_name}"/>	
			<td><input type="${sy_secfield.sfd_input_type}" id="important" name="${sy_secfield.sfd_name}" value="${btable[property]}"
				size="${sy_secfield.sfd_size}px" ${sy_secfield.sfd_required} ${sy_secfield.sfd_readonly}></td>	
		</c:forEach>
		<td>
		<input type="submit" value="Edit"  accesskey="s">
		</td>
		</form>
		</tr>
	</c:forEach>
	</table>
	</div>
	<br />
	<br />
</div>
</body>
</html>