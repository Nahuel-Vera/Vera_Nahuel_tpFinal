/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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


@WebServlet(name = "SvAgregar", urlPatterns = {"/SvAgregar"})
public class SvAgregar extends HttpServlet {

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
        String profesion=request.getParameter("profesion");
        SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNac=null;
        try{
            fechaNac=formato.parse(request.getParameter("fechaNac"));
        }catch(ParseException e){
            System.out.println(e);
        }
        
        Controladora control=new Controladora();
        control.AltaHuesped(/*id,*/ nombre, apellido, edad, dni, direccion, fechaNac, profesion);
        
        response.sendRedirect("principal.jsp");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        /*int id= Integer.parseInt(request.getParameter("id"));
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        int dni=Integer.parseInt(request.getParameter("dni"));
        int edad=Integer.parseInt(request.getParameter("edad"));
        String direccion=request.getParameter("direccion");
        String profesion=request.getParameter("profesion");
        SimpleDateFormat formato= new SimpleDateFormat("dd/mm/yyyy");
        Date fechaNac=null;
        System.out.println(id);
        try{
            fechaNac=formato.parse(request.getParameter("fechaNac"));
        }catch(ParseException e){
            System.out.println(e);
        }
        
        Controladora control=new Controladora();
        control.AltaHuesped(id, nombre, apellido, edad, dni, direccion, fechaNac, profesion);*/
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
