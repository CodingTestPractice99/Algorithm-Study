package juyoungoh.beakjoon;

import java.util.Scanner;

public class _10871_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            if (value < X) {
                sb.append(value + " ");
            }
        }
        System.out.println(sb);
    }
}
