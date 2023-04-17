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
public class ProcessarCalculo {

    private ICalculo desvioPadrao;
    private ICalculo maior;
    private ICalculo media;
    private ICalculo menor;
    private ICalculo quantidadeElementos;
    private ICalculo calculoSomatorio;
    private ICalculo calculoVariancia;
    private DadoCollection dados;

    public ProcessarCalculo(DadoCollection dados) {
        desvioPadrao = new CalculoDesvioPadrao();
        maior = new CalculoMaior();
        media = new CalculoMedia();
        menor = new CalculoMenor();
        quantidadeElementos = new CalculoQuantidadeElementos();
        calculoSomatorio = new CalculoSomatorio();
        calculoVariancia = new CalculoVariancia();
        this.dados = dados;
        processar();
    }

    public ProcessarCalculo() {
    }

    private void processar() {
        desvioPadrao.calcular(dados);
        maior.calcular(dados);
        media.calcular(dados);
        menor.calcular(dados);
        quantidadeElementos.calcular(dados);
        calculoSomatorio.calcular(dados);
        calculoVariancia.calcular(dados);
    }

}
