package com.energia.gui;

import com.energia.model.Conta;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class appGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tela de Login");

        // Criar um layout VBox para organizar os elementos
        VBox layout = new VBox();
        layout.setPadding(new Insets(10));
        layout.setSpacing(10);

        // Adicionar campos para usuário e senha
        TextField txtUsuario = new TextField();
        txtUsuario.setPromptText("Usuário");
        PasswordField pfSenha = new PasswordField();
        pfSenha.setPromptText("Senha");

        // Adicionar botão de login
        Button btnEntrar = new Button("Entrar");
        btnEntrar.setOnAction(e -> {
            primaryStage.close(); // Fechar tela de login
            openHomeScreen(); // Abrir tela home
        });

        // Adicionar os elementos ao layout
        layout.getChildren().addAll(txtUsuario, pfSenha, btnEntrar);

        // Criar a cena e exibir a janela
        Scene scene = new Scene(layout, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void openHomeScreen() {
        Stage homeStage = new Stage();
        homeStage.setTitle("Tela Principal");

        // Criar um layout VBox para organizar os elementos
        VBox layout = new VBox();
        layout.setPadding(new Insets(10));
        layout.setSpacing(10);

        // Criar labels para exibir informações
        Label lblSaldo = new Label("Saldo: R$ 1000,00");
        Label lblNome = new Label("Nome: João da Silva");
        Label lblDataFatura = new Label("Data da Fatura: 01/04/2024");
        Label lblIdCliente = new Label("ID de Cliente: 123456");

        // Adicionar botões para fazer pagamento pix e gerar boleto
        Button btnPagamentoPix = new Button("Pagamento Pix");
        btnPagamentoPix.setOnAction(e -> openPaymentScreen("Pix"));

        Button btnGerarBoleto = new Button("Gerar Boleto");
        btnGerarBoleto.setOnAction(e -> openPaymentScreen("Boleto"));

        // Adicionar os elementos ao layout
        layout.getChildren().addAll(lblSaldo, lblNome, lblDataFatura, lblIdCliente, btnPagamentoPix, btnGerarBoleto);

        // Criar a cena e exibir a janela
        Scene scene = new Scene(layout, 300, 200);
        homeStage.setScene(scene);
        homeStage.show();
    }

    private void openPaymentScreen(String method) {
        Stage paymentStage = new Stage();
        paymentStage.setTitle("Pagamento " + method);

        // Aqui você pode adicionar a lógica para abrir a tela de pagamento
        // Por exemplo, exibir a imagem do método de pagamento selecionado

        // No momento, vou apenas exibir uma mensagem na tela
        Label lblMessage = new Label("Tela de pagamento " + method);
        Scene scene = new Scene(lblMessage, 300, 200);
        paymentStage.setScene(scene);
        paymentStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}