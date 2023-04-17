/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presenter;

import com.mycompan.models.Dado;
import com.mycompan.models.DadoCollection;
import com.mycompany.view.ResultadosView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ListIterator;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruanr
 */
public class VisualizarDadosPresenter {

    private ResultadosView view;
    private DadoCollection dados;
    private DefaultTableModel tmDados;

    public VisualizarDadosPresenter(DadoCollection dados) {
       
        view = new ResultadosView();
        view.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fechar();
            }
        });
        tmDados = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Estatistica", "valor"}
        );

        view.getTblEstatistica().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tmDados.setNumRows(0);
        Object[][] data = {
            {"Desvio padrao: ", dados.getLastDado().getDesvio()},
            {"Maior: ", dados.getLastDado().getMaior()},
            {"Media: ", dados.getLastDado().getMedia()},
            {"Menor: ", dados.getLastDado().getMenor()},
            {"Somatorio: ", dados.getLastDado().getSomatorio()},
            {"Variancia: ", dados.getLastDado().getVariancia()}
        };

        for (Object[] row : data) {
            tmDados.addRow(row);
        }

        view.getTblEstatistica().setModel(tmDados);
        view.setVisible(true);
         
    }

    public void fechar() {
        view.dispose();
    }
}
