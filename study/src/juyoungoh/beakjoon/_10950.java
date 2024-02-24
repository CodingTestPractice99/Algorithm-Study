package juyoungoh.beakjoon;

import java.util.Scanner;

public class _10950 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 삭제

        int a = 0;
        int b = 0;
        String[] input;

        for (int i = 0; i < count; i++) {
            input = scanner.nextLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            System.out.println(a + b);
        }
    }
}
