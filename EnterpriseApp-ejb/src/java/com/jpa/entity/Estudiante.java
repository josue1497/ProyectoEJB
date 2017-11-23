/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rental Servicios
 */
@Entity
@Table(name = "estudiante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiante.findAll", query = "SELECT e FROM Estudiante e")
    , @NamedQuery(name = "Estudiante.findById", query = "SELECT e FROM Estudiante e WHERE e.id = :id")
    , @NamedQuery(name = "Estudiante.findByCiEstudiante", query = "SELECT e FROM Estudiante e WHERE e.ciEstudiante = :ciEstudiante")
    , @NamedQuery(name = "Estudiante.findByNombreCEstudiante", query = "SELECT e FROM Estudiante e WHERE e.nombreCEstudiante = :nombreCEstudiante")
    , @NamedQuery(name = "Estudiante.findByEdadEstudiante", query = "SELECT e FROM Estudiante e WHERE e.edadEstudiante = :edadEstudiante")
    , @NamedQuery(name = "Estudiante.findByGeneroEstudiante", query = "SELECT e FROM Estudiante e WHERE e.generoEstudiante = :generoEstudiante")})
public class Estudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 10)
    @Column(name = "ci_estudiante")
    private String ciEstudiante;
    @Size(max = 60)
    @Column(name = "nombre_c_estudiante")
    private String nombreCEstudiante;
    @Column(name = "edad_estudiante")
    private Integer edadEstudiante;
    @Size(max = 5)
    @Column(name = "genero_estudiante")
    private String generoEstudiante;

    public Estudiante() {
    }

    public Estudiante(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCiEstudiante() {
        return ciEstudiante;
    }

    public void setCiEstudiante(String ciEstudiante) {
        this.ciEstudiante = ciEstudiante;
    }

    public String getNombreCEstudiante() {
        return nombreCEstudiante;
    }

    public void setNombreCEstudiante(String nombreCEstudiante) {
        this.nombreCEstudiante = nombreCEstudiante;
    }

    public Integer getEdadEstudiante() {
        return edadEstudiante;
    }

    public void setEdadEstudiante(Integer edadEstudiante) {
        this.edadEstudiante = edadEstudiante;
    }

    public String getGeneroEstudiante() {
        return generoEstudiante;
    }

    public void setGeneroEstudiante(String generoEstudiante) {
        this.generoEstudiante = generoEstudiante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jpa.entity.Estudiante[ id=" + id + " ]";
    }
    
}
