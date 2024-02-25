package juyoungoh.beakjoon;

import java.util.Scanner;

public class _25314 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        String str = "int";
        String str2 = "long";
        for (int i = 0; i < input / 4; i++) {
            System.out.print(str2 + " ");
        }
        System.out.println(str);
    }
}
