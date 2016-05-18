/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.ejb.Stateless;
import javax.inject.Inject;
import cdi.Salario;
import cdi.SalarioDAO;
import cdi.SalarioValidator;
import java.util.List;
import javax.inject.Named;

/**
 *
 * @author josepplloo
 */
@Stateless
@Named
public class SalarioSessionBean {

    @Inject
    private SalarioDAO salarioDAO;

    @Inject
    SalarioValidator salarioValidator;

    public List<Salario> getSalarios() {
        List<Salario> salarios = salarioDAO.fetchSalario();

        for (Salario salario : salarios) {
            salario.setNeto(salarioValidator.WhatSalario(salario));
        }
        
        return salarios;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
