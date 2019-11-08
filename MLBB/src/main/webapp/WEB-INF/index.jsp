<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>

	<form action="getHero.do" method="GET">
		Hero ID: <input type="number" name="heroid" /> <input type="submit"
			value="Show Hero" />
	</form>

	<form action="getAllHeroes.do" method="GET">
		<input type="submit" value="Show All Heroes" />
	</form>

</body>
</html>