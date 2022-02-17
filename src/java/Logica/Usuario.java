package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUs;
    @Basic
    private String usuario;
    private String contra;
    @OneToOne
    private Empleado emp;

    public Usuario() {
    }

    public Usuario(int idUs, String usuario, String contra, Empleado emp) {
        this.idUs = idUs;
        this.usuario = usuario;
        this.contra = contra;
        this.emp = emp;
    }

    public int getIdUs() {
        return idUs;
    }

    public void setIdUs(int idUs) {
        this.idUs = idUs;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }
}
