<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/12/2024
  Time: 7:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ứng Dụng Chuyển Đổi Tiền Tệ</title>
</head>
<body>
<h1>Chuyển đổi tiền tệ</h1>
<h1>Nhập USD:</h1>
<form action="home" method="post">
    <input type="text" name="amount">
    <button>Chuyển đổi</button>
</form>
<c:if test="${not empty currency}">
    <h3>Result</h3>
    <p>Số tiền USD: ${currency.amount}USD</p>
    <p>Số tiền VND: ${currency.result}VNĐ</p>
</c:if>
</body>
</html>