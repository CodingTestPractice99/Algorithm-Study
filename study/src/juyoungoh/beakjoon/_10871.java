package juyoungoh.beakjoon;

import java.io.IOException;
import java.util.Scanner;

public class _10871 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String strN[] = (sc.nextLine().split(" "));
        int n = Integer.parseInt(strN[0]);
        int n2 = Integer.parseInt(strN[1]);

        int numbers[] = new int[n];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (n2 > numbers[i]) {
                sb.append(numbers[i] + " ");
            }
        }
        System.out.println(sb);
    }
}