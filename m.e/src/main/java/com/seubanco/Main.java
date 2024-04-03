//Puxando dependências para a main
package com.seubanco;
import com.seubanco.gui.BankGUI;

import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
        //Roda a parte gráfica do programa
        Application.launch(BankGUI.class, args);
    }
}