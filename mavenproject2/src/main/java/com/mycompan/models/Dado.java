/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompan.models;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ruanr
 */
public class Dado {

    private ArrayList<Double> numeros;
    private Double variancia;
    private Double somatorio;
    private LocalDate dataResultado;
    private int qtdElementos;
    private Double menor;
    private Double maior;
    private Double media;
    private Double desvio;
    
    public Dado(ArrayList<Double> n) {
        this.numeros = n;
    }

    /**
     * @return the numeros
     */
    public ArrayList<Double> getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(ArrayList<Double> numeros) {
        this.numeros = numeros;
    }

    /**
     * @return the variancia
     */
    public Double getVariancia() {
        return variancia;
    }

    /**
     * @param variancia the variancia to set
     */
    public void setVariancia(Double variancia) {
        this.variancia = variancia;
    }

    /**
     * @return the somatorio
     */
    public Double getSomatorio() {
        return somatorio;
    }

    /**
     * @param somatorio the somatorio to set
     */
    public void setSomatorio(Double somatorio) {
        this.somatorio = somatorio;
    }

    /**
     * @return the dataResultado
     */
    public LocalDate getDataResultado() {
        return dataResultado;
    }

    /**
     * @param dataResultado the dataResultado to set
     */
    public void setDataResultado(LocalDate dataResultado) {
        this.dataResultado = dataResultado;
    }

    /**
     * @return the qtdElementos
     */
    public int getQtdElementos() {
        return qtdElementos;
    }

    /**
     * @param qtdElementos the qtdElementos to set
     */
    public void setQtdElementos(int qtdElementos) {
        this.qtdElementos = qtdElementos;
    }

    /**
     * @return the menor
     */
    public Double getMenor() {
        return menor;
    }

    /**
     * @param menor the menor to set
     */
    public void setMenor(Double menor) {
        this.menor = menor;
    }

    /**
     * @return the maior
     */
    public Double getMaior() {
        return maior;
    }

    /**
     * @param maior the maior to set
     */
    public void setMaior(Double maior) {
        this.maior = maior;
    }

    /**
     * @return the media
     */
    public Double getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(Double media) {
        this.media = media;
    }

    /**
     * @return the desvio
     */
    public Double getDesvio() {
        return desvio;
    }

    /**
     * @param desvio the desvio to set
     */
    public void setDesvio(Double desvio) {
        this.desvio = desvio;
    }
}
