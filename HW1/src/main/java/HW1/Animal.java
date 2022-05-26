package HW1;

public class Animal implements Competitor {

    String type;
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " Успешно пробежал");
        } else {
            System.out.println(type + " " + name + " не справился с забегом");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " Успешно проплыл");
        } else {
            System.out.println(type + " " + name + " не справился с заплывом");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " успешно перепрыгнул");
        } else {
            System.out.println(type + " " + name + " не смог перепрыгнуть");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " " + onDistance);
    }
}
