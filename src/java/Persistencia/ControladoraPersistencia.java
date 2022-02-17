//creado a mano.
package Persistencia;

import Logica.Empleado;
import Logica.Habitacion;
import Logica.Huesped;
import Logica.Persona;
import Logica.Reservacion;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    EmpleadoJpaController JpaEmp=new EmpleadoJpaController();
    HuespedJpaController JpaHuesp=new HuespedJpaController();
    PersonaJpaController JpaPerson=new PersonaJpaController();
    ReservacionJpaController JpaReserva=new ReservacionJpaController();
    HabitacionJpaController JpaHabitacion=new HabitacionJpaController();
    UsuarioJpaController JpaUsuario=new UsuarioJpaController();
    
    
    
    public void AltaPersonaEmp(Empleado emp){
            JpaEmp.create(emp);
        
    }
    
    public void AltaPersonaHuesp(Huesped huesp){
        JpaHuesp.create(huesp);
    }
    
    public void AltaPersona(Persona per){
        JpaPerson.create(per);
    }
    
    public void AltaHabitacion(Habitacion habit){
        try {
            JpaHabitacion.create(habit);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void AltaReservacion(Reservacion reserva){
        try {
            JpaReserva.create(reserva);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void AltaUsuario(Usuario user1){
        JpaUsuario.create(user1);
    }
    
    //traer huespedes
    public List<Huesped> traerHuespedes(){
        return JpaHuesp.findHuespedEntities();
    }
    
    public List<Reservacion> TraerReservasUnDeterminadoDia(){
        return JpaReserva.findReservacionEntities();
    }
    
    public List<Usuario> traerUsuarios(){
        return JpaUsuario.findUsuarioEntities();
    }
    
    public void EliminarHuesped(int id){
        try {
            JpaHuesp.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void EliminarReservasdeHuesped(int id){
        try {
            JpaReserva.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Huesped BuscarHuesped(int id){
        return JpaHuesp.findHuesped(id);
    }
    public Reservacion BuscarReservas(int id){
        return JpaReserva.findReservacion(id);
    }
    
    public void ModificarHuesped(Huesped huesp1){
        try {
            JpaHuesp.edit(huesp1);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
