package Logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reservacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idReservacion;
    @Temporal(TemporalType.DATE)
    private Date ingreso;
    //no estoy seguro de esto ...
    @Temporal(TemporalType.DATE)
    private Date egreso;
    @Temporal(TemporalType.DATE)
    private Date diaDeRegistroDeReserva;
    @OneToOne
    private Huesped huesp;

    public Reservacion() {
    }

    public Reservacion(int idReservacion, Date ingreso, Date egreso, Date diaDeRegistroDeReserva, Huesped huesp) {
        this.idReservacion = idReservacion;
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.diaDeRegistroDeReserva = diaDeRegistroDeReserva;
        this.huesp = huesp;
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public Date getEgreso() {
        return egreso;
    }

    public void setEgreso(Date egreso) {
        this.egreso = egreso;
    }

    public Date getDiaDeRegistroDeReserva() {
        return diaDeRegistroDeReserva;
    }

    public void setDiaDeRegistroDeReserva(Date diaDeRegistroDeReserva) {
        this.diaDeRegistroDeReserva = diaDeRegistroDeReserva;
    }

    public Huesped getHuesp() {
        return huesp;
    }

    public void setHuesp(Huesped huesp) {
        this.huesp = huesp;
    }
}
