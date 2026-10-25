<%-- 
    Document   : index
    Created on : 10 25, 26, 10:43:34 PM
    Author     : Angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <style>
            body {
                font-family: Helvetica;
            }
            .main {
                max-width: 50%;
                margin-left: auto;
                margin-right: auto;
                margin-top: 30vh;
                margin-bottom: 30vh;
            }
            .headnfoot {
                text-align: center;
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <div class="headnfoot"><%= application.getAttribute("headerStuff") %></div>
        <div class="main">
        <h1>Login</h1>
        <form action="LoginServlet" method="POST">
            <label for="username">Username: </label>
            <input type="text" id="username" name="username">
            <br><br>
            <label for="password">Password: </label>
            <input type="password" id="password" name="password">
            <br><br>
            <button type="submit">Login</button>
         </form>
        </div>
        <div class="headnfoot"><%= application.getAttribute("footerStuff") %></div>
    </body>
</html>
