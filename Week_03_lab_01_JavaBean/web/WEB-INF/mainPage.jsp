<%-- 
    Document   : mainPage
    Created on : Sep 18, 2017, 5:01:51 PM
    Author     : 715583
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
        <h1>Main Page</h1>
        <p>Hello,${user.username} <a href="MainPageServlet" >Logout</a></p>
<c:import url="/includes/footer.html" />