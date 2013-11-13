/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sondage.controleur;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usager
 */
public class ControleurFrontale extends HttpServlet {

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
       if (request.getParameter("login") != null && request.getParameter("login").equals("login")){
           String username = request.getParameter("username"), password = request.getParameter("password"); 
           RequestDispatcher rs = this.getServletContext().getNamedDispatcher("Login"); 
           request.setAttribute("username", username);
           request.setAttribute("password", password);
           rs.forward(request, response);
       }else if(request.getParameter("register") != null && request.getParameter("register").contentEquals("register")){
           RequestDispatcher rs = this.getServletContext().getNamedDispatcher("Inscription");
           request.setAttribute("username", request.getParameter("username"));
           request.setAttribute("password", request.getParameter("password"));
           request.setAttribute("email", request.getParameter("email"));
           request.setAttribute("name", request.getParameter("name"));
           request.setAttribute("firstname", request.getParameter("firstname"));
           rs.forward(request, response);
       }else if(request.getParameter("sondage") != null && request.getParameter("sondage").contentEquals("sondage")){
           RequestDispatcher rs = this.getServletContext().getNamedDispatcher("");
           request.setAttribute("sondageName", request.getParameter("sondageName"));
           request.setAttribute("sondageDate", request.getParameter("sondageDate"));
           request.setAttribute("sondageDescription", request.getParameter("sondageDescription"));
           request.setAttribute("sondageOtherName", request.getParameter("sondageOtherName"));
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
