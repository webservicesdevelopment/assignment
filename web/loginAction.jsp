<%-- 
    Document   : loginAction
    Created on : 29/09/2016, 12:51:08 AM
    Author     : Carmelo
--%>

<%@page import="uts.wsd.Users"%>
<%@page import="uts.wsd.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String usersFilePath = application.getRealPath("WEB-INF/users.xml"); %>
        <jsp:useBean id="rentalApp" class="uts.wsd.RentalApplication" scope="application">
            <jsp:setProperty name="rentalApp" property="filePath" value="<%=usersFilePath%>"/>
        </jsp:useBean>
        
        
        <%
            rentalApp.setUsersFilePath(usersFilePath);
            
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            rentalApp.loadUsersXML();
            Users users = rentalApp.getUsers();
            User user = users.login(username, password);
            if(user != null) {
                session.setAttribute("user", user);
                response.sendRedirect("index.jsp");
            } else { %>
                <p>Password incorrect. Click <a href="login.jsp">here</a> to try again.</p>
           <% } %>
        
    </body>
</html>
