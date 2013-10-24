<div id="menu">
    <ul>
        <li class="current_page_item">
        <a href="index.jsp?action=1">Acceuil</a></li>
        <li><a href="index.jsp?action=2">Sondages Faits</a></li>

        <% if(session.getAttribute("connexion") == null) out.println("<li><a href='index.jsp?action=3'>Inscription</a></li>"); %>
        <li><a href=<% if(session.getAttribute("connexion") != null) out.println("index.jsp?action=4"); else out.println("index.jsp?action=5"); %>><% if(session.getAttribute("connexion") != null) out.println("Déconnexion"); else out.println("Connexion"); %> </a></li>
    </ul>
</div>
