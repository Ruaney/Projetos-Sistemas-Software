/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presenter;

import com.mycompan.models.Dado;
import com.mycompany.models.importarDados.IImportarArquivo;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import com.mycompan.models.DadoCollection;
import com.mycompany.view.PrincipalView;
import java.util.ListIterator;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruanr
 */
public class ImportarDadosPresenter {

    private IImportarArquivo tipoArq;
    private DadoCollection dados;
    private DefaultTableModel tmDados;
    private PrincipalView view;

    public ImportarDadosPresenter(IImportarArquivo tipoArq, DadoCollection dados, PrincipalView view) {
        this.tipoArq = tipoArq;
        this.dados = dados;
        this.view = view;
        lerArquivo();
        tmDados = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Dado"}
        );

        view.getTblDados().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tmDados.setNumRows(0);

        ListIterator<Double> it = dados.getLastDado().getNumeros().listIterator();
        while (it.hasNext()) {
            String dado = String.valueOf(it.next());
            tmDados.addRow(new Object[]{dado});
        }
        view.getTblDados().setModel(tmDados);
    }

    public void lerArquivo() {
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView());
        j.showSaveDialog(null);
        this.tipoArq.processar(j.getSelectedFile(), dados);
    }
}
