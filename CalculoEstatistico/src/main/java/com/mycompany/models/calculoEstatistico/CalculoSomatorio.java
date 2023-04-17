/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models.calculoEstatistico;

import com.mycompan.models.DadoCollection;
import java.util.ArrayList;

/**
 *
 * @author ruanr
 */
public class CalculoSomatorio implements ICalculo {

    @Override
    public void calcular(DadoCollection dados) {
         ArrayList<Double> numeros = dados.getLastDado().getNumeros();
        double soma = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            soma += numeros.get(counter);
        }
        dados.getLastDado().setSomatorio(soma);
    }

}
