<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer details</title>
</head>
<jsp:include page="menu.jsp" />
<body>
	<form action="/bankpage" method="post" modelAttribute="bank">
		<p>
			<label>Enter id</label> <input type="text" name="id" />
		</p>
		<p>
			<label>Enter Name</label> <input type="text" name="name" />
		</p>
		<p>
			<label>Enter mobile number</label> <input type="text" name="mobilenumber" />
		</p>
		<p>
			<label>Enter address</label> <input type="text" name="address" />
		</p>

		<input type="SUBMIT" value="Submit" />
	</form>
</body>

</html>