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

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        if (id != 0 && name == null && employer == null && location == null && positionType == null && coreCompetency == null) {
            return "\nOOPS! This job does not seem to exist.\n";
        }

        return "\n" +
                "Id: " + (id != 0 ? id : "Data not available") + "\n" +
                "Name: '" + (name != null && !name.isEmpty() ? name : "Data not available") + "'\n" +
                "Employer: " + (employer != null ? employer.toString() : "Data not available") + "\n" +
                "Location: " + (location != null ? location.toString() : "Data not available") + "\n" +
                "Position Type: " + (positionType != null ? positionType.toString() : "Data not available") + "\n" +
                "Core Competency: " + (coreCompetency != null ? coreCompetency.toString()  : "Data not available") + "\n" +
                "\n";
    }



}

