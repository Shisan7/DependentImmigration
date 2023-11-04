package com.immigration.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UI2 extends Application{
    private TextField nameField;
    private TextField addressField;
    private TextField immigrantaddyField;
    private TextField immigrantIDField;
    private TextField dependentIDField;
    private TextField relationshipField;

    @Override
    public void start(Stage stage){
        DataEntry dataEntry = new DataEntry();

        VBox root = new VBox();

        Label nameLabel = new Label("Dependent Name: ");
        nameField = new TextField();
        Label addressLabel = new Label("Dependent Address: ");
        addressField = new TextField();

        Label relationshipLabel = new Label("Relationship to Dependent:");
        relationshipField = new TextField();

        Label immigrantaddyLabel = new Label("Immigrant Address: ");
        immigrantaddyField = new TextField();
        Label immigrantIDLabel = new Label("Immigrant Profile ID: ");
        immigrantIDField = new TextField();

        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> saveDependentInfo(dataEntry));

        root.getChildren().addAll(nameLabel, nameField, addressLabel, addressField, immigrantaddyLabel, immigrantaddyField, immigrantIDLabel, immigrantIDField, relationshipLabel, relationshipField, saveButton);
        Scene scene = new Scene(new StackPane(root), 640, 480);
        stage.setTitle("Data Entry Application");
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
        String relationship = relationshipField.getText;
        
        DependentAdd dependentAdd = new DependentAdd(dependentNameSaved, 0);
        dependentAdd.setDependentAddress(dependentAddressSaved);
        dependentAdd.setImmigrantAddress(immigrantAddressSaved);
        dependentAdd.setImmigrantID(immigrantID);
        dependentAdd.setDependentID(dependentID);
        dependentAdd.setRelationship(relationship);
    }
}
