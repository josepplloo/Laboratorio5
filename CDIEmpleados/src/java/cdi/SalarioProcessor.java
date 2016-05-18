/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author josepplloo
 */
@Named
@RequestScoped
public class SalarioProcessor {

    @Inject
    private SalarioDAO salarioDAO;

    @Inject
    SalarioValidator salarioValidator;

    public void execute() {
        List<Salario> Salarios = salarioDAO.fetchSalario();

        for (Salario salario : Salarios) {
            System.out.println("el salario encontrado fue: " + salario.getId()+" "+salario.getNombre() +"->"+ salario.getNeto()+salarioValidator.WhatSalario(salario));
        }

        
    }
    public List<Salario> getSalarios() {
        List<Salario> salarios = salarioDAO.fetchSalario();

        
        return salarios;
    }
}
