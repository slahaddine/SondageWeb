  <div id="menu">
    <ul>
        <li class="current_page_item" id="acceuil">
            <a href="index.jsp?action=1" id="acceuil">Acceuil</a></li>
        <li id="sondageFaits">
            <a href="index.jsp?action=2">Sondages Faits</a>
        </li>
        <% 
            if (session.getAttribute("connexion") != null) {
            %>
        <li id="createSondage">
            <a href="index.jsp?action=6">Créer Sondage</a>
        </li>
            <%
            }
        %>

        <% if (session.getAttribute("connexion") == null) {
                out.println("<li id=\"inscription\"><a href='index.jsp?action=3'>Inscription</a></li>");
            } %>
        <li id="connexionDeconnexion"><a href=<% if (session.getAttribute("connexion") != null) {
                out.println("index.jsp?action=4");
            } else {
                out.println("index.jsp?action=5");
                
            } %>><% if (session.getAttribute("connexion") != null) {
                out.println("Déconnexion");
            } else {
                out.println("Connexion");
            }%> </a></li>
        
    </ul>
</div>
