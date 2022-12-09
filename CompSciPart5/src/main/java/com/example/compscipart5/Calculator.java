package com.example.compscipart5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Calculator extends Application {

    public float operand1 = 0;
    public float operand2 = 0;
    public float answer = 0;
    public String operator = "";
    public String showText = "0";
    public int mode = 1;

    public String handleNumbers(int num){
        if (mode == 1) {
            operand1 = operand1 * 10 + num;
            showText = Float.toString(operand1);
        }
        else {
            operand2 = operand2 * 10 + num;
            showText = Float.toString(operand1) + operator + Float.toString(operand2);
        }
        answer = 0;
        return showText;
    }


    @Override
    public void start(Stage primaryStage) throws IOException {
        TextField txtfield = new TextField();
        txtfield.setText("0");
        txtfield.setAlignment(Pos.BOTTOM_RIGHT);


        Button btn1 = new Button("1");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                handleNumbers(1);
                txtfield.setText(showText);
            }
        });
        Button btn2 = new Button("2");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                handleNumbers(2);
                txtfield.setText(showText);
            }
        });
        Button btn3 = new Button("3");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                handleNumbers(3);
                txtfield.setText(showText);
            }
        });
        Button btn4 = new Button("4");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                handleNumbers(4);
                txtfield.setText(showText);
            }
        });
        Button btn5 = new Button("5");
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                handleNumbers(5);
                txtfield.setText(showText);
            }
        });
        Button btn6 = new Button("6");
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                handleNumbers(6);
                txtfield.setText(showText);
            }
        });
        Button btn7 = new Button("7");
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                handleNumbers(7);
                txtfield.setText(showText);
            }
        });
        Button btn8 = new Button("8");
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                handleNumbers(8);
                txtfield.setText(showText);
            }
        });
        Button btn9 = new Button("9");
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                handleNumbers(9);
                txtfield.setText(showText);
            }
        });
        Button btn0 = new Button("0");
        btn0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                handleNumbers(0);
                txtfield.setText(showText);
            }
        });
        Button btnplus = new Button("+");
        btnplus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode == 1 && answer == 0) {
                    operator = " + ";
                    txtfield.setText(showText + operator);
                    mode = 3;
                }
            }
        });
        Button btnminus = new Button("-");
        btnminus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode == 1 && answer == 0) {
                    operator = " - ";
                    txtfield.setText(showText + operator);
                    mode = 3;
                }
            }
        });
        Button btnmultiply = new Button("x");
        btnmultiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode == 1 && answer == 0) {
                    operator = " x ";
                    txtfield.setText(showText + operator);
                    mode = 3;
                }
            }
        });
        Button btndivide = new Button("/");
        btndivide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mode == 1 && answer == 0) {
                    operator = " / ";
                    txtfield.setText(showText + operator);
                    mode = 3;
                }
            }
        });
        Button btnequals = new Button("=");
        btnequals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (operator == " + ") answer = operand1 + operand2;
                else if (operator == " - ") answer = operand1 - operand2;
                else if (operator == " x ") answer = operand1 * operand2;
                else if (operator == " / ") answer = operand1 / operand2;
                txtfield.setText(Float.toString(answer));
                operand1 = 0;
                operand2 = 0;
                operator = "";
                mode = 1;
            }
        });

        FlowPane root = new FlowPane();
        root.setRowValignment(VPos.CENTER);
        root.setColumnHalignment(HPos.CENTER);

        root.setPrefWrapLength(190);
        root.setOrientation(Orientation.HORIZONTAL);
        root.setMargin(btn1, new Insets( 0, 0, 0, 27));
        root.setMargin(btn3, new Insets( 0, 0, 0, 27));
        root.setMargin(btn5, new Insets( 0, 0, 0, 27));
        root.setMargin(btn7, new Insets( 0, 0, 0, 27));
        root.setMargin(btn9, new Insets( 0, 0, 0, 27));
        root.getChildren().add(txtfield);
        root.setVgap(25);
        root.setHgap(30);
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btnplus);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        root.getChildren().add(btnminus);
        root.getChildren().add(btn5);
        root.getChildren().add(btn6);
        root.getChildren().add(btndivide);
        root.getChildren().add(btn7);
        root.getChildren().add(btn8);
        root.getChildren().add(btnmultiply);
        root.getChildren().add(btn9);
        root.getChildren().add(btn0);
        root.getChildren().add(btnequals);


        Scene scene = new Scene(root, 180, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();

    }
    public static void main(String args[]){ launch();}
}
