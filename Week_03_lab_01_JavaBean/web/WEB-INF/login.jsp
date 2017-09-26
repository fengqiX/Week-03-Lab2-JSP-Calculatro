<%-- 
    Document   : login
    Created on : Sep 18, 2017, 5:55:28 PM
    Author     : 715583
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
        <h1>Login</h1>
        <form action="index" method="post">
            <p>Username:<input type="text" name="Uname" value="${user.username}"></p>
            <p>Password:<input type="text" name="Pword" value="${user.password}"></p>
            <input type="submit" value="Login">
        </form>
            ${display}
<c:import url="/includes/footer.html" />