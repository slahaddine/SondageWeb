<%@page import="org.sondage.config.Config"%>
<%@page import="org.sondage.modele.Questionnaire"%>
<%@page import="org.sondage.modele.Sondage"%>
<div id="page-bgbtm">
    <!-- end #content -->
    <% 
        Sondage sondage = (Sondage) session.getAttribute("sondage"); 
        Questionnaire questionnaire =
                new Questionnaire
        (Integer.parseInt(request.getParameter("questionnaireNbQuestion")), 
                sondage.getNomSondage(), request.getParameter("nameQuestionnaire").toString());
        questionnaire.setIdQuestionnaire(Config.getIdForQuestionnaire());
        session.setAttribute("questionnaire", questionnaire);
    %>
    <form action="index.jsp?action=9" method="POST">
        <table>
            <% for(int i=0; i<questionnaire.getNbQuestions();i++){ 
                %>
            <tr>
                <td>
                    Question Numéro <%= (i+1) %> :
                </td>
                <td>
                    <input type="text" name="<%= i %>" />
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
    
    <!-- end #sidebar -->
    <div style="clear: both;">&nbsp;</div>
</div>
