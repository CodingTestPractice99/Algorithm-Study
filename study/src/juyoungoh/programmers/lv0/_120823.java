package juyoungoh.programmers.lv0;

import java.util.Scanner;

public class _120823 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "*";

        for (int i = 1; i <= n; i++) { // 1, 2, 3
            for (int j = 1; j <= i; j++) { // i = 1, j = 1 // i = 2, j = 1, 2
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
