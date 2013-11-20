/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sondage.controleur;

import org.sondage.modele.Connexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.sondage.modele.Sondage;
//import org.apache.catalina.Session;
import org.sondage.modele.User; 
import org.sondage.modele.UserDAO;

/**
 *
 * @author Usager
 */
public class Login extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException {
        String username = request.getParameter("username"), password = request.getParameter("password"); 
        Class.forName("com.mysql.jdbc.Driver");
        Connexion.setUrl("jdbc:mysql://localhost/sondageweb?user=root");
        Connection con = Connexion.getInstance();
        UserDAO dao = new UserDAO(con);
        if (dao.connexion(username, password)){
           // User user = dao.find(username); 
            HttpSession session = request.getSession(); 
            session.setAttribute("username", username);
            session.setAttribute("connexion", "true");
            session.setAttribute("connectedUser", dao.read(username));
            String nomAuteur = "Sofiane"; 
            Sondage sondage1 = new Sondage(nomAuteur, "description banale", "Yanis"); 
            Sondage sondage2 = new Sondage("Yanis", "description banale 2", "Sofiane"); 
            List<Sondage> listSondage = new ArrayList<Sondage>();
            listSondage.add(sondage1);
            listSondage.add(sondage2); 
            session.setAttribute("listSondages", listSondage);
            
        }else{
            
        }
        RequestDispatcher rs = this.getServletContext().getRequestDispatcher("/index.jsp?action=1");// getRequestDispatcher("/index.jsp"); 
        rs.forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
