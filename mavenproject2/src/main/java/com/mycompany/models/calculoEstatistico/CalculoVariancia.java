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
public class CalculoVariancia implements ICalculo {

    @Override
    public void calcular(DadoCollection dados) {
        ArrayList<Double> numeros = dados.getLastDado().getNumeros();
        double p1 = 1 / Double.valueOf(numeros.size() - 1);
        double somaQuadrado = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            somaQuadrado += Math.pow(numeros.get(counter), 2);
        }
        double soma = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            soma += numeros.get(counter);
        }
        double p2 = somaQuadrado - (Math.pow(soma, 2) / Double.valueOf(numeros.size()));
        dados.getLastDado().setVariancia(p1 * p2);
    }

}
