package org.launchcode.techjobs.oo;


import java.util.Objects;

public class Job extends JobField{


    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        super();
    }


    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        super();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

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

    @Override
    public String toString() {
        if (getId() != 0 && name == null && employer == null && location == null && positionType == null && coreCompetency == null) {
            return "\nOOPS! This job does not seem to exist.\n";
        }

        return "\r\n" +
                "ID: " + (getId() != 0 ? getId() : "Data not available") + "\n" +
                "Name: " + (name != null && !name.isEmpty() ? name.toString() : "Data not available") + "\n" +
                "Employer: " + ( (employer == null || employer.toString().trim().isEmpty() ) ? "Data not available" : employer.toString() ) + "\n" +
                "Location: " + ( location == null || location.toString().trim().isEmpty()  ? "Data not available" : location.toString() ) + "\n" +
                "Position Type: " + (positionType == null || positionType.toString().trim().isEmpty()  ? "Data not available" : positionType.toString() ) + "\n" +
                "Core Competency: " + (coreCompetency == null || coreCompetency.toString().trim().isEmpty()  ? "Data not available" : coreCompetency.toString() ) + "\r\n" ;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Job job = (Job) obj;
        return getId() == job.getId();  // Compare based on id
    }

    // Override hashCode to return the hashCode based on id
    @Override
    public int hashCode() {
        return Objects.hash(getId());  // Use id for hashCode
    }
}