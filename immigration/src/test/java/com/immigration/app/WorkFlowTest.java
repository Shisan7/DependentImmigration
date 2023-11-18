package com.immigration.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Shisan
 */
class WorkFlowTest {

    private WorkFlow workFlow = new WorkFlow();


    @Test
    void testAddReadyApp() {
        DependentAdd da = new DependentAdd(null, 0, 0); // Create a sample DependentAdd object
        assertTrue(workFlow.saveReadyQueue(da)); // Test if adding to readyQueue returns true
        assertEquals(1, workFlow.readyQueue.size()); // Test if the queue size increased
    }

    @Test
    void testAddTerminatedApp() {
        DependentAdd da = new DependentAdd(null, 0, 0); // Create a sample DependentAdd object
        assertTrue(workFlow.saveTerminatedApp(da)); // Test if adding to terminatedList returns true
        assertEquals(1, workFlow.terminatedList.size()); // Test if the list size increased
    }

    @Test
    void testAddCompletedApp() {
        DependentAdd da = new DependentAdd(null, 0, 0); // Create a sample DependentAdd object
        assertTrue(workFlow.saveCompletedApp(da)); // Test if adding to completedList returns true
        assertEquals(1, workFlow.completedList.size()); // Test if the list size increased
    }

    @Test
    void testDBSave() {
        assertTrue(workFlow.dbSave()); // Assuming DBSave returns true
    }

    @Test
    void testSaveReviewer() {
        Reviewer reviewer = new Reviewer(workFlow); // Create a sample Reviewer object
        assertNotNull(workFlow.saveReviewer(reviewer)); // Assuming saveReviewer returns null
    }

    @Test
    void testSaveApplication() {
        DataEntry de = new DataEntry(); // Create a sample DependentAdd object
        assertNotNull(workFlow.saveApplication(workFlow.inProgressUser)); // Assuming saveApplication returns null
    }
}
