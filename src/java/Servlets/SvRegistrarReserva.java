/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Controladora;
import Logica.Huesped;
import com.sun.org.apache.xerces.internal.impl.xs.util.SimpleLocator;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvRegistrarReserva", urlPatterns = {"/SvRegistrarReserva"})
public class SvRegistrarReserva extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
                //int idReserva=Integer.parseInt(request.getParameter("idReserva"));
        int id=Integer.parseInt(request.getParameter("id"));
        SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
        Date fechaIngreso=null;
        try {
            fechaIngreso=formato.parse(request.getParameter("fechaIngreso"));
        } catch (ParseException ex) {
            Logger.getLogger(SvRegistrarReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date fechaEgreso=null;
        try {
            fechaEgreso=formato.parse(request.getParameter("fechaEgreso"));
        } catch (ParseException ex) {
            Logger.getLogger(SvRegistrarReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date diaDeRegistroDeReserva=new Date();
        Controladora control=new Controladora();
        Huesped huesp1=control.BuscarHuesped(id);
        control.AltaReserva(diaDeRegistroDeReserva, huesp1, fechaIngreso, fechaEgreso);
        response.sendRedirect("VerPersonas.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        int id=Integer.parseInt(request.getParameter("id"));
        
        Controladora control=new Controladora();
        Huesped Huesp1=control.BuscarHuesped(id);
        HttpSession misession=request.getSession();
        misession.setAttribute("huesped", Huesp1);
        
        response.sendRedirect("AgregarReserva.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
