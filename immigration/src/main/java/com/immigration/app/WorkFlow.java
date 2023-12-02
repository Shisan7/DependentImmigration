package com.immigration.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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

    public DependentAdd loadInProgressUser(String dependentName, int depndentID){
        /*
         * loads the applications that have been saved but not submitted by the user
         * returns a DependentAdd array 
         */
        try{
            ArrayList<DependentAdd> savedAppsArray = new ArrayList<>();
            File file = new File("inProgressUser.txt");
            Scanner scanner = new Scanner(file);
            DependentAdd currentApplication = null;
            while(scanner.hasNextLine()){
                currentApplication = new DependentAdd(null, 0, savedAppsArray.size());
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
                if(dependentName.equals(currentApplication.getDependentName()) && depndentID==currentApplication.getDependentID()){
                    scanner.close();
                    return currentApplication;
                }
            }
            scanner.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public WorkFlow(){
        readyQueue = new LinkedList<>();
        terminatedList = new LinkedList<>();
        completedList = new LinkedList<>();
        inProgressUser = new LinkedList<>();
    }

    public boolean dbSave(){//Saves to database.
        saveReadyQueue();
        saveTerminatedApp();
        saveCompletedApp();
        saveApplication();
        return true;
    }
    /**
     * Saves the given application to the readyQueue.
     * @return is checking weather the saving to file was a success or not.
     */
    public boolean saveReadyQueue(){
        try{
            FileWriter myWriter = new FileWriter("readyQueue.txt");
            Queue<DependentAdd> tempQueue = readyQueue;
            while (!tempQueue.isEmpty()) {
                DependentAdd temp = tempQueue.poll();
                myWriter.write(0);
                myWriter.write(temp.dependentName);
                myWriter.write(temp.dependentAdress);
                myWriter.write(temp.dependentProfileID);
                myWriter.write(temp.dependentANumber);
                myWriter.write(temp.immigrantName);
                myWriter.write(temp.immigrantAddress);
                myWriter.write(temp.immigrantProfileID);
                myWriter.write(temp.immigrantANumber);
                myWriter.write(temp.relationship);
            }
            myWriter.close();
        }catch(IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    /**
     * Saves the given application to the terminated list and removes from readyQueue if found.
     * @return is checking weather the addition was a success or not.
     */
    public boolean saveTerminatedApp(){
        try{
            FileWriter myWriter = new FileWriter("terminatedList.txt");
            LinkedList<DependentAdd> tempList = terminatedList;
            while (!tempList.isEmpty()) {
                DependentAdd temp = tempList.removeFirst();
                myWriter.write(0);
                myWriter.write(temp.dependentName);
                myWriter.write(temp.dependentAdress);
                myWriter.write(temp.dependentProfileID);
                myWriter.write(temp.dependentANumber);
                myWriter.write(temp.immigrantName);
                myWriter.write(temp.immigrantAddress);
                myWriter.write(temp.immigrantProfileID);
                myWriter.write(temp.immigrantANumber);
                myWriter.write(temp.relationship);
            }
            myWriter.close();
        }catch(IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    /**
     * Saves the given application to the comleted list and removes from readyQueue/terminated list if found.
     * @return is checking weather the addition was a success or not.
     */
    public boolean saveCompletedApp(){
        try{
            FileWriter myWriter = new FileWriter("completedList.txt");
            LinkedList<DependentAdd> tempList = completedList;
            while (!tempList.isEmpty()) {
                DependentAdd temp = tempList.removeFirst();
                myWriter.write(0);
                myWriter.write(temp.dependentName);
                myWriter.write(temp.dependentAdress);
                myWriter.write(temp.dependentProfileID);
                myWriter.write(temp.dependentANumber);
                myWriter.write(temp.immigrantName);
                myWriter.write(temp.immigrantAddress);
                myWriter.write(temp.immigrantProfileID);
                myWriter.write(temp.immigrantANumber);
                myWriter.write(temp.relationship);
            }
            myWriter.close();
        }catch(IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    /**
     * Converts the given DataEntry object into DependentAdd and saves to inProgressUser and calls DBSave function.
     * @return is the saved DependentAdd object.
     */
    public boolean saveApplication(){
        try{
            FileWriter myWriter = new FileWriter("inProgressUser.txt");
            LinkedList<DependentAdd> tempList = inProgressUser;
            while (!tempList.isEmpty()) {
                DependentAdd temp = tempList.removeFirst();
                myWriter.write(0);
                myWriter.write(temp.dependentName);
                myWriter.write(temp.dependentAdress);
                myWriter.write(temp.dependentProfileID);
                myWriter.write(temp.dependentANumber);
                myWriter.write(temp.immigrantName);
                myWriter.write(temp.immigrantAddress);
                myWriter.write(temp.immigrantProfileID);
                myWriter.write(temp.immigrantANumber);
                myWriter.write(temp.relationship);
            }
            myWriter.close();
        }catch(IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}