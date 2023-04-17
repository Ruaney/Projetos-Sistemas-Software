/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.models.importarDados;

import com.mycompan.models.DadoCollection;
import java.io.File;

/**
 *
 * @author ruanr
 */
public interface IImportarArquivo {
    public void processar(File arquivo, DadoCollection dados);
}
