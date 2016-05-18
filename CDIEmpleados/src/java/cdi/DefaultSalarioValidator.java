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
public class DefaultSalarioValidator implements SalarioValidator{

    @Override
    public int WhatSalario(Salario salario) {
    
        double s;

        if (salario.getNombre().contains("Tecnico")) {
            s = 1;
        } else if (salario.getNombre().contains("Ingeniero")) {
            s = 2;
        } else if (salario.getNombre().contains("Arquitecto")) {
            s = 3;
        } else {
            s = 0;
        }
    return salario.getBase()*(int)s+salario.getComision()+100000*salario.getExtras();
    }
    
}
