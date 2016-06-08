/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author josepplloo
 */
@Entity
@Table(name = "salarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salarios.findAll", query = "SELECT s FROM Salarios s"),
    @NamedQuery(name = "Salarios.findById", query = "SELECT s FROM Salarios s WHERE s.id = :id"),
    @NamedQuery(name = "Salarios.findByNombre", query = "SELECT s FROM Salarios s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "Salarios.findByBase", query = "SELECT s FROM Salarios s WHERE s.base = :base"),
    @NamedQuery(name = "Salarios.findByExtras", query = "SELECT s FROM Salarios s WHERE s.extras = :extras"),
    @NamedQuery(name = "Salarios.findByVextra", query = "SELECT s FROM Salarios s WHERE s.vextra = :vextra"),
    @NamedQuery(name = "Salarios.findByComision", query = "SELECT s FROM Salarios s WHERE s.comision = :comision"),
    @NamedQuery(name = "Salarios.findByTotal", query = "SELECT s FROM Salarios s WHERE s.total = :total")})
public class Salarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "base")
    private int base;
    @Basic(optional = false)
    @NotNull
    @Column(name = "extras")
    private int extras;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vextra")
    private int vextra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "comision")
    private int comision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private int total;

    public Salarios() {
    }

    public Salarios(Integer id) {
        this.id = id;
    }

    public Salarios(Integer id, String nombre, int base, int extras, int vextra, int comision, int total) {
        this.id = id;
        this.nombre = nombre;
        this.base = base;
        this.extras = extras;
        this.vextra = vextra;
        this.comision = comision;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }

    public int getVextra() {
        return vextra;
    }

    public void setVextra(int vextra) {
        this.vextra = vextra;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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
        if (!(object instanceof Salarios)) {
            return false;
        }
        Salarios other = (Salarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Salarios[ id=" + id + " ]";
    }
    
}
