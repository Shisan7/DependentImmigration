package com.immigration.app;
import javafx.application.Application;
import javafx.stage.Stage;


public class DataEntry {
    //handle everything user wants to do
    //DependentAdd dependentAddApplication;
    String immigrantName;
    Boolean isReturn;

    public static void displayScreen(){
        UI2 ui2 = new UI2();
        ui2.screen1((new Stage()));
    }

    public DependentAdd createDependentAdd(){
        return null;
    }

    public DependentAdd retrieveApp(){
        /*retrieves the dependent application that has already
        *been made for the immigrant if they have an existing application
        */
        return null;
    }

    public void savetoWF(){
        //sends the applicaiton to the workflow
    }

    public static void main(String[] args){
        DependentAdd dependentAddApplication = new DependentAdd("Kaylie",  123);
        
        displayScreen();
    }

}
