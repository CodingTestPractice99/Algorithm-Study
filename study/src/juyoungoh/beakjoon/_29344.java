package juyoungoh.beakjoon;

import java.util.Scanner;

public class _29344 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String speech = sc.nextLine();

        String[] sentences = speech.split("\\.");
        StringBuilder result = new StringBuilder();

        for (String sentence : sentences) {
            if (sentence.isEmpty()) continue;

            String[] words = sentence.trim().split(" ");
            for (int i = words.length - 1; i >= 0; i--) {
                result.append(words[i]);
                if (i > 0) result.append(" ");
            }
            result.append(".");
            result.append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
