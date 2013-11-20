 <%@page import="org.sondage.modele.Sondage"%>
<div id="content">
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
<div style="clear: both;">&nbsp;</div>

<!-- end #sidebar -->

