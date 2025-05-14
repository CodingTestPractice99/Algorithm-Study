package juyoungoh.beakjoon;

import java.util.Scanner;

public class _16600 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();

        double side = Math.sqrt(a);

        double perimeter = 4 * side;

        System.out.printf("%.6f\n", perimeter);
        sc.close();
    }
}
