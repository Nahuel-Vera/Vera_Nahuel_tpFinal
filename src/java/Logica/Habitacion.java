package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Habitacion implements Serializable {
    @Id
    private int idHabitacion;
    @Basic
    private int piso;
    private String nomTematica;
    private String tipo;
    private float precioPorNoche;

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, int piso, String nomTematica, String tipo, float precioPorNoche) {
        this.idHabitacion = idHabitacion;
        this.piso = piso;
        this.nomTematica = nomTematica;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getNomTematica() {
        return nomTematica;
    }

    public void setNomTematica(String nomTematica) {
        this.nomTematica = nomTematica;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(float precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }
    
    
}
