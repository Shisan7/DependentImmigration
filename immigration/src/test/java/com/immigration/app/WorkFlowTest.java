package com.immigration.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Shisan
 */
public class WorkFlowTest {

    private WorkFlow workFlow = new WorkFlow();


    @Test
    public void testAddReadyApp() {
        DependentAdd da = new DependentAdd(null, 0); // Create a sample DependentAdd object
        assertTrue(workFlow.saveReadyQueue(da)); // Test if adding to readyQueue returns true
        assertEquals(1, workFlow.readyQueue.size()); // Test if the queue size increased
    }

    @Test
    public void testAddTerminatedApp() {
        DependentAdd da = new DependentAdd(null, 0); // Create a sample DependentAdd object
        assertTrue(workFlow.saveTerminatedApp(da)); // Test if adding to terminatedList returns true
        assertEquals(1, workFlow.terminatedList.size()); // Test if the list size increased
    }

    @Test
    public void testAddCompletedApp() {
        DependentAdd da = new DependentAdd(null, 0); // Create a sample DependentAdd object
        assertTrue(workFlow.saveCompletedApp(da)); // Test if adding to completedList returns true
        assertEquals(1, workFlow.completedList.size()); // Test if the list size increased
    }

    @Test
    public void testDBSave() {
        assertTrue(workFlow.DBSave()); // Assuming DBSave returns true
    }

    @Test
    public void testSaveApplication() {
        DataEntry de = new DataEntry(); // Create a sample DependentAdd object
        assertNotNull(workFlow.saveApplication(workFlow.inProgressUser)); // Assuming saveApplication returns null
    }
}
