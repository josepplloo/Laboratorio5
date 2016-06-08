/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi;

import com.model.Salarios;
import javax.enterprise.inject.Model;



/**
 *
 * @author josepplloo
 */

@Model
public class DefaultSalarioValidator implements SalarioValidator{

    @Override
    public int WhatSalario(Salarios salario) {
    
        double s;

        if (salario.getNombre().contains("tecnico")) {
            s = 1;
        } else if (salario.getNombre().contains("ingeniero")) {
            s = 2;
        } else if (salario.getNombre().contains("arquitecto")) {
            s = 3;
        } else {
            s = 0;
        }
    return salario.getBase()*(int)s+salario.getComision()+salario.getVextra()*salario.getExtras();
    }
    
}
