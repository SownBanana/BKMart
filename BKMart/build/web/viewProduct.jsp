<%-- 
    Document   : viewProduct
    Created on : Sep 24, 2019, 11:44:00 PM
    Author     : SownBanana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--<!DOCTYPE html PUB >-->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Products</title>
    </head>
    <body>
        <table border ="1" cellpadding="5" cellspacing ="5">
            <tr>
                <th>Product ID</th>
                <th>Product Name</th>
                <th>Quantity</th>
                <th>Price</th>
            </tr>
            <c:forEach var="product" items="${productList}">
             
				<tr>
                <th>${product.productID}</th>
                <th>${product.name}Product </th>
                <th>${product.quantity}</th>
                <th>${product.price}</th>
            </tr>
			a
            </c:forEach>
        </table>
            <c:if test="${currentPage != 1}" >
                <td>
                    <a href="product.do?page=${currentPage - 1}">Previous</a>
                </td>
            </c:if>
                <table border="1" cellpadding="5" cellspacing ="5">
                    <tr>
                        <c:forEach begin="1" end="${noOfPages}" var="i">
                            <c:choose>
                                <c:when test="${currentPage eq i}">
                                    <td>${i}</td>
                                </c:when>
                                <c:otherwise>
                                    <td><a href="product.do?page=${i}">${i}</a></td>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </tr>
                </table>
                
                <c:if test="${currentPage lt noOfPages}">
                    <td>
                    <a href="product.do?page=${currentPage + 1}">Next</a>
                    </td>
                </c:if>
    </body>
</html>
