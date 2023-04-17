/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models.calculoEstatistico;

import com.mycompan.models.DadoCollection;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ruanr
 */
public class CalculoMaior implements ICalculo {

    @Override
    public void calcular(DadoCollection dados) {
        ArrayList<Double> numeros = dados.getLastDado().getNumeros();

        dados.getLastDado().setMaior(Collections.max(numeros));
    }

}
