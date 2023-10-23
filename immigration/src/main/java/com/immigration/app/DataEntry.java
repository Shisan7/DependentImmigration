package com.immigration.app;

public class DataEntry {
    //handle everything user wants to do
    DependentAdd Dependent;
    String ImmigrantName;
    Boolean isReturn;

    public void DisplayScreen(){
        //displays screen
    }

    public DependentAdd CreateDependentAdd(){
        //creates the DependentAdd object
        return null;
    }

    public DependentAdd RetrieveApp(){
        /*retrieves the dependent application that has already
        *been made for the immigrant if they have an existing application
        */
        return null;
    }

    public void SavetoWF(){
        //sends the applicaiton to the workflow
    }

}
