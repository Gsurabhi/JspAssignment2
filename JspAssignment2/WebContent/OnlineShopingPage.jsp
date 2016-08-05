<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="ex" uri="WEB-INF/custom.tld"%>
<title>Online Shopping</title>

<h2 align="center">Online Shopping for you</h2>

<h3>Select your shopping items from the list and add to cart</h3>
</head>
<body>

<form action ="MainShoppingItems" method="post">

<h4 align="center">

<select name="ShopingItems" size="10" multiple="multiple">
<option value="Apples">Apples</option>
<option value="Eggs">Eggs</option>
<option value="Carrots">Carrots</option>
<option value="Pepsi">Pepsi</option>
<option value="Chocolates">Chocolates</option>
<option value="Perfumes">Perfumes</option>
<option value="Shampoo">Shampoo</option>
<option value="Biscuits">Biscuits</option>
<option value="WashingPowder">Washing Powder</option>
<option value="Oats">Oats</option>
</select>

</h4>

<h4 align="center">
<input type="submit" name="add" value="Add to Card">
</h4>

</form>
</body>
</html>