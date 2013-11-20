<%@page import="java.util.ArrayList"%>
<%@page import="org.sondage.modele.Sondage"%>
<%@page import="org.sondage.modele.Sondage"%>
    <div id="content">
        hello
        <% 
            request.setAttribute("ss", "ssa");
            pageContext.forward("asas.do");
                    if(session.getAttribute("listSondages") != null ){
                ArrayList<Sondage> listSondage = (ArrayList<Sondage>)session.getAttribute("listSondages"); 
                out.print("here");
                for(int i=0; i<listSondage.size(); i++){
                  %>
                  <a id='titreSondage' href="Voter.jsp"><%=listSondage.get(i).getNomSondage()%><br>
                      <% request.setAttribute("SondageVoter", listSondage.get(i).getNomSondage()); %>
                  </a>
                  <div id='descriptionSondage'>
                      <%=listSondage.get(i).getDescription()%>
                  </div>
                  <span id='createurSondage'><%=listSondage.get(i).getOtherName()%><br><br></span>
                <%}
            }
        
        
        %>
        <div style="clear: both;">&nbsp;</div>
    </div>
</div>
