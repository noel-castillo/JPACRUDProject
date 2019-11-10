<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
<title>Hero Profile</title>
<%@include file="/WEB-INF/nav.jsp"%>
</head>

<body>

	<div class="container">

		<!-- ALL HEROES -->
		<c:if test="${not empty heroes }">
		<div class="allHeroesResults"  style="margin-top: 15px">
		<c:forEach items="${heroes}" var="hero">
			<table>
				<tr>
					<td><a href="getHero.do?heroId=${hero.id}"
						class="btTxt submit"><strong>${hero.name}</strong></a></td>
				</tr>
			</table>

		</c:forEach>
		<form action="/" method="GET">
			<input type="submit" class="btn btn-outline-light"
				value="Return to Home Page" />
		</form>
		</div>
	</c:if>
	<!-- SINGLE HEROES -->
		<c:if test="${not empty hero }">
			<div class="singleResults" style="margin-top: 15px">
				<div class="col-sm">
					<h1>
						<strong><a href="getHero.do?heroId=${hero.id}"
							class="btTxt submit">${hero.name}</a></strong>
					</h1>
					<h2>${hero.title}</h2>
				</div>
				<div class="container cont__style" style="margin-top: 15px">
					<div class="style__box shadow-lg">
						<strong>Role:</strong><br>
						<c:forEach items="${hero.roles}" var="role">
							<span class="badge badge-secondary" style="margin-bottom: 10px"> ${role} </span>
						</c:forEach>
					</div>

					<div class="style__box shadow-lg">
						<strong>Specialties:</strong><br>
						<c:forEach items="${hero.specialties}" var="specialty">
							<span class="badge badge-secondary" style="margin-bottom: 10px"> ${specialty} </span>
						</c:forEach>
					</div>

					<div class="style__box shadow-lg" style="margin-bottom: 20px">
						<strong>Last Update:</strong><br> <span
							class="badge badge-info"> ${hero.lastUpdate} </span>
					</div>
				</div>

				<div class="col-sm">
					<table class="table">
						<tr>
							<td>Health</td>
							<td>${hero.hp}</td>
						</tr>
						<tr>
							<td>Mana</td>
							<td>${hero.mana}</td>
						</tr>
						<tr>
							<td>Movement Speed</td>
							<td>${hero.movementSpeed}</td>
						</tr>
						<tr>
							<td>Physical Attack</td>
							<td>${hero.physicalAttack}</td>
						</tr>
						<tr>
							<td>Magic Power</td>
							<td>${hero.magicPower}</td>
						</tr>
						<tr>
							<td>Armor</td>
							<td>${hero.armor}</td>
						</tr>
						<tr>
							<td>Magic Resistance</td>
							<td>${hero.magicResistance}</td>
						</tr>
						<tr>
							<td>Attack Speed</td>
							<td>${hero.attackSpeed}</td>
						</tr>
						<tr>
							<td>HP Regen</td>
							<td>${hero.hpRegen}</td>
						</tr>
						<tr>
							<td>Mana Regen</td>
							<td>${hero.manaRegen}</td>
						</tr>
						<tr>
							<td>Basic Attack Crit Rate</td>
							<td>${hero.basicAttackCritRate}</td>
						</tr>
						<tr>
							<td>Ability Crit Rate</td>
							<td>${hero.abilityCritRate}</td>
						</tr>
					</table>
					
					<h4>${hero.backstory }</h4>
				</div>
			</div>

	<form action="deleteHero.do" method="GET">
		<input type="hidden" name="heroId" value="${hero.id }"> <input
			type="submit" class="btn btn-outline-light" value="Delete Hero" />
	</form>
	<form action="goToUpdateHero.do" method="GET">
		<input type="hidden" name="heroId" value="${hero.id }"> <input
			type="submit" class="btn btn-outline-light" value="Update Hero" />
	</form>
	<form action="/" method="GET">
		<input type="submit" class="btn btn-outline-light"
			value="Return to Home Page" />
	</form>
	</c:if>

</body>
</html>