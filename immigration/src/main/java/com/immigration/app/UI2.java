package com.immigration.app;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class UI2 extends Application{
    private TextField nameField;
    private TextField addressField;
    private TextField dependentIDField;
    private TextField immigrantNameField;
    private TextField immigrantaddyField;
    private TextField immigrantIDField;
    private TextField relationshipField;

    @Override
    public void start(Stage stage){
        Label l = new Label("Home page");
        Button retrieveButton = new Button("retrive old application");
        Button startnewButton = new Button("start a new application");

        startnewButton.setOnAction(value -> screen1(stage));
        retrieveButton.setOnAction(value -> screen1(stage));
        
        HBox hbox = new HBox(l, startnewButton, retrieveButton);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(20);
        Scene scene = new Scene(hbox, 400, 100);

        stage.setTitle("Data Entry Application");
        stage.setScene(scene);
        stage.show();
    }
    public void screen1(Stage stage){
        DataEntry dataEntry = new DataEntry();
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(value -> screen2(stage));


        VBox root = new VBox();

        Label nameLabel = new Label("Dependent Name: ");
        nameField = new TextField();
        Label addressLabel = new Label("Dependent Address: ");
        addressField = new TextField();
        Label dependentIDLabel = new Label("Dependent ID: ");
        dependentIDField = new TextField();

        Label relationshipLabel = new Label("Relationship to Dependent:");
        relationshipField = new TextField();

        Label immigrantaddyLabel = new Label("Immigrant Address: ");
        immigrantaddyField = new TextField();
        Label immigrantIDLabel = new Label("Immigrant Profile ID: ");
        immigrantIDField = new TextField();
        Label immigrantNameLabel = new Label("Immigrant Name: ");
        immigrantNameField = new TextField();

        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> saveDependentInfo(dataEntry));

        root.getChildren().addAll(nameLabel, nameField, addressLabel, addressField, dependentIDLabel, dependentIDField,
        immigrantNameLabel, immigrantNameField, immigrantaddyLabel, immigrantaddyField, immigrantIDLabel, immigrantIDField, 
        relationshipLabel, relationshipField, saveButton, submitButton);
        Scene scene = new Scene(new StackPane(root), 640, 480);
        stage.setTitle("Data Entry Application");
        stage.setScene(scene);
        stage.show();
    }

    public void screen2(Stage stage){
        Label l = new Label("Are you sure you want to submit?");
        Button noButton = new Button("No");
        Button yesButton = new Button("Yes");

        noButton.setOnAction(value -> screen1(stage));
        yesButton.setOnAction(value -> screen3(stage));

        HBox hbox = new HBox(l, noButton, yesButton);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(20);
        Scene scene = new Scene(hbox, 400, 100);
        stage.setScene(scene);
        stage.show();
    }

    public void screen3(Stage stage){
        Label l = new Label("Application submitted, please wait 2-3 business days for answer");
        Button returnHomeButton = new Button("Return Home");
        Button submitAnotherButton = new Button("Submit another app.");

        returnHomeButton.setOnAction(value -> start(stage));
        submitAnotherButton.setOnAction(value -> screen1(stage));

        HBox hbox = new HBox(l, returnHomeButton, submitAnotherButton);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(20);
        Scene scene = new Scene(hbox, 400, 100);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args){
        launch();
    }

    private void saveDependentInfo(DataEntry dataEntry){
        String dependentNameSaved = nameField.getText();
        String dependentAddressSaved = addressField.getText();
        String immigrantAddressSaved = immigrantaddyField.getText();
        int immigrantID = Integer.parseInt(immigrantIDField.getText());
        int dependentID = Integer.parseInt(dependentIDField.getText());
        String relationship = relationshipField.getText();
        String immigrantName = immigrantNameField.getText();
        
        DependentAdd dependentAdd = dataEntry.createDependentAdd();
        dependentAdd.setDependentName(dependentNameSaved);
        dependentAdd.setDependentAddress(dependentAddressSaved);
        dependentAdd.setImmigrantAddress(immigrantAddressSaved);
        dependentAdd.setImmigrantID(immigrantID);
        dependentAdd.setDependentID(dependentID);
        dependentAdd.setRelationship(relationship);
        dependentAdd.setImmigrantName(immigrantName);
    }
}
