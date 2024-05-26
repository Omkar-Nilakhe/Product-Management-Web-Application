<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.demo.bean.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Product r=(Product)request.getAttribute("data"); %>

<h3>updateProduct.jsp</h3>
<form action="UpdateProdServlet">
Product ID <input type="text" name="prodid" readonly="readonly" value="<%=r.getProdid()%>"><br><br>
Product name <input type="text" name="prodname" value="<%=r.getProdname()%>"><br><br>
Product category <input type="text" name="category" value="<%=r.getCategory()%>"><br><br>
Product quantity <input type="text" name="quantity" value="<%=r.getQuantity()%>"><br><br>
Product price <input type="text" name="price" value="<%=r.getPrice()%>"><br><br>
<input type="submit" value="Update Product">
<input type="reset">
</form>

</body>
</html>