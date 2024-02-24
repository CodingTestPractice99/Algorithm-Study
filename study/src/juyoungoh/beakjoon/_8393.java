package juyoungoh.beakjoon;

import java.util.Scanner;

public class _8393 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        int answer = 0;
        for (int i = number; i > 0; i--) { // 3, 2, 1
            answer += i;
        }
        System.out.println(answer);
    }
}
