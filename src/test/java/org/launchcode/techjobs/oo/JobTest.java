package org.launchcode.techjobs.oo;

import org.junit.Test;

import javax.swing.text.Position;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.getName() instanceof String);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Tester", new Employer("CompanyB"), new Location("CityB"), new PositionType("Contract"), new CoreCompetency("Selenium"));
        Job job2 = new Job("Tester", new Employer("CompanyB"), new Location("CityB"), new PositionType("Contract"), new CoreCompetency("Selenium"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = testJob.toString();

        assertEquals(System.lineSeparator(), jobString.substring(0, System.lineSeparator().length()));
        assertEquals(System.lineSeparator(), jobString.substring(jobString.length() - System.lineSeparator().length()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = testJob.toString();

        String expected = System.lineSeparator() +
                "ID: " + testJob.getId() + System.lineSeparator() +
                "Name: " + testJob.getName() + System.lineSeparator() +
                "Employer: " + testJob.getEmployer() + System.lineSeparator() +
                "Location: " + testJob.getLocation() + System.lineSeparator() +
                "Position Type: " + testJob.getPositionType() + System.lineSeparator() +
                "Core Competency: " + testJob.getCoreCompetency() + System.lineSeparator();
        assertEquals(expected, jobString);
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Data not available", true, testJob.getLocation().isEmpty());
    }
}
