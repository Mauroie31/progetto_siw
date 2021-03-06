<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Elenco Esami del Medico</title>
</head>
<body>
	<f:view>
		<h:form>
			<h1>Elenco dei esami effettuati dal medico </h1>
			<c:forEach var="esame" items="#{medicoController.getMedico().getEsami()}">
								${esame.id}
			</c:forEach>
		
		</h:form>
	</f:view>
</body>
</html>
