package com.immigration.app;

import java.util.*;

public class WorkFlow {
    Queue<DependentAdd> readyQueue;
    LinkedList<DependentAdd> terminatedList;
    LinkedList<DependentAdd> completedList;
    DependentAdd inProgressUser;
    Reviewer inProgressReviewer;

    public WorkFlow(){
        readyQueue = new LinkedList<>();
        terminatedList = new LinkedList<>(terminatedList);
        completedList = new LinkedList<>(completedList);
        inProgressUser = null;
        inProgressReviewer = null;
    }

    public boolean DBSave(){//Saves to database.
        return false;
    }
    /**
     * Saves the given application to the readyQueue.
     * @param da is the business object/application given.
     * @return is checking weather the addition was a success or not.
     */
    public boolean addReadyApp(DependentAdd da){
        return false;
    }
    /**
     * Saves the given application to the terminated list and removes from readyQueue if found.
     * @param da is the business object/application given.
     * @return is checking weather the addition was a success or not.
     */
    public boolean addTerminatedApp(DependentAdd da){
        return false;
    }
    /**
     * Saves the given application to the comleted list and removes from readyQueue/terminated list if found.
     * @param da is the business object/application given.
     * @return is checking weather the addition was a success or not.
     */
    public boolean addCompletedApp(DependentAdd da){
        return false;
    }
    /**
     * Stores the given Reviewer object in the inProgressReviewer variable and calls DBSave function.
     * @param review is the Reviewer object to store.
     * @return is the saved Reviewer object.
     */
    public Reviewer saveReviewer(Reviewer review){
        return null;
    }
    /**
     * Converts the given DataEntry object into DependentAdd and saves to inProgressUser and calls DBSave function.
     * @param de is the application to store.
     * @return is the saved DependentAdd object.
     */
    public DependentAdd saveApplication(DataEntry de){
        return null;
    }
}