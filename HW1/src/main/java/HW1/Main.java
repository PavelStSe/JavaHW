package HW1;

public class Main {

    public static void main(String[] args) {
        Course c = new Course(new Track(80), new Pool(3), new Wall(5));
        Team team = new Team("Подопытные", new Cheetah("Франциск"), new Cat("Барсик"), new Dog("Муха"));
         c.doIt(team);

            System.out.println("\nПобедили");
            team.passedTheDistance();

            System.out.println("\nРезультат");
            team.showResults();
        }
    }

