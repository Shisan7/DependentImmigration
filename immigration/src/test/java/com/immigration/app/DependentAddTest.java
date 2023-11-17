package com.immigration.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
 * @Author Kaylie 
 * Test class for DependentAdd
 */
public class DependentAddTest {

    @Test
    public void testGetandSetImmigrantID(){
        DependentAdd dependentAdd = new DependentAdd("Shisan", 0);
        dependentAdd.setImmigrantID(0);
        assertEquals(0, dependentAdd.getImmigrantID());
    }

    @Test
    public void  testGetandSetDependentName(){
        DependentAdd dependentAdd = new DependentAdd(null, 0);
        dependentAdd.setDependentName(null);
        assertEquals(null, dependentAdd.getDependentName());
    }

    @Test
    public void testgetandsetImmigrantName(){
        DependentAdd dependentAdd = new DependentAdd(null, 0);
        dependentAdd.setImmigrantName(null);
        assertEquals(null, dependentAdd.getImmigrantName());
    }

    @Test
    public void testsetImmigrantAddy(){
        DependentAdd dependentAdd = new DependentAdd(null, 0);
        dependentAdd.setImmigrantAddress(null);
        assertEquals(null, dependentAdd.ImmigrantAddress);
    }

    @Test
    public void testsetDependentAddy(){
        DependentAdd dependentAdd = new DependentAdd(null, 0);
        dependentAdd.setDependentAddress(null);
        assertEquals(null, dependentAdd.dependentAdress);
    }

    @Test
    public void testsetDependentID(){
        DependentAdd dependentAdd = new DependentAdd(null, 0);
        dependentAdd.setDependentID(0);
        assertEquals(0, dependentAdd.dependentProfileID);

    }

    @Test
    public void testSetRelationship(){
        DependentAdd dependentAdd = new DependentAdd(null, 0);
        dependentAdd.setRelationship(null);
        assertEquals(null, dependentAdd.relationship);
    }
}
