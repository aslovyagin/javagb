package main.java;

import java.util.Scanner;

public class Main {

    public static void guessNumber() {
        int flag = 1;
        while (flag == 1) {
            int number = (int) (Math.random() * 9);
            System.out.println(number);
            for (int i = 0; i < 3; i++) {
                int userNumber = new Scanner(System.in).nextInt();
                if (userNumber == number) {
                    break;
                } else {
                    System.out.println(userNumber > number ? "Введите число меньше" : "Введите число больше");
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
            flag = new Scanner(System.in).nextInt();

        }

    }

    public static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String word = words[(int) (Math.random() * words.length)];

        while (true) {
            String answer = "";
            String currentWord = new Scanner(System.in).next();
            System.out.println("Enter your world");
            if (currentWord.equals(word)) {
                System.out.println("Win");
                return;
            }
            int minLength = Math.min(word.length(), currentWord.length());
            for (int i = 0; i < minLength; i++) {
                if (word.charAt(i) == currentWord.charAt(i)) {
                    answer += word.charAt(i);
                } else {
                    answer += "#";
                }
            }

            for (int i = 0; i < Math.random() * 15; i++) {
                answer += "#";
            }
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        guessNumber();
    }
}
