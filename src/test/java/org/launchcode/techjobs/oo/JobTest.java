package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId () {
        Job job = new Job();
        Job newJob = new Job();

        assertNotEquals(job.getId(), newJob.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job =  new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertEquals(job.getCoreCompetency().getValue(), "Persistence");
        assertEquals(job.getEmployer().getValue(), "ACME");
        assertEquals(job.getLocation().getValue(), "Desert");
        assertEquals(job.getPositionType().getValue(), "Quality control");
        assertEquals(job.getName(), "Product tester");
    }

    @Test
    public void testJobsForEquality () {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertNotEquals(job1, job2);

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("", new Employer("ACME"), null, null, null);
        String expected = "\n" +
                "Id: 5\n" +
                "Name: 'Data not available'\n" +
                "Employer: ACME\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available\n" +
                "\n";
        assertEquals(expected, job.toString());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String expected = "\n" +
                "Id: 4\n" +
                "Name: 'Product tester'\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n" +
                "\n";
        assertEquals(expected, job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer("ACME"), null, null, null);
        String expected = "\n" +
                "Id: 3\n" +
                "Name: 'Data not available'\n" +
                "Employer: ACME\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available\n" +
                "\n";
        assertEquals(expected, job.toString());
    }





}
