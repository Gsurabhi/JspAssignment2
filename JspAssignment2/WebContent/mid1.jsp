<%@ taglib prefix="ex" uri="WEB-INF/custom.tld"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ex:display /> 
<c:forEach var="type" items="${map1}">
    ${type.key}
    ${type.value}
</c:forEach>
<form action="MainShoppingItems" method="post" >

<input type="submit" name="display" value="View Cart Items">
</form>
</body>
</html>