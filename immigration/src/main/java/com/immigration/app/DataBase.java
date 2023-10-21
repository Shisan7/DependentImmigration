package com.immigration.app;

import java.util.*;

public class DataBase{
    DependentAdd dependent;

    public DataBase(DependentAdd dependent){
        this.dependent = dependent;
    }

    public static void main(String args[]){
        Queue<DependentAdd> readyQueue = new Queue<>();
        readyQueue.add(dependent);
    }

}