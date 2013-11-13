<%-- 
    Document   : index
    Created on : 2013-10-02, 16:02:12
    Author     : Usager
--%>

<%@page import="org.sondage.modele.User"%>
<%@page import="org.sondage.modele.User"%>
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
            case 6 : currentPage = "CreateSondage";
                     break; 
            case 7 : currentPage = "CreateQuestionnaire";
                     break; 
            case 8 : currentPage = "CreateQuestions";
                     break;
            case 9 : currentPage = "CollapseSondage"; 
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
        <% User userConnected;
            if(session.getAttribute("connexion") != null && session.getAttribute("connexion").toString().contentEquals("true")){
                if(session.getAttribute("connectedUser") != null){
                    userConnected = (User) session.getAttribute("connectedUser");
                    out.println("<p style='color:#0aabff;'> Bienvenue " + userConnected.getNom()+ " " + userConnected.getPrenom() + "</p>");
                }
            }
        %>
        <div id="wrapper">
            <div id="header-wrapper">
                <div id="header">
                    <div id="logo">
                        <h1><a href="./index.jsp?action=1">Sondage WEB</a></h1>
                        <p>Site Web pour pour les sondages webs <a href="#" rel="nofollow"> par Sofiane et Yanis</a></p>
                    </div>
                </div>
            </div>
            <jsp:include page="./Menu.jsp" /> 
            
            <script>
                    elementArray = document.getElementsByClassName("current_page_item"); 
                    while(elementArray.length){
                        elementArray[0].className ="";
                    }
            </script>
            <%
    if (request.getParameter("action") != null){
        int tempAction = Integer.parseInt(request.getParameter("action"));
        switch(tempAction){
            case 1 : {
                        %>
                        <script>
                            document.getElementById("acceuil").className="current_page_item";
                        </script>
                        <%
                     break; }
            case 2 : {
                        %>
                        <script>
                            document.getElementById("sondageFaits").className="current_page_item";
                        </script>
                        <%
                     break; }
            case 3 :{
                        %>
                        <script>
                            document.getElementById("inscription").className="current_page_item";
                        </script>
                        <%
                     break; }
            case 4 : {
                        %>
                        <script>
                            document.getElementById("connexionDeconnexion").className="current_page_item";
                        </script>
                        <%
                     break; }
            case 5 :{
                        %>
                        <script>
                            document.getElementById("connexionDeconnexion").className="current_page_item";
                        </script>
                        <%
                     break; }
            case 6 : {
                        %>
                        <script>
                            document.getElementById("createSondage").className="current_page_item";
                        </script>
                        <%
                     break; }
            case 7 : {
                        %>
                        <script>
                            document.getElementById("createSondage").className="current_page_item";
                        </script>
                        <%
                     break; }
            case 8 : {
                        %>
                        <script>
                            document.getElementById("createSondage").className="current_page_item";
                        </script>
                        <%
                     break; }
            case 9 : {
                        %>
                        <script>
                            document.getElementById("createSondage").className="current_page_item";
                        </script>
                        <%
                     break; }
        }
    }
%>
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
