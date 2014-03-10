<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<!DOCTYPE html>

<c:forEach items="${sy_sections}" var="my_sy_section">
<c:set var="property" value="${my_sy_section.stn_btitle}"/>
<c:set var="property1" value="${my_sy_section.stn_code}"/>		
<p><a href="index?MainArea=${my_sy_section.stn_code}">${my_sy_section.stn_btitle}</a></p>
</c:forEach>

<p>
	<a href="j_spring_security_logout">Logout: <security:authentication
			property="principal.username" />
	</a>
</p>
