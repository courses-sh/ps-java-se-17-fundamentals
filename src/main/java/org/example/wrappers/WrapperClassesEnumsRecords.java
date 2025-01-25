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

    public static void enumsRelativeComparison() {
        CrewMember greta = new CrewMember(FlightCrewJob.PILOT, "Greta");
        CrewMember bob = new CrewMember(FlightCrewJob.FLIGHT_ATTENDANT, "Bob");
        whoIsInCharge(greta, bob);
    }

    private static void whoIsInCharge(CrewMember member1, CrewMember member2) {
        CrewMember boss = member1.getJob().compareTo(member2.getJob()) > 0 ? member1 : member2;
        System.out.println(boss.getJob().getTitle() + " " + boss.getName() + " is the boss");
    }

    public static void workingWithRecords() {
        Passenger p1 = new Passenger("Bob", 2);
        String name = p1.name();
        int bags = p1.checkedBags();

        System.out.println(name + " has " + bags + " checked bags");

        Passenger p2 = new Passenger("Maria", 1);
        if (p1.equals(p2)) {
            System.out.println("Same passenger");
        } else {
            System.out.println("OMG! Different people");
        }
    }
}
