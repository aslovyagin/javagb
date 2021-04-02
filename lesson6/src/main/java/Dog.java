package main.java;

public class Dog extends Animal{

    public static int count = 0;

    public Dog() {
        count++;
    }

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(double dist) {
        if (dist < 500) {
            System.out.println(this.getName() + " Пробежал " + dist);
        } else {
            System.out.println("Я не умею столько бегать");
        }
    }

    @Override
    public void swim(double dist) {
        if (dist < 10) {
            System.out.println(this.getName() + " Проплыл " + dist);
        } else {
            System.out.println("Я не умею столько плыть");
        }
    }
}
