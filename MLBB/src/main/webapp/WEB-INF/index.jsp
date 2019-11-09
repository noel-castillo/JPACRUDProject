
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="css/styles.css" rel="stylesheet" type="text/css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<%@include file="nav.jsp" %>

<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<div class="header">MLBB Guide</div>
	<div class="subheader"></div>

	<div class="centered">
		<section class="cards">
			<div class="card">
				<form action="getHero.do" method="GET">
					Hero ID: <input type="number" name="heroId" /> <input
						type="submit" value="Find Hero" />
				</form>
			</div>
			<div class="card">
				<form action="goToCreateHero.do" method="GET">
					<input type="submit" value="Create New Hero" />
				</form>
			</div>
		</section>
	</div>


</body>
</html>