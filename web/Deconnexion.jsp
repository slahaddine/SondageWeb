<%-- 
    Document   : Deconnexion
    Created on : 2013-10-02, 17:23:09
    Author     : Usager
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Déconnexion</title>
    </head>
    <body>
        <% 
        session.invalidate();
        request.getRequestDispatcher("/index.jsp").forward(request, response);
        %>
    </body>
</html>
