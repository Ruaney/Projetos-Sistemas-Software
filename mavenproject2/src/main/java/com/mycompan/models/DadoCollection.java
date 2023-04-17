/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompan.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ruanr
 */
public class DadoCollection {
    private ArrayList<Dado> dados = new ArrayList<>();

    public DadoCollection() {
        dados = new ArrayList<>();
    }
    
    public void add(Dado dado){
        if(dado!= null){
            dados.add(dado);
        }else{
            throw new RuntimeException("forneca um numero valido");
        }
    }
    public Boolean isEmpty(){
        return dados.isEmpty();
    }
    public Dado getLastDado(){
        return dados.get(dados.size()-1);
    }
}
