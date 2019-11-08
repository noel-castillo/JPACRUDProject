<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Results</title>
</head>
<body>
	<c:if test="${not empty heroes }">
		<c:forEach items="${heroes}" var="hero">
			<table>
				<tr>
					<td><a href="getHero.do?heroid=${hero.id}" class="btTxt submit">${hero.name}</a></td>
				</tr>
			</table>

		</c:forEach>
	</c:if>
	
	<c:if test="${not empty hero }">
		<table>
			<tr>
				<td>${hero.name}</td>
			</tr>
		</table>
	</c:if>

	<form action="/" method="GET">
		<input type="submit" class="btn btn-outline-light"
			value="Return to Home Page" />
	</form>
</body>
</html>