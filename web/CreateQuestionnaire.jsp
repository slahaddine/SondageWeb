<%@page import="org.sondage.modele.Sondage"%>
<div id="page-bgbtm">
    <!-- end #content -->
    <% 
        Sondage sondage = new Sondage(request.getParameter("sondageName"), 
                request.getParameter("sondageDescription"),
                (request.getParameter("sondageOtherName")!=null)?request.getParameter("sondageOtherName"):"");
        session.setAttribute("sondage", sondage);
    %>
    <form action="index.jsp?action=8" method="POST">
        <table>
            <tr>
                <td>
                    <p> Quelle est la question de votre sondage : </p>
                </td>
                 <td>
                     <input type="text" name="nameQuestionnaire" />
                </td>
            </tr>
            <tr>
                <td>
                    <p> Combiens de Questions comportera votre questionnaire : </p>
                </td>
                 <td>
                     <input type="text" name="questionnaireNbQuestion" />
                </td>
            </tr>
            <tr>
                 <td>
                     <input type="submit" value="Continuer"/>
                </td>
            </tr>
            <tr>
                 <td>
                     <input type="hidden" name="questionnaire" />
                </td>
            </tr>
        </table>
        
    </form>
    
    <!-- end #sidebar -->
    <div style="clear: both;">&nbsp;</div>
</div>
