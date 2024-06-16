package juyoungoh.beakjoon;

import java.util.Scanner;

public class _2439 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String strBlank = " ";
        String star = "*";

        for (int i = 1; i <= n; i++) { // 1, 2, 3, 4, 5
            /**
             * 1. i = 1 -> 4, 3, 2, 1
             * 2. i = 2 -> 4, 3, 2
             * 3. i = 3 -> 4, 3
             * 4. i = 4 -> 4
             */
            for (int j = n - 1; i <= j; j--) { // j = 4
                System.out.print(strBlank);
            }
            /**
             * 1. i = 1 -> 1
             * 2. i = 2 -> 1, 2
             * 3. i = 3 -> 1, 2, 3
             * 4. i = 4 -> 1, 2, 3, 4
             * 5. i = 5 -> 1, 2, 3, 4, 5
             */
            for (int k = 1; k <= i; k++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}

