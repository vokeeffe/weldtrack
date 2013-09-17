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
	
	</div>
	
	<c:forEach items="${welds}" var="weld" varStatus="row">
		<form action="update.html" method="post" id = "${weld.id}" >
			${row.count } Iso <input id="important" name="iso_num" value="${weld.iso_num}"
				size="10px" required> Spool <input name="spl_num"
				value="${weld.spl_num}" size="5px" required> Weld <input
				name="wld_num" value="${weld.wld_num}" size="5px" required>
			Size <input name="pdr_size" value="${weld.pdr_size}" size="5px" required>
			Type: <select name="wty_code">
				<option value="butt">Butt</option>
				<option value="socket">Socket</option>
			</select> Field Weld: <select name="wld_fw">
				<option value="true">Yes</option>
				<option value="false">No</option>
			</select> Welder <input name="wdr_num" value="${weld.wdr_num}" size="5px">
			Date Welded <input name="wld_wdate" type="date"
				value="${weld.wld_wdate}" size="10px"> <input
				name="weldId" value="${weld.id}" type="hidden"> <input
				type="submit" value="Update"  accesskey="s">
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
	<ul>
		<li>Ireland
		<ul>
			<li>Cork
			<ul>
				<li class="important">Glanmire</li>
				<li>Mayfield&euro;</li>
			</ul>
			</li>
		</ul>
		</li>
	</ul>
	<a href="http://www.bmd.ie/"> <img src="images/logo-bmd.gif"
		alt="BMD Homepage" width="185" height="66"></a>

</body>
</html>