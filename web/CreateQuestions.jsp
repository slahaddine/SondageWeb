 <%@page import="org.sondage.config.Config"%>
<%@page import="org.sondage.modele.Questionnaire"%>
<%@page import="org.sondage.modele.Sondage"%>
<div id="content">
    <!-- end #content -->
    <%
        Sondage sondage = (Sondage) session.getAttribute("sondage");
        Questionnaire questionnaire
                = new Questionnaire(Integer.parseInt(request.getParameter("questionnaireNbQuestion")),
                        sondage.getNomSondage(), request.getParameter("nameQuestionnaire").toString());
        questionnaire.setIdQuestionnaire(Config.getIdForQuestionnaire());
        session.setAttribute("questionnaire", questionnaire);
    %>
    <form action="index.jsp?action=9" method="POST">
        <table>
            <% for (int i = 0; i < questionnaire.getNbQuestions(); i++) {
            %>
            <tr>
                <td>
                    Question Numéro <%= (i + 1)%> :
                </td>
                <td>
                    <input type="text" name="<%= i%>" />
                </td>
            </tr>
            <%            }%>
            <tr>
                <td>
                    <input type="submit" value="Continuer"/>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="hidden" name="quetions" />
                </td>
            </tr>
        </table>

    </form>
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

