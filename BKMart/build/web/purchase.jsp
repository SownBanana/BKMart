<%--
  Created by IntelliJ IDEA.
  User: thai.nv173359
  Date: 12/8/2019
  Time: 7:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="com.banana.dao.CustomerDAO"%>
<%@page import="com.banana.entity.CustomerLvEntity"%>
<%@page import="com.banana.dao.CustomerLvDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>15Tech Shop| Xác nhận thanh toán</title>
        <link rel="SHORTCUT ICON" href="images/logo.png">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Buy_shop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <!-- Custom Theme files -->
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <script src="js/simpleCart.min.js"></script>
        <!-- Custom Theme files -->
        <!--webfont-->
        <link href='http://fonts.googleapis.com/css?family=Lato:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
        <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
        <!-- start menu -->
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
        <script type="text/javascript" src="js/megamenu.js"></script>
        <script>$(document).ready(function () {
                $(".megamenu").megamenu();
            });</script>
    </head>
    <body>
        <%@include file="header.jsp"%>
        <%
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            CustomerDAO customerDAO = new CustomerDAO();
            int id = Integer.parseInt(request.getParameter("id"));
            CustomerEntity customer = customerDAO.getIdCustomer(id);
        %>
        <div class="single_top">
            <div class="container">
                <div class="register">
                    <div class="col-md-6 login-right">
                        <p>Xác nhận thanh toán</p>

                        <div>
                            <span>Địa chỉ email: <%=customer.getEmail()%></span>
                        </div>
                        <!--<form action="Cart" method="post">-->
                        <form action="makeOrder" method="post">
                            <div>

                                <span>Tên  : </span>  

                                <input type="text" placeholder="<%=customer.getName()%>" name="name">
                            </div>
                            <div>

                                <span>Địa chỉ  : </span>  

                                <input type="text" placeholder="<%=customer.getAddress()%>" name="address">
                            </div>
                            <div>
                                <span>Tỉnh thành : </span>
                                <input type="text" placeholder="<%=customer.getCityRegion()%>" name="cityRegion">
                            </div>
                            <div>
                                <span>Số điện thoại : </span>
                                <input type="text" placeholder="0<%=customer.getPhone()%>" name="phone">
                            </div>
                            <div>
                                <span>Phương thức thanh toán</span>
                                <select name="categoryId" path="brand">
                                    <option value="1">Thanh toán khi giao hàng</option>
                                    <option value="2">Ngân hàng nội địa</option>
                                    <option value="3">Ví điện tử</option>
                                </select>
                            </div>

                            <a class="forgot" href="cart.jsp">Quay lại </a><br>
                            <input type="submit" value="Xác nhận">
                        </form>

                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp"%>
    </body>
</html>