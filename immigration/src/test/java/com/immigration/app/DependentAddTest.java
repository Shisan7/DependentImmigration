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
        dependentAdd.setImmigrantID(123);
        assertEquals(123, dependentAdd.getImmigrantID());
    }

    @Test
    void  testGetandSetDependentName(){
        DependentAdd dependentAdd = new DependentAdd(null, 0, 0);
        dependentAdd.setDependentName("Kaylie");
        assertEquals("Kaylie", dependentAdd.getDependentName());
    }

    @Test
    void testgetandsetImmigrantName(){
        DependentAdd dependentAdd = new DependentAdd(null, 0, 0);
        dependentAdd.setImmigrantName("Kaylie");
        assertEquals("Kaylie", dependentAdd.getImmigrantName());
    }

    @Test
    void testsetImmigrantAddy(){
        DependentAdd dependentAdd = new DependentAdd(null, 0, 0);
        dependentAdd.setImmigrantAddress("123 street");
        assertEquals("123 street", dependentAdd.immigrantAddress);
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
        dependentAdd.setDependentID(2);
        assertEquals(2, dependentAdd.dependentProfileID);

    }

    @Test
    void testSetRelationship(){
        DependentAdd dependentAdd = new DependentAdd("Kaylie", 123, 1);
        dependentAdd.setRelationship("Mother");
        assertEquals("Mother", dependentAdd.relationship);
    }
}
