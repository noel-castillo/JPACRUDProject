<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

<title>Create Hero</title>
<%@include file="/WEB-INF/nav.jsp" %>
</head>
<body>
	<div class="container">
		<div id="banner" class="jumbotron text-center">
			<h1>Hero Update</h1>
		</div>
	</div>
	<form:form action="updateHero.do" method="GET" modelAttribute="hero">
		<form:label path="name">Name: </form:label>
		<form:input path="name" required="required" default="${oldHero.name }" placeholder="${oldHero.name}" value="${oldHero.name}"/>
		<form:errors path="name" />
		<br />
		<form:label path="health">Health Points:</form:label>
		<form:input path="health" type="number" required="required" default="${oldHero.health }" placeholder="${oldHero.health}" value="${oldHero.health}"/>
		<form:errors path="health" />
		<br />
		<form:label path="mana">Mana Points:</form:label>
		<form:input path="mana" type="number" required="required" default="${oldHero.mana }" placeholder="${oldHero.mana}" value="${oldHero.mana}"/>
		<form:errors path="mana" />
		<br>
		<form:label path="backstory">Backstory</form:label>
		<form:input path="backstory" type="text" required="required" default="${oldHero.backstory }" placeholder="${oldHero.backstory}" value="${oldHero.backstory}"/>
		<form:errors path="backstory" />
		<br>
		<form:label path="image">Image:</form:label>
		<form:input path="image" type="file" placeholder="images/${oldHero.image}" value="${oldHero.image}"/>
		<form:errors path="image" />
		<br />
		<div class="container">
		<input type="hidden" name="heroId" value="${oldHero.id }">
		<input type="submit" id = "updateHero"  class="btn btn-outline-light" value="Update Hero" />
		</div>
	</form:form>
</body>
</html>