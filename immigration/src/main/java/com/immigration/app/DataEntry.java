package com.immigration.app;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class DataEntry {
    //handle everything user wants to do
    ArrayList<DependentAdd> savedAppsArray = new ArrayList<>();
    ArrayList<DependentAdd> finishedAppsArray = new ArrayList<>();
    String immigrantName;
    int immigrantProfileID;
    Boolean isReturn;
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
        try{
            File file = new File("inProgressUser.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                DependentAdd currentApplication = new DependentAdd(null, 0, savedAppsArray.size());
                Integer.parseInt(scanner.nextLine());
                currentApplication.setDependentName(scanner.nextLine());
                currentApplication.setDependentAddress(scanner.nextLine());
                currentApplication.setDependentID(scanner.nextInt());
                currentApplication.setDependentANum(scanner.nextInt());
                currentApplication.setImmigrantName(scanner.nextLine());
                currentApplication.setImmigrantAddress(scanner.nextLine());
                currentApplication.setImmigrantID(scanner.nextInt());
                currentApplication.setImmigrantANum(scanner.nextInt());
                currentApplication.setRelationship(scanner.nextLine());
                savedAppsArray.add(currentApplication);
            }
            scanner.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
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
