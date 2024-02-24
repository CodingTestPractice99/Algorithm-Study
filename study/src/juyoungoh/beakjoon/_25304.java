package juyoungoh.beakjoon;

import java.util.Scanner;

public class _25304 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거
        int count = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거
        int totalValidator = 0;

        String[] value;
        for (int i = 0; i < count; i++) {
            value = scanner.nextLine().split(" ");
            int money = Integer.parseInt(value[0]);
            int counts = Integer.parseInt(value[1]);
            totalValidator += money * counts;
        }
        if (totalValidator == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
