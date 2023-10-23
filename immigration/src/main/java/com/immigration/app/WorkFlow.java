package com.immigration.app;

import java.util.*;

public class WorkFlow {
    private Queue<DependentAdd> readyQueue;
    private LinkedList<DependentAdd> terminatedList;
    private LinkedList<DependentAdd> completedList;
    private DependentAdd inProgressUser;
    private Reviewer inProgressReviewer;

    public boolean DBSave(){//Saves to database
        return false;
    }
    /**
     * Saves the given application to the readyQueue
     * @param da
     * @return
     */
    public boolean addReadyApp(DependentAdd da){
        return false;
    }
    public boolean addTerminatedApp(DependentAdd da){
        return false;
    }
    public boolean addCompletedApp(DependentAdd da){
        return false;
    }
    public DataEntry saveUser(DataEntry de){
        return null;
    }
    public Reviewer saveReviewer(Reviewer review){
        return null;
    }
    public DependentAdd saveApplication(DependentAdd da){
        return null;
    }
}