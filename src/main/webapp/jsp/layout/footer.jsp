<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<!DOCTYPE html>
<b>
<%@page import="java.net.InetAddress;"%> <%
 	String ip = "";
 	InetAddress inetAddress = InetAddress.getLocalHost();
 	ip = inetAddress.getHostAddress();
 	out.println("Server IP Address: " + ip);
 %>
</b>
            Current User ktn: <security:authentication
			property="principal.ktn" />
