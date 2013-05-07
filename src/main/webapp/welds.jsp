<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Weld Track Application</title>
</head>
<body>
<h1>Weld Track Application</h1>
Current Weld List is:
<c:forEach items="${welds}" var="weld" varStatus="row">
${row.count } - ${weld.weldnum} - ${weld.spoolnum} - ${weld.isonum} - ${weld.size} - ${weld.type} - ${weld.fw} - ${weld.weldernum}
</c:forEach>
<form action="create.html">
Iso <input name="isonum">
Spool <input name="spoolnum">
Weld <input name="weldnum">
Size <input name="size">
Type:
Butt <input type="radio" name="type" value="butt">
Socket <input type="radio" name="type" value="socket">
Field Weld: 
True <input type="radio" name="fw" value="true">
False <input type="radio" name="fw" value="false">
Submit <input type="submit" value="Create">
</form>

</body>
</html>