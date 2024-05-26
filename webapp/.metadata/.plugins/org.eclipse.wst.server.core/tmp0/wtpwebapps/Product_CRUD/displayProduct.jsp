<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ page import="java.util.List" %>
    <%@ page import="com.demo.bean.Product" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h3>displayProduct.jsp</h3>
 <h2>Product List</h2>
  <table border="1" style="text-align: center">
        <tr>
            <th>product id</th>
            <th>product name</th>
            <th>category</th>
            <th>quantity</th>
            <th>price</th>
            <th>Update</th>
            <th>Remove</th>
        </tr>
        <c:forEach var="r" items="${prodlist}">
            <tr>
                <td>${r.prodid}</td>
                <td>${r.prodname}</td>
                <td>${r.category}</td>
                <td>${r.quantity}</td>
                <td>${r.price}</td>
                <td><a href="UpdateServlet?productid=${r.prodid}">update</a></td>
                <td><a href="Deleteservlet?productid=${r.prodid}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>

    <a href="addProduct.jsp">Add product</a>


</body>
</html>