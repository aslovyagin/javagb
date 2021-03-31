package main.java;

public class Main {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        empArray[1] = new Employee("Alexey Alex", "Lol", "ivivan@mailbox.com", "892312312", 30000, 55);
        empArray[2] = new Employee("Fill Hit", "Driver", "ivivan@mailbox.com", "892312312", 30000, 20);
        empArray[3] = new Employee("Donald Trump", "Presedint", "ivivan@mailbox.com", "892312312", 30000, 90);
        empArray[4] = new Employee("Vladimit Tutin", "Saler", "ivivan@mailbox.com", "892312312", 30000, 90);

        System.out.println("All employees:");
        for (Employee e : empArray) {
            System.out.println(e.toString());
        }
        System.out.println("All employees >40:");
        for (Employee e : empArray) {
            if (e.getAge() > 40) {
                System.out.println(e.toString());
            }
        }
    }
}
