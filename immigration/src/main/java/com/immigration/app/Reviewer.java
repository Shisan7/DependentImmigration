package com.immigration.app;

public class Reviewer {
    private WorkFlow wf;
    private DependentAdd applicant;
    private boolean unique;
    /**
     * Constructor for the class
     * @param wf is the workflow object passed on
     */
    public Reviewer(WorkFlow wf){
        this.wf = wf;
    }
    /**
     * Displays the screen for reviewer
     */
    public void showScreen(){

    }
    /**
     * Saves the reviewer's progress
     * @return is weather the save was a success or not
     */
    public boolean save(){
        return false;
    }
    /**
     * Gets the first application from the readyQueue
     * @return Is the first application on the queue.
     */
    public DependentAdd GetFirst(){
        return null;
    }
    /**
     * Gets the profileID back from the USCIS system if valid after giving a profileID.
     * @param dependentProfileID is the anumber of the 
     * @return is the profileID
     */
    public int GetProfile(int dependentProfileID){
        return 0;
    }
    /**
     * Calls the USCIS function to see if the dependent is already assigned to an immigrant or not.
     * @return denotes weather assigned or not.
     */
    public boolean isAssigned(int dependentProfileID){
        return false;
    }
    /**
     * Checks to see if the apllicant is a valid immigrant and can sponsor a dependent.
     * @param da is the application.
     * @return is weather the application is valid or not to send result.
     */
    public boolean validate(DependentAdd da){
        return false;
    }
    /**
     * Sends the application to either the completed or terminated list based on the eligibility of the application.
     * @return is weather or not it was a success.
     */
    public boolean sendResult(){
        return false;
    }
    /**
     * Closes everything, saves the current progress and exits with an exit code.
     * @return is an int that denotes how the function exited.
     */
    public int exit(){
        return 0;
    }
}