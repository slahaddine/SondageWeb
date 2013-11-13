<%@page import="org.sondage.modele.Question"%>
<%@page import="org.sondage.modele.Questionnaire"%>
<%@page import="org.sondage.modele.Sondage"%>
<div id="page-bgbtm">
    <!-- end #content -->
    <%
        Questionnaire questionnaire = (Questionnaire) session.getAttribute("questionnaire");

        for (int i = 0; i < questionnaire.getNbQuestions(); i++) {
            questionnaire.addQuestion(new Question("Question", request.getParameter(i + ""), questionnaire.getIdQuestionnaire()));
        }
        Sondage sondage = (Sondage) session.getAttribute("sondage");
    %>
    <p>
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
        <li><%= questionnaire.getQuestion(i).getTexteQuestion()%></li>
        <% }%>
    </ul>
</p>

<!-- end #sidebar -->
<div style="clear: both;">&nbsp;</div>
</div>

