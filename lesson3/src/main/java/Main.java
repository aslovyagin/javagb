package main.java;

import java.util.Scanner;

public class Main {

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
        guessWord();
    }
}
