/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presenter;

import com.mycompan.models.DadoCollection;
import com.mycompany.models.calculoEstatistico.ProcessarCalculo;
import com.mycompany.view.PrincipalView;
import javax.swing.JOptionPane;

/**
 *
 * @author ruanr
 */
public class CalculoEstatisticoPresenter {

    public CalculoEstatisticoPresenter(DadoCollection dados, PrincipalView view) {
        if (dados.isEmpty()) {
            JOptionPane.showMessageDialog(view, "importe os dados.");
            return;
        }

        new ProcessarCalculo(dados);
        String message = "Quantidade de dados: " + dados.getLastDado().getQtdElementos();
        view.getLblQuantidade().setText(message);
        new VisualizarDadosPresenter(dados);
    }

}
