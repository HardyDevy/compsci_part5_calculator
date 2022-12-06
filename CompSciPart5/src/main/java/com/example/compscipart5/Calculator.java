package com.example.compscipart5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Calculator extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        TextField txtfield = new TextField();
        txtfield.setText("0");
        txtfield.setAlignment(Pos.BOTTOM_RIGHT);
        final int[] operand1 = {0};
        final int[] operand2 = {0};
        final int[] answer = {0};
        final String[] operator = {""};

        final String[] showText = {"0"};
        final int[] mode = {1};

        Button btn1 = new Button("1");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode[0] == 1) {
                    operand1[0] = operand1[0] * 10 + 1;
                    showText[0] = Integer.toString(operand1[0]);
                }
                else {
                    operand2[0] = operand2[0] * 10 + 1;
                    showText[0] = Integer.toString(operand1[0]) + operator[0] + Integer.toString(operand2[0]);
                }
                txtfield.setText(showText[0]);
            }
        });
        Button btn2 = new Button("2");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode[0] == 1) {
                    operand1[0] = operand1[0] * 10 + 2;
                    showText[0] = Integer.toString(operand1[0]);
                }
                else {
                    operand2[0] = operand2[0] * 10 + 2;
                    showText[0] = Integer.toString(operand1[0]) + operator[0] + Integer.toString(operand2[0]);
                }
                txtfield.setText(showText[0]);
            }
        });
        Button btn3 = new Button("3");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode[0] == 1) {
                    operand1[0] = operand1[0] * 10 + 3;
                    showText[0] = Integer.toString(operand1[0]);
                }
                else {
                    operand2[0] = operand2[0] * 10 + 3;
                    showText[0] = Integer.toString(operand1[0]) + operator[0] + Integer.toString(operand2[0]);
                }
                txtfield.setText(showText[0]);
            }
        });
        Button btn4 = new Button("4");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode[0] == 1) {
                    operand1[0] = operand1[0] * 10 + 4;
                    showText[0] = Integer.toString(operand1[0]);
                }
                else {
                    operand2[0] = operand2[0] * 10 + 4;
                    showText[0] = Integer.toString(operand1[0]) + operator[0] + Integer.toString(operand2[0]);
                }
                txtfield.setText(showText[0]);
            }
        });
        Button btn5 = new Button("5");
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode[0] == 1) {
                    operand1[0] = operand1[0] * 10 + 5;
                    showText[0] = Integer.toString(operand1[0]);
                }
                else {
                    operand2[0] = operand2[0] * 10 + 5;
                    showText[0] = Integer.toString(operand1[0]) + operator[0] + Integer.toString(operand2[0]);
                }
                txtfield.setText(showText[0]);
            }
        });
        Button btn6 = new Button("6");
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode[0] == 1) {
                    operand1[0] = operand1[0] * 10 + 6;
                    showText[0] = Integer.toString(operand1[0]);
                }
                else {
                    operand2[0] = operand2[0] * 10 + 6;
                    showText[0] = Integer.toString(operand1[0]) + operator[0] + Integer.toString(operand2[0]);
                }
                txtfield.setText(showText[0]);
            }
        });
        Button btn7 = new Button("7");
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode[0] == 1) {
                    operand1[0] = operand1[0] * 10 + 7;
                    showText[0] = Integer.toString(operand1[0]);
                }
                else {
                    operand2[0] = operand2[0] * 10 + 7;
                    showText[0] = Integer.toString(operand1[0]) + operator[0] + Integer.toString(operand2[0]);
                }
                txtfield.setText(showText[0]);
            }
        });
        Button btn8 = new Button("8");
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode[0] == 1) {
                    operand1[0] = operand1[0] * 10 + 8;
                    showText[0] = Integer.toString(operand1[0]);
                }
                else {
                    operand2[0] = operand2[0] * 10 + 8;
                    showText[0] = Integer.toString(operand1[0]) + operator[0] + Integer.toString(operand2[0]);
                }
                txtfield.setText(showText[0]);
            }
        });
        Button btn9 = new Button("9");
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode[0] == 1) {
                    operand1[0] = operand1[0] * 10 + 9;
                    showText[0] = Integer.toString(operand1[0]);
                }
                else {
                    operand2[0] = operand2[0] * 10 + 9;
                    showText[0] = Integer.toString(operand1[0]) + operator[0] + Integer.toString(operand2[0]);
                }
                txtfield.setText(showText[0]);
            }
        });
        Button btn0 = new Button("0");
        btn0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode[0] == 1) {
                    operand1[0] = operand1[0] * 10 + 0;
                    showText[0] = Integer.toString(operand1[0]);
                }
                else {
                    operand2[0] = operand2[0] * 10 + 0;
                    showText[0] = Integer.toString(operand1[0]) + operator[0] + Integer.toString(operand2[0]);
                }
                txtfield.setText(showText[0]);
            }
        });
        Button btnplus = new Button("+");
        btnplus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode[0] == 1) {
                    operator[0] = " + ";
                    txtfield.setText(showText[0] + operator[0]);
                    mode[0] = 3;
                }
            }
        });
        Button btnminus = new Button("-");
        btnminus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode[0] == 1) {
                    operator[0] = " - ";
                    txtfield.setText(showText[0] + operator[0]);
                    mode[0] = 3;
                }
            }
        });
        Button btnmultiply = new Button("x");
        btnmultiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode[0] == 1) {
                    operator[0] = " x ";
                    txtfield.setText(showText[0] + operator[0]);
                    mode[0] = 3;
                }
            }
        });
        Button btndivide = new Button("/");
        btndivide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode[0] == 1) {
                    operator[0] = " / ";
                    txtfield.setText(showText[0] + operator[0]);
                    mode[0] = 3;
                }
            }
        });
        Button btnequals = new Button("=");
        btnequals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (operator[0] == " + ") answer[0] = operand1[0] + operand2[0];
                else if (operator[0] == " - ") answer[0] = operand1[0] - operand2[0];
                else if (operator[0] == " x ") answer[0] = operand1[0] * operand2[0];
                else if (operator[0] == " / ") answer[0] = operand1[0] / operand2[0];
                txtfield.setText(Integer.toString(answer[0]));
                operand1[0] = 0;
                operand2[0] = 0;
                operator[0] = "";
                mode[0] = 1;
            }
        });



        FlowPane root = new FlowPane();

        root.getChildren().add(txtfield);
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        root.getChildren().add(btn5);
        root.getChildren().add(btn6);
        root.getChildren().add(btn7);
        root.getChildren().add(btn8);
        root.getChildren().add(btn9);
        root.getChildren().add(btn0);
        root.getChildren().add(btnplus);
        root.getChildren().add(btnminus);
        root.getChildren().add(btndivide);
        root.getChildren().add(btnmultiply);
        root.getChildren().add(btnequals);


        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();

    }
    public static void main(String args[]){ launch();}
}
