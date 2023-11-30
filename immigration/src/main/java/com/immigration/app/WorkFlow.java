package com.immigration.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WorkFlow {
    Queue<DependentAdd> readyQueue;
    LinkedList<DependentAdd> terminatedList;
    LinkedList<DependentAdd> completedList;
    LinkedList<DependentAdd> inProgressUser;

    /*
     * Accesses the file for readyQueue and reads through it adding it to the queue.
     */
    public void loadReadyQueue(){
        /*
         * loads the applications that are ready to be reviewed from readyQueue
         */
        try{
            File file = new File("readyQueue.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                DependentAdd newApplication = new DependentAdd(null, 0, 0);
                Integer.parseInt(scanner.nextLine());
                newApplication.setDependentName(scanner.nextLine());
                newApplication.setDependentAddress(scanner.nextLine());
                newApplication.setDependentID(Integer.parseInt(scanner.nextLine()));
                newApplication.setDependentANum(Integer.parseInt(scanner.nextLine()));
                newApplication.setImmigrantName(scanner.nextLine());
                newApplication.setImmigrantAddress(scanner.nextLine());
                newApplication.setImmigrantID(Integer.parseInt(scanner.nextLine()));
                newApplication.setImmigrantANum(Integer.parseInt(scanner.nextLine()));
                newApplication.setRelationship(scanner.nextLine());
                readyQueue.add(newApplication);
            }
            scanner.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }

    public void loadTerminatedList(){
        /*
         * loads the list of applications that have been terminated/not approved
         */
        try{
            File file = new File("terminatedList.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                DependentAdd newApplication = new DependentAdd(null, 0, 0);
                Integer.parseInt(scanner.nextLine());
                newApplication.setDependentName(scanner.nextLine());
                newApplication.setDependentAddress(scanner.nextLine());
                newApplication.setDependentID(Integer.parseInt(scanner.nextLine()));
                newApplication.setDependentANum(Integer.parseInt(scanner.nextLine()));
                newApplication.setImmigrantName(scanner.nextLine());
                newApplication.setImmigrantAddress(scanner.nextLine());
                newApplication.setImmigrantID(Integer.parseInt(scanner.nextLine()));
                newApplication.setImmigrantANum(Integer.parseInt(scanner.nextLine()));
                newApplication.setRelationship(scanner.nextLine());
                terminatedList.add(newApplication);
            }
            scanner.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }

    public void loadCompletedList(){
        /*
         * loads the list of applications that have been completed and approved
         */
        try{
            File file = new File("completedList.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                DependentAdd newApplication = new DependentAdd(null, 0, 0);
                Integer.parseInt(scanner.nextLine());
                newApplication.setDependentName(scanner.nextLine());
                newApplication.setDependentAddress(scanner.nextLine());
                newApplication.setDependentID(Integer.parseInt(scanner.nextLine()));
                newApplication.setDependentANum(Integer.parseInt(scanner.nextLine()));
                newApplication.setImmigrantName(scanner.nextLine());
                newApplication.setImmigrantAddress(scanner.nextLine());
                newApplication.setImmigrantID(Integer.parseInt(scanner.nextLine()));
                newApplication.setImmigrantANum(Integer.parseInt(scanner.nextLine()));
                newApplication.setRelationship(scanner.nextLine());
                completedList.add(newApplication);
            }
            scanner.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void loadInProgressUser(){
        /*
         * loads the applications that have been saved but not submitted by the user
         * returns a DependentAdd array 
         */
        try{
            ArrayList<DependentAdd> savedAppsArray = new ArrayList<>();
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
            }
            scanner.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public WorkFlow(){
        readyQueue = new LinkedList<>();
        terminatedList = new LinkedList<>();
        completedList = new LinkedList<>();
        inProgressUser = new LinkedList<>();
    }

    public boolean dbSave(){//Saves to database.
        saveReadyQueue(inProgressUser);
        saveTerminatedApp(inProgressUser);
        saveCompletedApp(inProgressUser);
        saveApplication(inProgressUser);
        return false;
    }
    /**
     * Saves the given application to the readyQueue.
     * @param da is the business object/application given.
     * @return is checking weather the addition was a success or not.
     */
    public boolean saveReadyQueue(DependentAdd da){
        return false;
    }
    /**
     * Saves the given application to the terminated list and removes from readyQueue if found.
     * @param da is the business object/application given.
     * @return is checking weather the addition was a success or not.
     */
    public boolean saveTerminatedApp(DependentAdd da){
        return false;
    }
    /**
     * Saves the given application to the comleted list and removes from readyQueue/terminated list if found.
     * @param da is the business object/application given.
     * @return is checking weather the addition was a success or not.
     */
    public boolean saveCompletedApp(DependentAdd da){
        return false;
    }
    
    /**
     * Converts the given DataEntry object into DependentAdd and saves to inProgressUser and calls DBSave function.
     * @param de is the application to store.
     * @return is the saved DependentAdd object.
     */
    public DependentAdd saveApplication(DependentAdd de){
        return null;
    }
}