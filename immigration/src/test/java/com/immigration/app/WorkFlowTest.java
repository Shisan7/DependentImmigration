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
        assertTrue(workFlow.addReadyApp(da)); // Test if adding to readyQueue returns true
        assertEquals(1, workFlow.readyQueue.size()); // Test if the queue size increased
    }

    @Test
    public void testAddTerminatedApp() {
        DependentAdd da = new DependentAdd(null, 0); // Create a sample DependentAdd object
        assertTrue(workFlow.addTerminatedApp(da)); // Test if adding to terminatedList returns true
        assertEquals(1, workFlow.terminatedList.size()); // Test if the list size increased
    }

    @Test
    public void testAddCompletedApp() {
        DependentAdd da = new DependentAdd(null, 0); // Create a sample DependentAdd object
        assertTrue(workFlow.addCompletedApp(da)); // Test if adding to completedList returns true
        assertEquals(1, workFlow.completedList.size()); // Test if the list size increased
    }

    @Test
    public void testDBSave() {
        assertFalse(workFlow.DBSave()); // Assuming DBSave returns false
    }

    @Test
    public void testSaveReviewer() {
        Reviewer reviewer = new Reviewer(workFlow); // Create a sample Reviewer object
        assertNull(workFlow.saveReviewer(reviewer)); // Assuming saveReviewer returns null
    }

    @Test
    public void testSaveApplication() {
        DataEntry de = new DataEntry(); // Create a sample DependentAdd object
        assertNull(workFlow.saveApplication(de)); // Assuming saveApplication returns null
    }
}
