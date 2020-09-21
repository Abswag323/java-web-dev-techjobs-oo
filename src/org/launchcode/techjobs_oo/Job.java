package org.launchcode.techjobs_oo;

import java.util.Objects;

import static org.junit.Assert.assertTrue;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    public Job() {
        id = nextId;
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

    @Override
    public String toString() {
        String returnString = "\n"+
                "ID: " + this.getId() + "\n";


        if (this.getName() == null || this.getName() == "") {
            returnString += "Name: Data not available \n";
        }
        else {
            returnString += "Name: " + this.getName() + "\n";
        }

        if (this.getEmployer() == null || this.getEmployer().getValue() == "" ) {
            returnString += "Employer: Data not available \n";
        }
        else {
            returnString += "Employer: " + this.getEmployer() + "\n";
        }

        if (this.getLocation() == null || this.getLocation().getValue() == "") {
            returnString += "Location: Data not available \n";
        }
        else {
            returnString += "Location: " + this.getLocation() + "\n";
        }

        if (this.getPositionType() == null || this.getPositionType().getValue() == "") {
            returnString += "Position Type: Data not available \n";
        }
        else{
            returnString += "Position Type: " + this.getPositionType() + "\n";
        }

        if(this.getCoreCompetency() == null || this.getCoreCompetency().getValue() == "")
        {
            returnString += "Core Competency: Data not available \n";
        }
        else{
            returnString += "Core Competency: " + this.getCoreCompetency() + "\n";
        }
        return returnString;

    }


    public int getId() {
        return id;
    }

    public String getName() {
        if (this.name != null) {
            return this.name;
        } else {
            return "Data not available";
        }
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

}
