<%-- 
    Document   : logoutAction
    Created on : 06/10/2016, 7:51:33 PM
    Author     : 12471126
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <% 
            session.invalidate();
            response.sendRedirect("index.jsp");
        %>
    </body>
</html>
