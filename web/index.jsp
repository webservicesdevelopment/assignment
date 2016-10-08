<%-- 
    Document   : index
    Created on : 29/09/2016, 12:13:54 AM
    Author     : Carmelo
--%>

<%@page import="uts.wsd.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Home</h1>
        
        
      
        
        <%
            User user = (User)session.getAttribute("user");
        %>
        
        <% if(user != null) { %>
            <p>Welcome, <%= user.getUsername() %></p>
            <a href="logoutAction.jsp">logout</a>           
            
            
        <% } else { %>
            <a href="login.jsp">Login</a>
        <% } %>
        
        
    </body>
</html>
