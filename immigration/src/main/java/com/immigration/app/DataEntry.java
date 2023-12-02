package com.immigration.app;
import java.util.LinkedList;



public class DataEntry {
    //handle everything user wants to do
    LinkedList<DependentAdd> savedAppsArray = new LinkedList<>();
    LinkedList<DependentAdd> finishedAppsArray = new LinkedList<>();
    String immigrantName;
    int immigrantProfileID;
    WorkFlow workflow;

    public DataEntry(){
        this.workflow = new WorkFlow();
    }

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
        LinkedList<DependentAdd> list = workflow.loadInProgressUser();
        int i;
        for(i=0; i<list.size(); i++){
            if(application.getImmigrantName().equals(list.get(i).getImmigrantName())){
                return list.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args){
        /*
         * launches UI2 and displays screen
         * stores the information in DependentAdd variables
         * if application completed, stores in readyQueue.txt
         * if application not completed, stpres in inProgressUser.txt
         */
        WorkFlow workFlow = new WorkFlow();
        workFlow.loadInProgressUser();
 
        UI2 ui2 = new UI2();
        ui2.launchUI2();
    }

}
