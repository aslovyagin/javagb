package main.java;

public class Plate {

    private int food;

    private static Plate instance;

    private Plate() {

    }

    private Plate(int n) {
        this.food = n;
    }

    public static Plate getInstance(int n) {
        if (instance == null) {
            instance = new Plate(n);
        }
        return instance;
    }


    public void decreaseFood(int n) {
        if (isEnough(n)) {
            food -= n;
        } else System.out.println("Не хватает");
    }

    public void increaseFood(int n) {
        food += n;
    }

    public boolean isEnough(int n) {
        return (food - n) >= 0;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}