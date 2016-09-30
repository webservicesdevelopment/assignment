<%-- 
    Document   : login
    Created on : 29/09/2016, 12:26:00 AM
    Author     : Carmelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>

        <form action="loginAction.jsp">
            <table>
                <tbody>
                    <tr>
                        <td><label for="username">Username</label></td>
                        <td><input name="username" type="text" value=""></td>
                    </tr>
                    <tr>
                        <td><label for="password">Password</label></td>
                        <td><input name="password" type="password" value=""></td>
                    </tr>
                    <tr>
                        <td><label for=""></label></td>
                        <td><input name="" type="submit" value="Login"></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
