package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class Empleado extends Persona implements Serializable{
    @Basic
    private int reservasPorDia;
    private String cargo;

    public Empleado() {
    }

    public Empleado(int reservasPorDia, String cargo, int id, String nombre, String apellido, int edad, int dni, String Direccion, Date fechaNac) {
        super(id, nombre, apellido, edad, dni, Direccion, fechaNac);
        this.reservasPorDia = reservasPorDia;
        this.cargo = cargo;
    }

    public int getReservasPorDia() {
        return reservasPorDia;
    }

    public void setReservasPorDia(int reservasPorDia) {
        this.reservasPorDia = reservasPorDia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //Override
    @Override
    public void setFechaNac(Date fechaNac) {
        super.setFechaNac(fechaNac); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getFechaNac() {
        return super.getFechaNac(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDireccion(String Direccion) {
        super.setDireccion(Direccion); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDireccion() {
        return super.getDireccion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDni(int dni) {
        super.setDni(dni); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDni() {
        return super.getDni(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getEdad() {
        return super.getEdad(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getApellido() {
        return super.getApellido(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(int id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }


    
}
