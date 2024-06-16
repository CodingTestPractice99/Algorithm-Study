package juyoungoh.beakjoon;

import java.util.Scanner;

public class _11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(answer);
    }
}
