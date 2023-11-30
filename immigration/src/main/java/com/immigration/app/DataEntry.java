package com.immigration.app;
import java.util.LinkedList;



public class DataEntry {
    //handle everything user wants to do
    LinkedList<DependentAdd> savedAppsArray = new LinkedList<>();
    LinkedList<DependentAdd> finishedAppsArray = new LinkedList<>();
    String immigrantName;
    int immigrantProfileID;
    /*
     * creates a new DependentAdd application that is blank to fill out
     */
    public DependentAdd createDependentAdd(){
        DependentAdd newApplication = new DependentAdd(immigrantName, 0, savedAppsArray.size());
        savedAppsArray.add(newApplication);
        return newApplication;
    }

    public DependentAdd retrieveApp(DependentAdd application){
        /*retrieves the dependent application that has already
        *been made for the immigrant if they have an existing application
        */
        DependentAdd returnApp = null;
        for (DependentAdd app : savedAppsArray) {
            if(app.equals(application)){
                returnApp = app;
                return returnApp;
            }
            
        }
        return returnApp;
    }

    public void buildRetrieveApp(){
        /* might delete, call retrieve app in Workflow 
         * build workflow object
         * call function that builds the array
         * add that array to 
        */
        //savedAppsArray.add(currentApplication)
    }

    public void savetoWF(){
        //sends the applicaiton to the workflow
    }

    public static void main(String[] args){
        /*
         * launches UI2 and displays screen
         * stores the information in DependentAdd variables
         * if application completed, stores in readyQueue.txt
         * if application not completed, stpres in inProgressUser.txt
         */
        UI2 ui2 = new UI2();
        ui2.launchUI2();
    }

}
