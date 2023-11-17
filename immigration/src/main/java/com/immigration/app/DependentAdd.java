package com.immigration.app;

/*
 * @Author Kaylie
 * class DependentAdd
 * application for adding a dependent
 * includes information for immigrant and dependent
 */
public class DependentAdd {
    public int appNum;
    public int ImmigrantProfileID;
    public String ImmigrantName;
    public String ImmigrantAddress;
    public int ImmigrantANumber;
    public String dependentName;
    public int dependentProfileID;
    public String dependentAdress;
    public int dependentANumber;
    public String relationship;

    /**
     * Public constructor for the class
     */
    public DependentAdd(String dependentName, int dependentProfileID){
        this.dependentName = dependentName;
        this.dependentProfileID = dependentProfileID;
    }
    
    /*
     * sets the application number
     */
    public void setAppNum(int num){
        appNum = num;
    }

    /*
     * gets the app number
     * @return int application number
     */
    public int getAppNum(){
        return appNum;
    }

    /*
     * gets the immigrant's profile ID number
     * @return int ID
     */
    public int getImmigrantID(){
        return 0;
    }
    /*
     * sets the immigrant profile ID number
     * @return void
     */
    public void setImmigrantID(int ID){
        ImmigrantProfileID = ID;
    }
    /*
     * gets the immigrant name
     * @return String immigrant name
     */
    public String getImmigrantName(){
        return ImmigrantName;
    }
    /*
     * sets the immigrant name
     * @return void
     */
    public void setImmigrantName(String name){
        ImmigrantName = name;
    }
    /*
     * sets the immigrant address
     * @return void
     */
    public void setImmigrantAddress(String address){
        ImmigrantAddress = address;
    }

    /*
     * gets the immigrant's address
     * @return String of the immigrant address
     */
    public String getImmigrantAddress(){
        return ImmigrantAddress;
    }
    /*
     * sets the dependent name
     * @return void
     */
    public void setDependentName(String name){
        dependentName = name;
    }
    /*
     * sets the dependent name
     * @return String name of dependent
     */
    public String getDependentName(){
        return dependentName;
    }
    /*
     * sets the dependent address
     * @return void
     */
    public void setDependentAddress(String address){
        dependentAdress = address;
    }

    /*
     * gets the dependent's address
     * @return String of the dependent Address
     */
    public String getDependentAddress(){
        return dependentAdress;
    }
    /*
     * sets the dependent profile ID number
     * @return void
     */
    public void setDependentID(int id){
        dependentProfileID = id;
    }

    /*
     * gets the dependent profile ID number
     * @return int of the ID number
     */
    public int getDependentID(){
        return dependentProfileID;
    }

    /*
     * sets the dependent's A number
     * @return void
     */
    public void setDependentANum(int aNum){
        dependentANumber = aNum;
    }
    /*
     * sets the dependent Anumber
     * @return int of the dependent's A number
     */
    public int getDependentAnum(){
        return dependentANumber;
    }
    /*
     * sets the relationship between immigrant and dependent
     * @return void
     */
    public void setRelationship(String rel){
        relationship = rel;
    }
    public String getRelationship(){
        return relationship;
    }
    /*
     * sets immigrant a number
     * @param int anumber being set
     * @return void
     */
    public void setImmigrantANum(int aNum){
        ImmigrantANumber = aNum;
    }
    /*
     * gets immigrant Anum
     * @return int immigrant's A num
     */
    public int getImmigrantAnum(){
        return ImmigrantANumber;
    }
}
