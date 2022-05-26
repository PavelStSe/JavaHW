package HW1;

public abstract class Obstical {
    public abstract void doIt(Competitor competitor);
}

class Wall extends Obstical {
    int height;
    public Wall(int height) {
         this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}

class Pool extends Obstical {
    int length;
    public Pool(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}

class Track extends Obstical {
    int length;
    public Track(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}

class MainCross {
    public static void main(String[] args) {
        Competitor[] competitors = {new Cheetah("Bob"), new Cat("Vaska"), new Dog("Sharik")};
        Obstical[] obsticals = {new Track(80), new Wall(5), new Pool(3)};

        for (Competitor c : competitors) {
            for (Obstical b : obsticals) {
                b.doIt(c);
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }
    }
}