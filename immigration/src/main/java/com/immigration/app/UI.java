package com.immigration.app;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class UI extends Application{
    
    @Override
    public void start(Stage stage) {
        Button acceptBtn = new Button("Get application");//A button with the specified text caption.
        Button exitBtn = new Button("exit");//A button with the specified text caption.

        acceptBtn.setOnAction(value ->  {
            firstScreen(stage);
         });
        exitBtn.setOnAction(event -> {
            Platform.exit();
        });

        HBox hbox = new HBox(acceptBtn, exitBtn);
        Scene scene = new Scene(hbox, 400, 100);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);
        stage.setScene(scene);
        stage.show();
    }

    private void firstScreen(Stage stage){
        Button validateBtn = new Button("Validate info");//A button with the specified text caption.
        Button duplicateBtn = new Button("Check duplicates");//A button with the specified text caption.
        Button submitBtn = new Button("Finish review");
        Button backBtn = new Button("Go back");

        submitBtn.setOnAction(value ->  {
            secondScreen(stage);
         });
        backBtn.setOnAction(value ->  {
            start(stage);
         });
        HBox hbox = new HBox(validateBtn, duplicateBtn, submitBtn, backBtn);

        Scene scene = new Scene(hbox, 800, 100);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);
        stage.setScene(scene);
        stage.setTitle("javafxVersion");
        stage.show();
    }
    private void secondScreen(Stage stage){
        Label l = new Label("Please select what to do with the application!");
        Button approveBtn = new Button("Send for Approval");
        Button suspendBtn = new Button("Suspend the app");
        Button returnBtn = new Button("Return to review");

        approveBtn.setOnAction(value ->  {
            thirdScreen(stage);
         });
        suspendBtn.setOnAction(value ->  {
            thirdScreen(stage);
         });
        returnBtn.setOnAction(value ->  {
            firstScreen(stage);
         });
        
        HBox hbox = new HBox(l, approveBtn, suspendBtn, returnBtn);
        Scene scene = new Scene(hbox, 800, 100);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);
        stage.setScene(scene);
        stage.setTitle("Decide");
        stage.show();
    }

    private void thirdScreen(Stage stage){
        Label l = new Label("Review complete! What do you want to do next?");
        Button nextBtn = new Button("Review next");
        Button homeBtn = new Button("Go to home");
        Button exitBtn = new Button("Exit");

        homeBtn.setOnAction(value ->  {
            start(stage);
         });
        nextBtn.setOnAction(value ->  {
            firstScreen(stage);
         });
        exitBtn.setOnAction(value ->  {
            Platform.exit();
         });
        
        HBox hbox = new HBox(l, nextBtn, homeBtn, exitBtn);
        Scene scene = new Scene(hbox, 800, 100);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);
        stage.setScene(scene);
        stage.setTitle("Decide");
        stage.show();
    }

    public void ReviewerLauch(){
        launch();
    }

    /* public static void main(String[] args) {
        launch();
        WorkFlow wf = new WorkFlow();
        Reviewer rv = new Reviewer(wf);
    }*/
}

