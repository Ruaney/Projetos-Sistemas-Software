/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models.importarDados;

import com.mycompan.models.Dado;
import com.mycompan.models.DadoCollection;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ruanr
 */
public class ImportarCSV implements IImportarArquivo {


    public ImportarCSV() {
    }

    @Override
    public void processar(File arquivo, DadoCollection dados) {
        try {
            FileReader filereader = new FileReader(arquivo);
            CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
            List<String[]> numeros = csvReader.readAll();
            ArrayList<Double> numerosCast = new ArrayList<>();
            for (String[] numero : numeros) {
                numerosCast.add(Double.valueOf(numero[0]));
            }
            Dado d = new Dado(numerosCast);
            d.setDataResultado(LocalDate.now());
            dados.add(d);
        } catch (IOException e) {
            JFrame f = new JFrame("frame");
            JDialog d = new JDialog(f, "Erro");
            JLabel l = new JLabel("Erro ao processar csv.");
            d.add(l);
            d.setSize(250, 100);
            d.setVisible(true);
        }
    }

}
