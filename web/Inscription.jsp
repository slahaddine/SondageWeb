<%-- 
    Document   : Inscription
    Created on : 2013-10-02, 16:46:21
    Author     : Usager
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <title>Inscription</title>
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
                    <li><a href="#">Inscription</a></li>
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

                            <table>
                                <form action="controleur.do" method="POST">
                                    <br />

                                    <p>
                                        Username :     
                                        <input type="text" name="username"/>
                                    </p>
                                    <p>
                                        Password&nbsp;:&nbsp;    
                                        <input type="password" name="password"/>
                                    </p>
                                    <p>
                                        Email&nbsp;:&nbsp;      
                                        <input type="text" name="username"/>
                                    </p>
                                    <p>
                                        Name &nbsp;:&nbsp;  
                                        <input type="password" name="password"/>
                                    </p>
                                    <p>
                                        Firstname :     
                                        <input type="text" name="username"/>
                                    </p>
                                    Password&nbsp;:&nbsp;    
                                    <input type="password" name="password"/>
                                    </p>
                                    <input type="hidden" name="register" value="register"/>
                                    <input type="submit" value="S'inscrire"/>

                                </form>
                            </table>

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
