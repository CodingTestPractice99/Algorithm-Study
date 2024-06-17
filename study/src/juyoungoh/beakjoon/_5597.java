package juyoungoh.beakjoon;

import java.util.Scanner;

public class _5597 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answerNum[] = new int[30];

        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            answerNum[num - 1] = num;
        }

        for (int i = 0; i < answerNum.length; i++) {
            if (answerNum[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }
}
