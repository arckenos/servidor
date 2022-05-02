/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Arcke
 */
@Entity
@Table(name = "trabajador_salud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TrabajadorSalud.findAll", query = "SELECT t FROM TrabajadorSalud t"),
    @NamedQuery(name = "TrabajadorSalud.findByIdTrabajadorSalud", query = "SELECT t FROM TrabajadorSalud t WHERE t.idTrabajadorSalud = :idTrabajadorSalud"),
    @NamedQuery(name = "TrabajadorSalud.findByNombre", query = "SELECT t FROM TrabajadorSalud t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TrabajadorSalud.findByCurp", query = "SELECT t FROM TrabajadorSalud t WHERE t.curp = :curp"),
    @NamedQuery(name = "TrabajadorSalud.findByFechaNacimiento", query = "SELECT t FROM TrabajadorSalud t WHERE t.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "TrabajadorSalud.findByHuellaDactilar", query = "SELECT t FROM TrabajadorSalud t WHERE t.huellaDactilar = :huellaDactilar"),
    @NamedQuery(name = "TrabajadorSalud.findByCedulaProfesional", query = "SELECT t FROM TrabajadorSalud t WHERE t.cedulaProfesional = :cedulaProfesional"),
    @NamedQuery(name = "TrabajadorSalud.findByContrasenia", query = "SELECT t FROM TrabajadorSalud t WHERE t.contrasenia = :contrasenia")})
public class TrabajadorSalud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_trabajador_salud")
    private Integer idTrabajadorSalud;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "curp")
    private String curp;
    @Basic(optional = false)
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @Column(name = "huella_dactilar")
    private String huellaDactilar;
    @Basic(optional = false)
    @Column(name = "cedula_profesional")
    private String cedulaProfesional;
    @Basic(optional = false)
    @Column(name = "contrasenia")
    private String contrasenia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTrabajadorSalud")
    private Collection<Citas> citasCollection;

    public TrabajadorSalud() {
    }

    public TrabajadorSalud(Integer idTrabajadorSalud) {
        this.idTrabajadorSalud = idTrabajadorSalud;
    }

    public TrabajadorSalud(Integer idTrabajadorSalud, String nombre, String curp, Date fechaNacimiento, String huellaDactilar, String cedulaProfesional, String contrasenia) {
        this.idTrabajadorSalud = idTrabajadorSalud;
        this.nombre = nombre;
        this.curp = curp;
        this.fechaNacimiento = fechaNacimiento;
        this.huellaDactilar = huellaDactilar;
        this.cedulaProfesional = cedulaProfesional;
        this.contrasenia = contrasenia;
    }

    public Integer getIdTrabajadorSalud() {
        return idTrabajadorSalud;
    }

    public void setIdTrabajadorSalud(Integer idTrabajadorSalud) {
        this.idTrabajadorSalud = idTrabajadorSalud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getHuellaDactilar() {
        return huellaDactilar;
    }

    public void setHuellaDactilar(String huellaDactilar) {
        this.huellaDactilar = huellaDactilar;
    }

    public String getCedulaProfesional() {
        return cedulaProfesional;
    }

    public void setCedulaProfesional(String cedulaProfesional) {
        this.cedulaProfesional = cedulaProfesional;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @XmlTransient
    public Collection<Citas> getCitasCollection() {
        return citasCollection;
    }

    public void setCitasCollection(Collection<Citas> citasCollection) {
        this.citasCollection = citasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTrabajadorSalud != null ? idTrabajadorSalud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrabajadorSalud)) {
            return false;
        }
        TrabajadorSalud other = (TrabajadorSalud) object;
        if ((this.idTrabajadorSalud == null && other.idTrabajadorSalud != null) || (this.idTrabajadorSalud != null && !this.idTrabajadorSalud.equals(other.idTrabajadorSalud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.TrabajadorSalud[ idTrabajadorSalud=" + idTrabajadorSalud + " ]";
    }
    
}
