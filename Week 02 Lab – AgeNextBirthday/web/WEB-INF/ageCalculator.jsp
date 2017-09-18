<%-- 
    Document   : ageCalculator
    Created on : Sep 18, 2017, 1:27:18 PM
    Author     : 715583
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age next birthday</h1>
        <div>
            <form action="AgeCalculatorServlet" method="get">
              <p>Enter your current age: 
                  <input type="text" name="age">
                  <input type="submit" value="Age next birthday">
              </p>
            </form>
        </div>
        ${answer}
    </body>
</html>
