<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Show Customer data</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
<ul>
<c:forEach items="${customerData}" var="customer">
   <li>${customer}</li>
</c:forEach>
</ul>
</body>
</html>
