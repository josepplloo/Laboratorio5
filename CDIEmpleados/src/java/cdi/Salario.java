/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;


/**
 *
 * @author josepplloo
 */

public class Salario {
    
    public Salario(int id, String nombre, int base, int extras,int comision,int neto){
    
        this.id=id;
        this.nombre=nombre;
        this.base=base;
        this.extras=extras;
        this.comision=comision;
        this.neto=neto;
    }
    
    private int id,base, extras,comision,neto;
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNeto() {
        return neto;
    }

    public void setNeto(int neto) {
        this.neto = neto;
    }

    @Override
    public String toString() {
        return "Salario{" + "id=" + id + ", base=" + base + ", extras=" + extras + ", comision=" + comision + ", neto=" + neto + ", nombre=" + nombre + '}';
    }

    

    
    
}
