package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvAgregarEmpleado", urlPatterns = {"/SvAgregarEmpleado"})
public class SvAgregarEmpleado extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        //int id= Integer.parseInt(request.getParameter("id"));
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        int dni=Integer.parseInt(request.getParameter("dni"));
        int edad=Integer.parseInt(request.getParameter("edad"));
        String direccion=request.getParameter("direccion");
        String cargo=request.getParameter("cargo");
        SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNac=null;
        try{
            fechaNac=formato.parse(request.getParameter("fechaNac"));
        }catch(ParseException e){
            System.out.println(e);
        }
        String user=request.getParameter("user");
        String pass=request.getParameter("pass");
        
        Controladora control=new Controladora();
        control.AltaPersonaEmp(nombre, apellido, edad, dni, direccion, fechaNac, cargo);
        control.AltaUsuario(user, pass);
        
        response.sendRedirect("AgregarEmple1.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
