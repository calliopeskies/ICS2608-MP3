<%-- 
    Document   : error
    Created on : 10 25, 26, 10:50:54 PM
    Author     : Angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error!</title>
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
        <p><%= request.getAttribute("msg") %></p>
        <a href="index.jsp"><button>Return</button></a>
        </div>
        <div class="headnfoot"><%= application.getAttribute("footerStuff") %></div>
    </body>
</html>
