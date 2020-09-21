package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job testJobOne;
    Job testJobTwo;

    @Before
    public void createJobObject () {
        Employer testEmployer = new Employer();
        Location testLocation = new Location();
        PositionType testPositionType = new PositionType();
        CoreCompetency testCoreCompetency = new CoreCompetency();
        testJobOne = new Job("jobOne", testEmployer, testLocation, testPositionType, testCoreCompetency);
        testJobTwo = new Job("jobTwo", testEmployer, testLocation, testPositionType, testCoreCompetency);
    }

    @Test
    public void testSettingJobId () {
        int difference = testJobOne.getId() - testJobTwo.getId();
        assertTrue(Math.abs(difference) == 1);
    }

    @Test
    public void testJobConstructorSetsAllFields () {
        Job j = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(j instanceof Job);
        assertTrue(j.getName() == "Product tester");

        assertTrue(j.getEmployer() instanceof Employer);
        assertTrue(j.getEmployer().getValue() == "ACME");

        assertTrue(j.getLocation() instanceof Location);
        assertTrue(j.getLocation().getValue() == "Desert");

        assertTrue(j.getPositionType() instanceof PositionType);
        assertTrue(j.getPositionType().getValue() == "Quality control");

        assertTrue(j.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(j.getCoreCompetency().getValue() == "Persistence");

    }

    @Test
    public void testJobsForEquality () {
        assertFalse(testJobOne.equals(testJobTwo));
    }

    @Test
    public void testJobToString () {
        String testString = testJobOne.toString();
        Character first = testString.charAt(0);
        Character last = testString.charAt(testString.length()-1);
        assertTrue(first == last && first == '\n');
    }

    @Test
    public void testForLabelsEachField () {
        String testString = testJobOne.toString();
        assertTrue(testString.contains("ID: " + testJobOne.getId()));
        assertTrue(testString.contains("Name: " + testJobOne.getName()));
        assertTrue(testString.contains("Employer: " + testJobOne.getEmployer()));
        assertTrue(testString.contains("Location: " + testJobOne.getLocation()));
        assertTrue(testString.contains("Position Type: " + testJobOne.getPositionType()));
        assertTrue(testString.contains("Core Competency: " + testJobOne.getCoreCompetency()));
    }

    @Test
    public void testForNullFields () {
        Job n = new Job();
        String testString = n.toString();
        assertTrue(testString.contains("Name: Data not available"));
        assertTrue(testString.contains("Employer: Data not available"));
        assertTrue(testString.contains("Location: Data not available"));
        assertTrue(testString.contains("Position Type: Data not available"));
        assertTrue(testString.contains("Core Competency: Data not available"));
    }



}
