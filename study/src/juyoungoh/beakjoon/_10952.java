package juyoungoh.beakjoon;

import java.util.Scanner;

public class _10952 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            String str[] = sc.nextLine().split(" ");
            if ((str[0].equals("0") && str[1].equals("0"))) {
                break;
            }
            for (int i = 0; i < str.length; i++) {
                sum = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
