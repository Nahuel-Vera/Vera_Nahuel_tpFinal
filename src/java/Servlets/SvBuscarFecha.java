/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Controladora;
import Logica.Reservacion;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvBuscarFecha", urlPatterns = {"/SvBuscarFecha"})
public class SvBuscarFecha extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
        Date fechaBuscar=null;
        try{
            fechaBuscar=formato.parse(request.getParameter("fechaBuscar"));
        }catch(ParseException e){
            System.out.println(e);
        }
        response.sendRedirect("VerReservas.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       /* processRequest(request, response);
        SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
        Date fechaBuscar=null;
        try{
            fechaBuscar=formato.parse(request.getParameter("fechaBuscar"));
        }catch(ParseException e){
            System.out.println(e);
        }
        
        Controladora control=new Controladora();
        Reservacion reserva=(Reservacion) control.TraerReservasUnDeterminadoDia(fechaBuscar);
        HttpSession misession=request.getSession();
        misession.setAttribute("reservacion", reserva);
                               
        response.sendRedirect("ConexionVerReservas.jsp");*/
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
