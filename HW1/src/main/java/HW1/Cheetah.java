package HW1;

public class Cheetah implements Competitor {

    String name;
    String type;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean active;

    public Cheetah(String name) {
        this.type = "Гепард";
        this.name = name;
        this.maxRunDistance = 2200;
        this.maxJumpHeight = 15;
        this.maxSwimDistance = 10;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " Успешно пробежал");
        } else {
            System.out.println(type + " " + name + " не справился с забегом");
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " Успешно проплыл");
        } else {
            System.out.println(type + " " + name + " не справился с заплывом");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " успешно перепрыгнул");
        } else {
            System.out.println(type + " " + name + " не смог перепрыгнуть");
            active = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " " + active);
    }
}
