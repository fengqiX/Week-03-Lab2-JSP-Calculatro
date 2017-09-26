<%-- 
    Document   : index
    Created on : Sep 26, 2017, 1:46:23 PM
    Author     : 715583
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple JSP Calculator</h1>
        
        <form action="index" method="GET">
            First: <input type="text" name="first"><br/>
            Second: <input type="text" name="second"><br/>
            <input type="submit" name="operation" value="+"> <input type="submit" name="operation" value="-"> 
            <input type="submit" name="operation" value="*"> <input type="submit" name="operation" value="%">
        </form>
        <br/>
        <c:if test="${result != null}">
            The result is ${result}
        </c:if>
    </body>
</html>

