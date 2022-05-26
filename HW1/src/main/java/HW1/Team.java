package HW1;

public class Team {

    String nameTeam ;
    Competitor[] competitors = new Competitor[3];
    public Team(String nameTeam, Competitor com1, Competitor com2, Competitor com3 ) {
        this.nameTeam  = nameTeam;
        competitors[0] = com1;
        competitors[1] = com2;
        competitors[2] = com3;
    }

      public void passedTheDistance() {
        for (Competitor com : competitors) {
           if (com.isOnDistance()) {
                com.info();
            }
        }
    }

      public void showResults() {
        for (Competitor com : competitors) {
            com.info();
        }
    }

    public Competitor[] getTeammates() {
        return competitors;
    }
}