package main.java;

public class Animal {

    private String name;
    public static int count = 0;

    public Animal() {
        count++;
    }

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(double dist) {
        System.out.println(name + " Пробежал " + dist);
    }

    public void swim(double dist) {
        System.out.println(name + " Проплыл " + dist);
    }
}
