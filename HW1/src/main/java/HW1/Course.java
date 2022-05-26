package HW1;

public class Course {
    Obstical[] course = new Obstical[3];

    public Course(Obstical b1, Obstical b2, Obstical b3) {
        course[0] = b1;
        course[1] = b2;
        course[2] = b3;
    }

    public void doIt(Team t) {
        System.out.println("\nКоманда \"" + t.nameTeam + "\":\n");
        for (Competitor com : t.getTeammates()) {
            for (Obstical b: course) {
                b.doIt(com);
            }
        }
    }
}
