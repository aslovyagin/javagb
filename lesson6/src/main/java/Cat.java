package main.java;

public class Cat extends Animal {

    public static int count = 0;

    public Cat() {
        count++;
    }

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(double dist) {
        if (dist < 200) {
            System.out.println(this.getName() + " Пробежал " + dist);
        } else {
            System.out.println("Я не умею столько бегать");
        }
    }

    @Override
    public void swim(double dist) {
        System.out.println("Я не умею плавать");
    }
}
