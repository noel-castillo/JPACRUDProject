<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link href="css/style.css" rel="stylesheet" type="text/css">
<title>Search Results</title>
<%@include file="/WEB-INF/nav.jsp"%>
</head>
<body>
	<c:if test="${not empty heroes }">
		<c:forEach items="${heroes}" var="hero">
			<table class="results">
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
		<table class="resultsSingle">
			<tr>
				<td>${hero.name}</td>
			</tr>
			<tr>
				<td>HP: ${hero.health}</td>
			</tr>
			<tr>
				<td>MP: ${hero.mana}</td>
			</tr>
			<tr>
				<td>${hero.backstory}</td>
			</tr>
			<tr>
				<td>${hero.image}</td>
			</tr>
		</table>
	<%-- 	<form action="addAnImage.do" method="GET">
		<input type="file" name="image" value="Image"/>
		<input type="hidden" name="heroId" value="${hero.image}">
		<input type="submit" class="btn btn-outline-light" value="Add Image">
		</form> --%>
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