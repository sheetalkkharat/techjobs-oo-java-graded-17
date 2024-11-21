package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  System.lineSeparator() +
                "ID: " + this.getId() + "\n" +
                "Name: " + (this.getName() == null || this.getName().isEmpty() ? "Data not available" : this.getName()) + System.lineSeparator() +
                "Employer: " + (this.getEmployer() == null || this.getEmployer().getValue().isEmpty() ? "Data not available" : this.getEmployer()) + System.lineSeparator() +
                "Location: " + (this.getLocation() == null || this.getLocation().getValue().isEmpty() ? "Data not available" : this.getLocation()) + System.lineSeparator() +
                "Position Type: " + (this.getPositionType() == null || this.getPositionType().getValue().isEmpty() ? "Data not available" : this.getPositionType()) + System.lineSeparator() +
                "Core Competency: " + (this.getCoreCompetency() == null || this.getCoreCompetency().getValue().isEmpty() ? "Data not available" : this.getCoreCompetency()) + System.lineSeparator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

