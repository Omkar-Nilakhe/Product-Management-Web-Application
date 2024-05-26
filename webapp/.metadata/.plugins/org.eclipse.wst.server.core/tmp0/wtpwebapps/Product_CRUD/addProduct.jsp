<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>addProduct.jsp</h3>
<form action="AddProdServlet">
Product ID <input type="text" name="prodid"><br><br>
Product name <input type="text" name="prodname"><br><br>
Product category <input type="text" name="category"><br><br>
Product quantity <input type="text" name="quantity"><br><br>
Product price <input type="text" name="price"><br><br>
<input type="submit" value="Add Product">
<input type="reset">
</form>

</body>
</html>