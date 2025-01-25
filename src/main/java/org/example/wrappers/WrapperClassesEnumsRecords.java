package org.example.wrappers;

public class WrapperClassesEnumsRecords {
    public static void understandingEnums() {
        FlightCrewJob job1 = FlightCrewJob.PILOT;
        FlightCrewJob job2 = FlightCrewJob.FLIGHT_ATTENDANT;

        if (job1 == FlightCrewJob.PILOT) {
            System.out.println("job1 is PILOT");
        }

        if (job1 != job2) {
            System.out.println("job1 and job2 are different");
        }
    }

    public static void displayJobResponsibilities(FlightCrewJob job) {
        switch (job) {
            case FLIGHT_ATTENDANT:
                System.out.println("Assures passenger safety");
                break;
            case COPILOT:
                System.out.println("Assists in flying the plane");
                break;
            case PILOT:
                System.out.println("Flies the plane");
                break;
        }
    }
}
