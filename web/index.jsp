<%-- 
    Document   : index
    Created on : 2013-10-02, 16:02:12
    Author     : Usager
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    String currentPage="Acceuil", myPage;
    
    if (request.getParameter("action") != null){
        int tempAction = Integer.parseInt(request.getParameter("action"));
        switch(tempAction){
            case 1 : currentPage = "Acceuil";
                     break;
            case 2 : currentPage = "Acceuil"; // la page sondageFaits.jsp n'est pas encore créée
                     break;
            case 3 : currentPage = "Inscription";
                     break;
            case 4 : currentPage = "Deconnexion";
                     break;
            case 5 : currentPage = "Connexion";
                     break;
        }
    }
    myPage="./"+currentPage+".jsp";
%>
<html>
    <head>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <title><%=currentPage%></title>
        <link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600' rel='stylesheet' type='text/css'>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        <div id="wrapper">
            <div id="header-wrapper">
                <div id="header">
                    <div id="logo">
                        <h1><a href="#">Escalate</a></h1>
                        <p>Template Design by <a href="http://www.freecsstemplates.org/" rel="nofollow">FreeCSSTemplates.org</a></p>
                    </div>
                </div>
            </div>
            <jsp:include page="./Menu.jsp" />
            <div id="page">
                <div id="page-bgtop">
                    <div id="page-bgbtm">
                        <jsp:include page="<%=myPage%>" /> 
                    </div>
                </div>
            </div>
            <!-- end #page --> 
        </div>
        <jsp:include page="./Footer.jsp" />
    </body>
</html>
