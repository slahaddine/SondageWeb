/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sondage.controleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.sondage.modele.Connexion;
import org.sondage.modele.User;
import org.sondage.modele.UserDAO;

/**
 *
 * @author Usager
 */
public class Inscription extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username"), password = request.getParameter("password"),
                          email = request.getParameter("email"), name = request.getParameter("name"), 
                          firstName = request.getParameter("firstname");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connexion.setUrl("jdbc:mysql://localhost/sondageweb?user=root");
            Connection con = Connexion.getInstance();
            UserDAO dao = new UserDAO(con);
            if(dao.create(new User(username, password, name, firstName, email, "Montreal"))){
                
            }else{
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inscription.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
        RequestDispatcher rs = this.getServletContext().getRequestDispatcher("/index.jsp"); 
        rs.forward(request, response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
