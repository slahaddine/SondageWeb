<%-- 
    Document   : Connexion.jsp
    Created on : 2013-10-02, 16:18:56
    Author     : Usager
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <title>Connexion</title>
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
        <!-- end #header -->
        <div id="menu">
            <ul>
                <li class="current_page_item">
                    <a href="index.jsp">Acceuil</a></li>
                <li><a href="#">Sondages Faits</a></li>
                <li><a href="Inscription.jsp">Inscription</a></li>
                <li><a href="Connexion.jsp">Connexion</a></li>
            </ul>
        </div>
        <!-- end #menu -->
        <div id="page">
            <div id="page-bgtop">
                <div id="page-bgbtm">
                    <div id="content">

                        <div style="clear: both;">&nbsp;</div>
                    </div>
                    <!-- end #content -->
                    <div id="connexion">

                        <form action="controleur.do" method="POST">
                            <table>
                                <br />
                                <p>
                                    Username :     
                                    <input type="text" name="username"/>
                                </p>
                                <p>
                                    Password&nbsp;:&nbsp;    
                                    <input type="password" name="password"/>
                                </p>
                                <input type="hidden" name="login" value="login"/>
                                <input type="submit" value="Connexion"/>
                            </table>
                        </form>

                    </div>
                    <!-- end #sidebar -->
                    <div style="clear: both;">&nbsp;</div>
                </div>
            </div>
        </div>
        <!-- end #page --> 
    </div>

</body>
</html>
