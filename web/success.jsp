<%-- 
    Document   : success
    Created on : 10 25, 26, 10:50:42 PM
    Author     : Angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Character Counter</title>
        <style>
            body {
                font-family: Helvetica;
            }
            .main {
                max-width: 50%;
                margin-left: auto;
                margin-right: auto;
                margin-top: 20vh;
                margin-bottom: 20vh;
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
        <h1>Welcome!</h1>
        <h2>Character Counter</h2>
        <p>Input anything below</p>
        <form  action="CharacterCountingServlet" method="POST">
            <input id="inputString" name="inputString"></input>
            <button type="submit">Submit</button>
        </form>
        
        <% if (request.getAttribute("stringLength") != null) { %>
            <hr/>
            <h3>Input string: <%= request.getAttribute("originalInput") %></h3>
            <ul>
                <li>String length: <%= request.getAttribute("stringLength") %></li>
                <li>Number of digits: <%= request.getAttribute("digitCount") %></li>
                <li>Number of vowels: <%= request.getAttribute("vowelCount") %></li>
                <li>Number of consonants: <%= request.getAttribute("consonantCount") %></li>
                <li>Number of symbols: <%= request.getAttribute("symbolCount") %></li>
            </ul>
        <% } %>
        </div>
        <div class="headnfoot"><%= application.getAttribute("footerStuff") %></div>
    </body>
</html>
