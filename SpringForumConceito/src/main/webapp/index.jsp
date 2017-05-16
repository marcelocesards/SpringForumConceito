<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<link rel="stylesheet"
		href="c:url value="/recursos/stylesheets/estilo.css" />
		
    <title>
    	<tiles:getAsString name="titulo" />
    </title>
</head>
<body>
	<tiles:insertAttribute name="cabecalho"></tiles:insertAttribute>
	<tiles:insertAttribute name="conteudo"></tiles:insertAttribute>
	<tiles:insertAttribute name="rodape"></tiles:insertAttribute>
</body>
</html>
