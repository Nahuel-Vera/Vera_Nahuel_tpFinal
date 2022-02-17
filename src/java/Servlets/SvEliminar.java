/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Controladora;
import Logica.Huesped;
import Logica.Reservacion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvEliminar", urlPatterns = {"/SvEliminar"})
public class SvEliminar extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        int id=Integer.parseInt(request.getParameter("id"));
        Controladora control=new Controladora();
        List<Reservacion> ListReservas=control.TraerReservasUnDeterminadoDia();
        
        control.EliminarHuesped(id);
        if(ListReservas!=null){
            for(Reservacion reserv1 : ListReservas){
                if(reserv1.getHuesp().getId()==id){
                    control.EliminarReservasdeHuesped(reserv1.getIdReservacion());
                }
            }
        }
        
        response.sendRedirect("VerPersonas.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
