package main.java;

public class MainTest {


    public static void main(String[] args) {

        Cat cat1 = new Cat.Builder().withName("Barsik").withApetite(20).build();
        Cat cat2 = new Cat.Builder().withName("Lolik").withApetite(90).build();
        Plate plate = Plate.getInstance(100);
        cat1.eat(plate);
        cat2.eat(plate);
        plate.info();
        System.out.println(cat1.isSatiety());
        System.out.println(cat2.isSatiety());



    }


}
