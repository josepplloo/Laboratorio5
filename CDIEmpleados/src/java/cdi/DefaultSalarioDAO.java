/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josepplloo
 */
public class DefaultSalarioDAO implements SalarioDAO{

    @Override
    public List<Salario> fetchSalario() {
    List<Salario> results= new ArrayList<>();
    results.add(new Salario(1, "Rogelio Tecnico", 1200000, 3, 100000,0));
    results.add(new Salario(2, "Alberto Ingeniero", 1200000, 3, 200000,0));
    results.add(new Salario(3, "Bernarda Arquitecto", 2200000, 3, 1000000,0));
    results.add(new Salario(4, "Viviana Ingeniero", 1800000, 0, 200000,0));
    results.add(new Salario(5, "Blanca Tecnico", 1200000, 3, 500000,0));
    
    return results;
    }
    
}
