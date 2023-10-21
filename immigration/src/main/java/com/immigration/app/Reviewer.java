package com.immigration.app;

public class Reviewer {
    WorkFlow workFlow = new WorkFlow();
    DependentAdd getApplication(){
        return workFlow.getApplication();
    }
}