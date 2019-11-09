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
					<td><a href="getHero.do?heroId=${hero.id}"
						class="btTxt submit">${hero.name}</a></td>
				</tr>
			</table>

		</c:forEach>
		<form action="/" method="GET">
			<input type="submit" class="btn btn-outline-light"
				value="Return to Home Page" />
		</form>
	</c:if>

	<c:if test="${not empty hero }">
		<table>
			<tr>
				<td>${hero.name}</td>
			</tr>
			<tr>
				<td>HP: ${hero.health}</td>
			</tr>
			<tr>
				<td>MP: ${hero.mana}</td>
			</tr>
		</table>

		<form action="deleteHero.do" method="GET">
			<input type="hidden" name="heroId" value="${hero.id }"> <input type="submit"
				class="btn btn-outline-light" value="Delete Hero" />
		</form>
		<form action="goToUpdateHero.do" method="GET">
			<input type="hidden" name="heroId" value="${hero.id }"> <input type="submit"
				class="btn btn-outline-light" value="Update Hero" />
		</form>
		<form action="/" method="GET">
			<input type="submit" class="btn btn-outline-light"
				value="Return to Home Page" />
		</form>
	</c:if>


</body>
</html>