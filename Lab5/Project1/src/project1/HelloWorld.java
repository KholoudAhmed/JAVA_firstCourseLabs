/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Rectangle r = new Rectangle(0  , 0 , 500 , 500);
        Stop[] stop = {new Stop(0, Color.BLACK),
            new Stop(0.5, Color.WHITE),
            new Stop(1, Color.BLACK)};
        LinearGradient linear1 = new LinearGradient(0, 1, 0, 0, true, CycleMethod.NO_CYCLE, stop);
        r.setFill(linear1);
//        r.getStyleClass().add("myStyleClassRect");
        StackPane root = new StackPane();
        root.getChildren().add(r);
        Text txt = new Text("Hello world");
//        txt.getStyleClass().add("myStyleClass");
        txt.setFill(Color.BLUE);
        txt.setStroke(Color.BLUE);
        txt.setStyle("-fx-font: 40 arial;");
        root.getChildren().add(txt);
        Reflection rf = new Reflection();
        rf.setFraction(0.9f);
        txt.setEffect(rf);
        Scene scene = new Scene(root, 500, 500);
        scene.getStylesheets().add(getClass().getResource("MyStyle1.css").toString());
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
