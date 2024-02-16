package juyoungoh.beakjoon;

import java.util.Scanner;

public class _2588 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNum = scanner.nextLine();
        String secondNum = scanner.nextLine();
        int first = Integer.parseInt(firstNum);
        int second2 = Integer.parseInt(secondNum);
        String second[] = secondNum.split("");

        int total = first * second2;

        int count = 2;
        for (int i = second.length -1; i >= 0; i--) {
            int a = first * Integer.parseInt(second[count]);
            System.out.println(a);
            count--;
        }
        System.out.println(total);
    }
}
