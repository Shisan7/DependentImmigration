package com.immigration.app;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class UI2 extends Application{
    DependentAdd newApplication;
    DataEntry dataEntry = new DataEntry();
    private TextField nameField;
    private TextField addressField;
    private TextField dependentIDField;
    private TextField immigrantNameField;
    private TextField immigrantaddyField;
    private TextField immigrantIDField;
    private TextField relationshipField;
    
    @Override
    public void start(Stage stage){
        dataEntry.buildRetrieveApp();
        Label l = new Label("Home Page\n");
        l.setFont(new Font(20));
        Button retrieveButton = new Button("retrive old application");
        Button startnewButton = new Button("start a new application");
        Button exitButton = new Button("Exit");

        startnewButton.setOnAction(value -> screen1(stage));
        retrieveButton.setOnAction(value -> screen1(stage));
        exitButton.setOnAction(event -> Platform.exit());
        
        HBox hbox = new HBox(startnewButton, retrieveButton, exitButton);
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER);
        VBox vbox = new VBox(l, hbox);
        vbox.setSpacing(50);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 1000, 800);

        stage.setTitle("Data Entry Application");
        stage.setScene(scene);
        stage.show();
    }
    public void screen1(Stage stage){
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(value -> {
            saveDependentInfo(dataEntry);
            screen2(stage, newApplication);
        });
        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> saveDependentInfo(dataEntry));

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

        root.getChildren().addAll(nameLabel, nameField, addressLabel, addressField, dependentIDLabel, dependentIDField,
        immigrantNameLabel, immigrantNameField, immigrantaddyLabel, immigrantaddyField, immigrantIDLabel, immigrantIDField, 
        relationshipLabel, relationshipField, saveButton, submitButton);
        Scene scene = new Scene(new StackPane(root), 1000, 800);
        stage.setTitle("Data Entry Application");
        stage.setScene(scene);
        stage.show();
    }

    public void screen2(Stage stage, DependentAdd application){
        Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
        confirmationAlert.setTitle("Confirmation");
        confirmationAlert.setHeaderText("Are you sure you want to submit?");
        confirmationAlert.setContentText("Review your application details before submitting.");
        
        ButtonType noButton = new ButtonType("No");
        ButtonType yesButton = new ButtonType("Yes");

        confirmationAlert.getButtonTypes().setAll(yesButton, noButton);

        confirmationAlert.showAndWait().ifPresent(buttonType ->{
            if (buttonType == yesButton){
                showApplicationDetails(stage, application);
            }
            else{
                screen1(stage);
            }
        });
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
        Scene scene = new Scene(hbox, 1000, 800);
        stage.setScene(scene);
        stage.show();
    }


    public void launchUI2(){
        launch();

    }

    private void saveDependentInfo(DataEntry dataEntry){
        try{
            String dependentNameSaved = nameField.getText();
            String immigrantName = immigrantNameField.getText();
            String dependentAddressSaved = addressField.getText();
            String immigrantAddressSaved = immigrantaddyField.getText();
            int immigrantID = Integer.parseInt(immigrantIDField.getText());
            int dependentID = Integer.parseInt(dependentIDField.getText());
            String relationship = relationshipField.getText();
            
            newApplication = dataEntry.createDependentAdd();
            newApplication.setDependentName(dependentNameSaved);
            newApplication.setDependentAddress(dependentAddressSaved);
            newApplication.setImmigrantAddress(immigrantAddressSaved);
            newApplication.setImmigrantID(immigrantID);
            newApplication.setDependentID(dependentID);
            newApplication.setRelationship(relationship);
            newApplication.setImmigrantName(immigrantName);
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
    }

    public void showApplicationDetails(Stage stage, DependentAdd application){
        Label nameLabel = new Label("Dependent Name: " + application.getDependentName());
        Label addressLabel = new Label("Dependent Address: "+ application.getDependentAddress());
        Label dependentIDLabel = new Label("Dependent ID: "+ application.getDependentID());

        Label relationshipLabel = new Label("Relationship tp dependent: "+ application.getRelationship());

        Label immigrantAddressLabel = new Label("Immigrant Address: " + application.getImmigrantAddress());
        Label immigrantIDLabel = new Label("Immigrant Profile ID: " + application.getImmigrantID());
        Label immigrantNameLabel = new Label("Immigrant Name: " + application.getImmigrantName());

        VBox root = new VBox(nameLabel, addressLabel, dependentIDLabel, immigrantNameLabel, immigrantAddressLabel, immigrantIDLabel, relationshipLabel);
        Button nextButton = new Button("Next");
        nextButton.setOnAction(event -> screen3(stage));
        root.getChildren().add(nextButton);
        Scene scene = new Scene(new StackPane(root), 1000, 800);
        
        stage.setTitle("Application Details");
        stage.setScene(scene);
        stage.show();
    }
}
