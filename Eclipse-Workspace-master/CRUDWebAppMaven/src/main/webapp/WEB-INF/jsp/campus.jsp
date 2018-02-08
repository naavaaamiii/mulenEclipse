<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Campus Minds</title>
</head>
<body>
<h1>Campus Data</h1>

<form:form action="campus.do" method="POST" commandName="campus">
	<table>
		<tr>
			<td>Campus mid MID</td>
			<td><form:input path="campusId"/></td>
		</tr>
		<tr>
			<td>Campus mind name is</td>
			<td><form:input path="name"/></td>
		</tr>
		<tr>
			<td>Campus mind track is</td>
			<td><form:input path="track"/></td>
		</tr>
		
		<tr>
			<td colspan="2">
			<input type="submit" name="action" value="Add"/>
			<input type="submit" name="action" value="Edit"/>
			<input type="submit" name="action" value="Delete"/>
			<input type="submit" name="action" value="Search"/>
		</tr>
	</table>
</form:form>

<br>
<table>
	<tr>MID</tr>
	<tr>name</tr>
	<tr>track</tr>
	<c:forEach items="${campusList}" var="campus">
		<tr>
			<td>${campus.mid}</td>
			<td>${campus.name}</td>
			<td>${campus.track}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>