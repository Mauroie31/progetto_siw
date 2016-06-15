<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<!DOCTYPE html>
<html lang="it">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Accedi</title>

<!-- Bootstrap Core CSS -->
<link rel="stylesheet" href="./../css/bootstrap.min.css" type="text/css">

<!-- Custom Fonts -->
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="./../font-awesome/css/font-awesome.min.css"
	type="text/css">

<!-- Plugin CSS -->
<link rel="stylesheet" href="./../css/magnific-popup.css"
	type="text/css">

<!-- Custom CSS -->
<link rel="stylesheet" href="./../css/creative.css" type="text/css">

</head>

<body>
	<f:view>
		<nav id="mainNav" class="navbar navbar-inverse navbar-fixed-top">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand page-scroll" href="./index.jsp"
						style="color: #EE4B28">Home</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-right">
						<li class="active"><a class="navbar-brand page-scroll"
							href="./login.jsp">Accedi</a></li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>

		<header
			style="background-image: -webkit-radial-gradient(center, circle farthest-corner, #FFFFFF 0%, #2F4C5E 100%);">
			<h:form>
				<div align="center" class="header-content">
					<div class="header-content-inner">
						<h1 style="color: #EE4B28; font-size: 40px;">Inserisci le tue
							credenziali</h1>
						<hr>

						<p style="color: #000000">
							Email:
							<h:inputText value="#{loginController.email}" />
						</p>

						<p style="color: #000000">
							Password:
							<h:inputSecret value="#{loginController.password}" />
						</p>

						<h:commandButton styleClass="btn btn-primary" value="Accedi" style="width:150px;height:80px; padding-right: 10px"
							action="#{loginController.login()}" />
						<h:commandButton styleClass="btn btn-warning" value="Registrati" style="width:150px;height:80px"
							action="#{loginController.goToPaginaRegistrazione()}" />

					</div>
				</div>
			</h:form>
		</header>
	</f:view>
</body>

</html>