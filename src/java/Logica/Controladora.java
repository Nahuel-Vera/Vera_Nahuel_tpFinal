
package Logica;

import Persistencia.ControladoraPersistencia;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis=new ControladoraPersistencia();
    //alta Emp con reservasPorDia inicializa en 0, para que no inicialice en 0 agregar(int reservasPorDia,);
    public void AltaPersonaEmp(/*int id,*/ String nombre, String apellido, int edad, int dni, String Direccion, Date fechaNac, String cargo){
        Empleado person1=new Empleado();
        //person1.setId(id);
        person1.setNombre(nombre);
        person1.setApellido(apellido);
        person1.setEdad(edad);
        person1.setDni(dni);
        person1.setDireccion(Direccion);
        person1.setFechaNac(fechaNac);
        //person1.setReservasPorDia(reservasPorDia);
        person1.setCargo(cargo);
        
        controlPersis.AltaPersonaEmp(person1);
    }
    public void AltaHuesped(/*int id,*/ String nombre, String apellido, int edad, int dni, String direccion, Date fechaNac, String profesion){
        Huesped huesp1=new Huesped();
        //huesp1.setId(id);
        huesp1.setNombre(nombre);
        huesp1.setApellido(apellido);
        huesp1.setEdad(edad);
        huesp1.setDni(dni);
        huesp1.setDireccion(direccion);
        huesp1.setFechaNac(fechaNac);
        huesp1.setProfesion(profesion);
        
        controlPersis.AltaPersonaHuesp(huesp1);
    }
    
    public void AltaReserva(Date diaDeRegistroDeReserva,Huesped huesp1, Date fechaIngreso, Date fechaEgreso){
        Reservacion reserva1=new Reservacion();
        //reserva1.setIdReservacion(idReserva);
        reserva1.setIngreso(fechaIngreso);
        reserva1.setEgreso(fechaEgreso);
        reserva1.setHuesp(huesp1);
        reserva1.setDiaDeRegistroDeReserva(diaDeRegistroDeReserva);
        
        
        controlPersis.AltaReservacion(reserva1);
    }
    
    public void AltaUsuario(String usuario, String contra){
        Usuario user1=new Usuario();
        user1.setUsuario(usuario);
        user1.setContra(contra);
        controlPersis.AltaUsuario(user1);
    }
    
    //Traer huespedes que conecta al control de la persistencia
    public List<Huesped> TraerHuespedes(){
        return controlPersis.traerHuespedes();
    }
    
    public List<Reservacion> TraerReservasUnDeterminadoDia(){
        return controlPersis.TraerReservasUnDeterminadoDia();
    }
    
    public Reservacion BuscarReservas(int id){
        return controlPersis.BuscarReservas(id);
    }
    
    public Huesped BuscarHuesped(int id){
        return controlPersis.BuscarHuesped(id);
    }
    
    public void EliminarHuesped(int id){
        controlPersis.EliminarHuesped(id);
    }
    public void EliminarReservasdeHuesped(int id){
        controlPersis.EliminarReservasdeHuesped(id);
    }
    
    public void ModificarHuesped(Huesped huesp1){
        controlPersis.ModificarHuesped(huesp1);
    }
    
    public boolean verificarUsuario(String usuario, String contra){
        List<Usuario> ListUsuarios=controlPersis.traerUsuarios();
        
        if(ListUsuarios!=null){
            for(Usuario usu : ListUsuarios){
                if(usu.getUsuario().equals(usuario)&&usu.getContra().equals(contra)){
                    return true;
                }
            }
        }
        return false;
    }
}
