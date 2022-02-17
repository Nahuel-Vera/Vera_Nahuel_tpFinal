package Servlets;

import Logica.Controladora;
import Logica.Reservacion;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvSusReservas", urlPatterns = {"/SvSusReservas"})
public class SvSusReservas extends HttpServlet {

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
        Reservacion reserva1=control.BuscarReservas(id);
        HttpSession misession=request.getSession();
        misession.setAttribute("reservacion", reserva1);
        
        response.sendRedirect("AgregarReserva.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
