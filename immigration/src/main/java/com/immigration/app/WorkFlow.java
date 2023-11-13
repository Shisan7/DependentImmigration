package com.immigration.app;

import java.util.*;

public class WorkFlow {
    Queue<DependentAdd> readyQueue;
    LinkedList<DependentAdd> terminatedList;
    LinkedList<DependentAdd> completedList;
    DependentAdd inProgressUser;

    /*
     * Accesses the file for readyQueue and reads through it adding it to the queue.
     */
    public void loadReadyQueue(){

    }

    public void loadTerminatedList(){

    }

    public void loadCompletedList(){

    }

    public void loadInProgressUser(){

    }

    public WorkFlow(){
        readyQueue = new LinkedList<>();
        terminatedList = new LinkedList<>();
        completedList = new LinkedList<>();
        inProgressUser = null;
    }

    public boolean DBSave(){//Saves to database.
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