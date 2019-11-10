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
		<form:label path="title">Title: </form:label>
		<form:input path="title" required="required" default="${oldHero.title }" placeholder="${oldHero.title}" value="${oldHero.title}"/>
		<form:errors path="title" />
		<br />
		<form:label path="roles">Roles:</form:label>
		<div>
			<input type="checkbox" name="roles" value="Tank">Tank<br>
			<input type="checkbox" name="roles" value="Fighter">Fighter<br>
			<input type="checkbox" name="roles" value="Assassin">Assassin<br>
			<input type="checkbox" name="roles" value="Marksman">Marksman<br>
			<input type="checkbox" name="roles" value="Mage">Mage<br>
			<input type="checkbox" name="roles" value="Support">Support<br>
		</div>
		<form:errors path="roles" />
		<br>
		<form:label path="specialties">Specialties:</form:label>
		<div>
			<input type="checkbox" name="specialties" value="Burst Damage">Burst Damage<br>
			<input type="checkbox" name="specialties" value="Charge">Charge<br>
			<input type="checkbox" name="specialties" value="Crowd Control">Crowd Control<br>
			<input type="checkbox" name="specialties" value="Damage">Damage<br>
			<input type="checkbox" name="specialties" value="Initiator">Initiator<br>
			<input type="checkbox" name="specialties" value="Poke">Poke<br>
			<input type="checkbox" name="specialties" value="Push">Push<br>
			<input type="checkbox" name="specialties" value="Reap">Reap<br>
			<input type="checkbox" name="specialties" value="Regen">Regen<br>
		</div>
		<form:errors path="specialties" />
		<br />
		<form:label path="hp">Health Points:</form:label>
		<form:input path="hp" type="number" min="0" required="required" default="${oldHero.hp }" placeholder="${oldHero.hp}" value="${oldHero.hp}"/>
		<form:errors path="hp" />
		<br />
		<form:label path="mana">Mana Points:</form:label>
		<form:input path="mana" type="number" min="0" required="required" default="${oldHero.mana }" placeholder="${oldHero.mana}" value="${oldHero.mana}"/>
		<form:errors path="mana" />
		<br>
		<form:label path="movementSpeed">Movement Speed:</form:label>
		<form:input path="movementSpeed" min="0" type="number" required="required" default="${oldHero.movementSpeed }" placeholder="${oldHero.movementSpeed}" value="${oldHero.movementSpeed}"/>
		<form:errors path="movementSpeed" />
		<br>
		<form:label path="physicalAttack">Physical Attack:</form:label>
		<form:input path="physicalAttack" type="number" min="0" required="required" default="${oldHero.physicalAttack }" placeholder="${oldHero.physicalAttack}" value="${oldHero.physicalAttack}"/>
		<form:errors path="physicalAttack" />
		<br>
		<form:label path="magicPower">Magic Power:</form:label>
		<form:input path="magicPower" type="number" min="0" required="required" default="${oldHero.magicPower }" placeholder="${oldHero.magicPower}" value="${oldHero.magicPower}"/>
		<form:errors path="magicPower" />
		<br>
		<form:label path="armor">Armor:</form:label>
		<form:input path="armor" type="number" min="0" required="required" default="${oldHero.armor }" placeholder="${oldHero.armor}" value="${oldHero.armor}"/>
		<form:errors path="armor" />
		<br>
		<form:label path="magicResistance">Magic Resistance:</form:label>
		<form:input path="magicResistance" type="number" min="0" required="required" default="${oldHero.magicResistance }" placeholder="${oldHero.magicResistance}" value="${oldHero.magicResistance}"/>
		<form:errors path="magicResistance" />
		<br>
		<form:label path="attackSpeed">Attack Speed:</form:label>
		<form:input path="attackSpeed" type="number" min="0" step="0.01" max="2.5" required="required" default="${oldHero.attackSpeed }" placeholder="${oldHero.attackSpeed}" value="${oldHero.attackSpeed}"/>
		<form:errors path="attackSpeed" />
		<br>
		<form:label path="hpRegen">HP Regen:</form:label>
		<form:input path="hpRegen" type="number" min="0" required="required" default="${oldHero.hpRegen }" placeholder="${oldHero.hpRegen}" value="${oldHero.hpRegen}"/>
		<form:errors path="hpRegen" />
		<br>
		<form:label path="manaRegen">Mana Regen:</form:label>
		<form:input path="manaRegen" type="number" min="0" required="required" default="${oldHero.manaRegen }" placeholder="${oldHero.manaRegen}" value="${oldHero.manaRegen}"/>
		<form:errors path="manaRegen" />
		<br>
		<form:label path="backstory">Backstory</form:label>
		<form:input path="backstory" type="text" required="required" default="${oldHero.backstory }" placeholder="${oldHero.backstory}" value="${oldHero.backstory}"/>
		<form:errors path="backstory" />
		<br>
		<div class="container">
		<input type="hidden" name="heroId" value="${oldHero.id }">
		<input type="submit" id = "updateHero"  class="btn btn-outline-light" value="Update Hero" />
		</div>
	</form:form>
</body>
</html>