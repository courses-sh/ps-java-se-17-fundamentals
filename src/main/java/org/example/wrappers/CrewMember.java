package org.example.wrappers;

public class CrewMember {
    FlightCrewJob job;
    String name;

    CrewMember(FlightCrewJob job, String name) {
        this.job = job;
        this.name = name;
    }

    public FlightCrewJob getJob() {
        return this.job;
    }

    public String getName() {
        return this.name;
    }
}
