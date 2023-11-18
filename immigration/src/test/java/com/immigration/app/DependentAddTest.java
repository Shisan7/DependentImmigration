package com.immigration.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
 * @Author Kaylie 
 * Test class for DependentAdd
 */
class DependentAddTest {

    @Test
    void testGetandSetImmigrantID(){
        DependentAdd dependentAdd = new DependentAdd("Shisan", 0, 2);
        dependentAdd.setImmigrantID(0);
        assertEquals(0, dependentAdd.getImmigrantID());
    }

    @Test
    void  testGetandSetDependentName(){
        DependentAdd dependentAdd = new DependentAdd(null, 0, 0);
        dependentAdd.setDependentName(null);
        assertEquals(null, dependentAdd.getDependentName());
    }

    @Test
    void testgetandsetImmigrantName(){
        DependentAdd dependentAdd = new DependentAdd(null, 0, 0);
        dependentAdd.setImmigrantName(null);
        assertEquals(null, dependentAdd.getImmigrantName());
    }

    @Test
    void testsetImmigrantAddy(){
        DependentAdd dependentAdd = new DependentAdd(null, 0, 0);
        dependentAdd.setImmigrantAddress(null);
        assertEquals(null, dependentAdd.immigrantAddress);
    }

    @Test
    void testsetDependentAddy(){
        DependentAdd dependentAdd = new DependentAdd(null, 0, 0);
        dependentAdd.setDependentAddress(null);
        assertEquals(null, dependentAdd.dependentAdress);
    }

    @Test
    void testsetDependentID(){
        DependentAdd dependentAdd = new DependentAdd(null, 0, 0);
        dependentAdd.setDependentID(0);
        assertEquals(0, dependentAdd.dependentProfileID);

    }

    @Test
    void testSetRelationship(){
        DependentAdd dependentAdd = new DependentAdd(null, 0, 0);
        dependentAdd.setRelationship(null);
        assertEquals(null, dependentAdd.relationship);
    }
}
