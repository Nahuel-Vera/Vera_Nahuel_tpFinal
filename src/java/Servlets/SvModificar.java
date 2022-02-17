
package Servlets;

import Logica.Controladora;
import Logica.Huesped;
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

@WebServlet(name = "SvModificar", urlPatterns = {"/SvModificar"})
public class SvModificar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        int id= Integer.parseInt(request.getParameter("id"));
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        int dni=Integer.parseInt(request.getParameter("dni"));
        int edad=Integer.parseInt(request.getParameter("edad"));
        String direccion=request.getParameter("direccion");
        String profesion=request.getParameter("profesion");
        SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNac=null;
        try{
            fechaNac=formato.parse(request.getParameter("fechaNac"));
        }catch(ParseException e){
            System.out.println(e);
        }
        
        Controladora control=new Controladora();
        Huesped huesp1=control.BuscarHuesped(id);
        huesp1.setApellido(apellido);
        huesp1.setDireccion(direccion);
        huesp1.setDni(dni);
        huesp1.setEdad(edad);
        huesp1.setFechaNac(fechaNac);
        huesp1.setId(id);
        huesp1.setNombre(nombre);
        huesp1.setProfesion(profesion);
        
        control.ModificarHuesped(huesp1);
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
        
        response.sendRedirect("ModificarHuesped.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
