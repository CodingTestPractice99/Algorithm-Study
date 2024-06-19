package juyoungoh.beakjoon;

import java.util.Scanner;

public class _5543_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int burger = 2001;
        int drink = 2001;

        // 버거
        for (int i = 0; i < 3; i++) {
            int value = sc.nextInt();
            if (value < burger) { // 최솟값 찾기
                burger = value;
            }
        }

        // 음료
        for (int i = 0; i < 2; i++) {
            int value = sc.nextInt();
            if (value < drink) { // 최솟값 찾기
                drink = value;
            }
        }
        System.out.println(burger + drink - 50);
    }
}
