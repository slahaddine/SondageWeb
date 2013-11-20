<%@page import="org.sondage.modele.Choix"%>
<%@page import="org.sondage.modele.Questionnaire"%>
<%@page import="org.sondage.modele.Sondage"%>
<div id="content">
    <!-- end #content -->
    <%
        Questionnaire questionnaire = (Questionnaire) session.getAttribute("questionnaire");

        for (int i = 0; i < questionnaire.getNbQuestions(); i++) {
            questionnaire.addChoix(new Choix("Choix", request.getParameter(i + ""), questionnaire.getIdQuestionnaire()));
        }
        Sondage sondage = (Sondage) session.getAttribute("sondage");
    %>
        Vous avez créez votre sondage avec succès <br /><br />
        Nom du sondage : <%= sondage.getNomSondage()%> <br />
        Description du sondage : <%= sondage.getDescription()%> <br />
        Auteurs : <%= sondage.getOtherName()%> <br /><br /><br />
        =============== <br />
        Votre question : <%= questionnaire.getTheQuestion() %> <br />
        Vos Choix : <br />
        =============== <br /><br /><br />
    <ul>
        <% for(int i=0; i<questionnaire.getNbQuestions();i++) {%>
        <li><%= questionnaire.getChoix(i).getTextChoix()%></li>
        <% }%>
    </ul>
<div style="clear: both;">&nbsp;</div>
</div>
    <!-- end #content -->
<div id="sidebar">
    <ul>
        <li>
            <h2>Sondage Web </h2>
            <p>Mauris vitae nisl nec metus placerat perdiet est. Phasellus dapibus semper consectetuer hendrerit.</p>
        </li>
        <li>
            <h2>Categories</h2>
            <ul>
                <li><a href="#">Aliquam libero</a></li>
                <li><a href="#">Consectetuer adipiscing elit</a></li>
                <li><a href="#">Metus aliquam pellentesque</a></li>
                <li><a href="#">Suspendisse iaculis mauris</a></li>
                <li><a href="#">Urnanet non molestie semper</a></li>
                <li><a href="#">Proin gravida orci porttitor</a></li>
            </ul>
        </li>
        
    </ul>
</div>
<!-- end #sidebar -->
<div style="clear: both;">&nbsp;</div>

<!-- end #sidebar -->


