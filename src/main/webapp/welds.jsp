<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="static/sitestyle.css" />
<script type = "text/javascript" src = "static/welds.js"></script>
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
	<div id = "panel">
	<table id="main_table">
	<tr>
	<c:forEach items="${sy_secfields}" var="sy_secfield" varStatus="row">
	<th>
	${sy_secfield.sfd_label}
	</th>
	</c:forEach>
	</tr>
	<c:forEach items="${fb_welds}" var="fb_weld" varStatus="row">
		<tr>
		<form action="update.html" method="post" id = "${fb_weld.id}">
		<td>${row.count}</td>
		<c:forEach items="${sy_secfields}" var="sy_secfield">
		<c:set var="property" value="${sy_secfield.sfd_name}"/>	
			<td><input id="important" name="${sy_secfield.sfd_name}" value="${fb_weld[property]}"
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
	
	<div id = "debug" hidden>
	<c:forEach items="${fb_welds}" var="fb_weld" varStatus="row">
		<form action="update.html" method="post" id = "${fb_weld.id}" >
			${row.count } Iso <input id="important" name="iso_num" value="${fb_weld.iso_num}"
				size="10px" required> Spool <input name="spl_num"
				value="${fb_weld.spl_num}" size="5px" required> Weld <input
				name="wld_num" value="${fb_weld.wld_num}" size="5px" required>
			Size <input name="pdr_size" value="${fb_weld.pdr_size}" size="5px" required>
			Type: <select name="wty_code">
				<option value="butt">Butt</option>
				<option value="socket">Socket</option>
			</select> Field Weld: <select name="wld_fw">
				<option value="true">Yes</option>
				<option value="false">No</option>
			</select> Welder <input name="wdr_num" value="${fb_weld.wdr_num}" size="5px">
			Date Welded <input name="wld_wdate" type="date"
				value="${fb_weld.wld_wdate}" size="10px"> <input
				name="weldId" value="${fb_weld.id}" type="hidden"> <input
				type="submit" value="Update"  accesskey="s">
		</form>
	</c:forEach>
	
	<c:forEach items="${sy_sections}" var="sy_section" varStatus="row">
		<form action="update.html" method="post" id = "${sy_section.id}" >
			${row.count} Code <input id="important" name="stn_code" value="${sy_section.stn_code}"
				size="15px" required>
				Title <input id="important" name="stn_btitle" value="${sy_section.stn_btitle}"
				size="15px" required>
				<input type="submit" value="Update"  accesskey="s">
		</form>
	</c:forEach>
	
	<c:forEach items="${sy_secfields}" var="sy_secfield" varStatus="row">
		<form action="update.html" method="post" id = "${sy_secfield.id}" >
			${row.count} Code <input id="important" name="stn_code" value="${sy_secfield.stn_code}"
				size="15px" required>
				Title <input id="important" name="sfd_name" value="${sy_secfield.sfd_name}"
				size="15px" required>
				<input type="submit" value="Update"  accesskey="s">
		</form>
	</c:forEach>
	
	<br />
	<br /> Create New:
	<form action="create.html" method="post">
		Iso <input name="iso_num" size="10px"
			STYLE="color: #FFFFFF; font-family: Verdana; font-weight: bold; font-size: 12px; background-color: #72A4D2;"
			required> Spool <input name="spl_num" size="5px"
			STYLE="color: #FFFFFF; font-family: Verdana; font-weight: bold; font-size: 12px; background-color: #72A4D2;"
			required> Weld <input name="wld_num" size="5px"
			STYLE="color: #FFFFFF; font-family: Verdana; font-weight: bold; font-size: 12px; background-color: #72A4D2;"
			required> Size <input name="pdr_size" size="5px"
			STYLE="color: #FFFFFF; font-family: Verdana; font-weight: bold; font-size: 12px; background-color: #72A4D2;"
			required> Type: <select name="wty_code">
			<option value="butt">Butt</option>
			<option value="socket">Socket</option>
		</select> Field Weld: <select name="wld_fw">
			<option value="true">Yes</option>
			<option value="false">No</option>
		</select> <input type="submit" value="Create"  accesskey="n">
	</form>
	<br />
	<br />
</div>
	<a href="http://www.bmd.ie/"> <img src="images/logo-bmd.gif"
		alt="BMD Homepage" width="185" height="66"></a>

</body>
</html>