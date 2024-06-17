package juyoungoh.beakjoon;

import java.util.Scanner;

public class _10886 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = 0;
        int zero = 0;

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 1) {
                one++;
            } else if (a == 0) {
                zero++;
            }
        }

        if (one < zero) {
            System.out.println("Junhee is not cute!");
        } else if (one > zero) {
            System.out.println("Junhee is cute!");
        }
    }
}

