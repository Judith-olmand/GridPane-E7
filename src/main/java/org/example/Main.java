package org.example;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage){
        Button norte = new Button("NORTE");
        Button sur = new Button("SUR");
        Button este = new Button("ESTE");
        Button oeste = new Button("OESTE");
        Button centro = new Button("CENTRO");

        GridPane grid = new GridPane();
        /*
        COLUMNA 0      1        2         3
        +---------+---------+---------+---------+
        |  0 - 0  |  1 - 0  |  0 - 0  |  1 - 0  |   FILA 0
        +---------+---------+---------+---------+
        |  0 - 1  |  1 - 1  |  2 - 1  |  3 - 1  |   FILA 1
        +---------+---------+---------+---------+
        |  0 - 2  |  1 - 2  |  2 - 2  |  3 - 2  |   FILA 2
        +---------+---------+---------+---------+
        */

        //COLUMNA -- FILA
        grid.add(norte,1,0);
        grid.add(oeste,0,1);
        grid.add(centro,1,1);
        grid.add(este,2,1);
        grid.add(sur,1,2);

        //Centra la cuadrícula dentro de la ventana
        grid.setAlignment(Pos.CENTER);

        //Centra los nodos horizontalmente dentro de su celda
        GridPane.setHalignment(norte,HPos.CENTER);
        GridPane.setHalignment(sur,HPos.CENTER);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setTitle("Botones colocado en 'tabla', Ejercicio 7");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
