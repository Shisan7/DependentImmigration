package com.immigration.app;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class DataEntryTest {

    @Test
    void testRetrieveApp(){
        DependentAdd application = new DependentAdd("Kaylie", 123);
        application.setAppNum(1);
        application.setDependentANum(2);
        application.setDependentAddress("123 Street");
        application.setDependentID(124);
        application.setDependentName("Lily");
        application.setImmigrantANum(3);
        application.setImmigrantAddress("123 Street");
        application.setImmigrantID(123);
        application.setImmigrantName("Kaylie");
        application.setRelationship("sister");
        DataEntry dataEntry = new DataEntry();
        dataEntry.savedAppsArray.add(application);
        assertEquals(application, dataEntry.retrieveApp(application));
    }
}
