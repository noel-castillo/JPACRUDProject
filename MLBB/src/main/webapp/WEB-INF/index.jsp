
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<link href="css/styles.css" rel="stylesheet" type="text/css">
<%@include file="nav.jsp"%>

<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<div class="header">MLBB Guide</div>
	<div class="subheader">
		<ul>
			<li class="subheader-button">
				<form style="margin-bottom: 15px" action="keywordSearch.do"
					method="GET">
					<input type="text" name="keyword" /> <input type="submit"
						class="sprite" value="Search">

				</form>
			</li>
			<li class="subheader-button">
				<form style="margin-bottom: 15px" action="goToCreateHero.do"
					method="GET">
					<input type="submit" value="Create New Hero" />
				</form>
			</li>
		</ul>
	</div>


</body>
</html>