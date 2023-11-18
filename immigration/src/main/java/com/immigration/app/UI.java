package com.immigration.app;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UI extends Application{
    
    @Override
    public void start(Stage stage) {
        DependentAdd da = new DependentAdd("Darius Daniels", 12345);
        WorkFlow wf = new WorkFlow();
        wf.readyQueue.add(da);
        Reviewer r = new Reviewer(wf);
        Button acceptBtn = new Button("Get application");//A button with the specified text caption.
        Button exitBtn = new Button("exit");//A button with the specified text caption.

        acceptBtn.setOnAction(value ->  {
            firstScreen(stage, r);
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

    private void firstScreen(Stage stage, Reviewer r){
        Button validateBtn = new Button("Validate info");//A button with the specified text caption.
        Button duplicateBtn = new Button("Check duplicates");//A button with the specified text caption.
        Button submitBtn = new Button("Finish review");
        Button backBtn = new Button("Go back");

        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        textArea.appendText(r.getApplicant().dependentName);
        textArea.appendText(Integer.toString(r.getApplicant().ANumber));

        Text dependentNameText = new Text(10, 20, "Dependent's Name: " + r.getApplicant().dependentName);
        Text depProfileIDText = new Text(10, 20, "Dependent's profile ID: " + Integer.toString(r.getApplicant().dependentProfileID));

        validateBtn.setOnAction(value ->  {
            if(r.validate(r.getApplicant())){
                validateBtn.setStyle("-fx-background-color: green");
            }
            else{
                validateBtn.setStyle("-fx-background-color: red");
            }
         });

        duplicateBtn.setOnAction(value ->  {
            if(r.isAssigned(r.getApplicant().dependentProfileID)){
                duplicateBtn.setStyle("-fx-background-color: green");
            }
            else{
                duplicateBtn.setStyle("-fx-background-color: red");
            }
         });

        submitBtn.setOnAction(value ->  {
            secondScreen(stage, r);
         });
        backBtn.setOnAction(value ->  {
            start(stage);
         });
        
        HBox hbox = new HBox(validateBtn, duplicateBtn, submitBtn, backBtn);
        VBox vbox = new VBox(dependentNameText, depProfileIDText, hbox);

        Scene scene = new Scene(vbox, 800, 300);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        stage.setScene(scene);
        stage.setTitle("javafxVersion");
        stage.show();
    }
    private void secondScreen(Stage stage, Reviewer r){
        Label l = new Label("Please select what to do with the application!");
        Button approveBtn = new Button("Send for Approval");
        Button suspendBtn = new Button("Suspend the app");
        Button returnBtn = new Button("Return to review");

        approveBtn.setOnAction(value ->  {
            r.sendResult(r.getApplicant(), r.getWorkFLow(), true);
            thirdScreen(stage, r);
         });
        suspendBtn.setOnAction(value ->  {
            r.sendResult(r.getApplicant(), r.getWorkFLow(), false);
            thirdScreen(stage, r);
         });
        returnBtn.setOnAction(value ->  {
            firstScreen(stage, r);
         });
        
        HBox hbox = new HBox(l, approveBtn, suspendBtn, returnBtn);
        Scene scene = new Scene(hbox, 800, 100);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);
        stage.setScene(scene);
        stage.setTitle("Decide");
        stage.show();
    }

    private void thirdScreen(Stage stage, Reviewer r){
        Label l = new Label("Review complete! What do you want to do next?");
        Button nextBtn = new Button("Review next");
        Button homeBtn = new Button("Go to home");
        Button exitBtn = new Button("Exit");

        homeBtn.setOnAction(value ->  {
            start(stage);
         });
        nextBtn.setOnAction(value ->  {
            firstScreen(stage, r);
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

    public void ReviewerLaunch(){
        launch();
    }

    /* public static void main(String[] args) {
        launch();
        WorkFlow wf = new WorkFlow();
        Reviewer rv = new Reviewer(wf);
    }*/
}

