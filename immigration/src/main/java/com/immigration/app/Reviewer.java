package com.immigration.app;

public class Reviewer {
    private WorkFlow wf;
    private DependentAdd applicant;
    private boolean unique;

    public Reviewer(WorkFlow wf){
        this.wf = wf;
    }

    public void showScreen(){

    }

    public boolean save(){
        return false;
    }

    public DependentAdd GetFirst(){
        return null;
    }

    public DependentAdd GetProfile(int ANumber){
        return null;
    }

    public boolean isAssigned(){
        return false;
    }

    public boolean validate(DependentAdd da){
        return false;
    }

    public boolean sendResult(){
        return false;
    }

    public int exit(){
        return 0;
    }
}