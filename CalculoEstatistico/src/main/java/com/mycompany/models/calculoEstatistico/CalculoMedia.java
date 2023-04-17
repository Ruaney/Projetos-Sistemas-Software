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
public class CalculoMedia implements ICalculo {

    @Override
    public void calcular(DadoCollection dados) {
        ArrayList<Double> numeros = dados.getLastDado().getNumeros();
        double total = 0;
        for (int i = 0; i < numeros.size(); i++) {
            total += numeros.get(i);
        }
        dados.getLastDado().setMedia(total / numeros.size());
    }

}
