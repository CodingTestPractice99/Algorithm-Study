package juyoungoh.beakjoon;

import java.util.Scanner;

public class _10952_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // nextInt()는 입력 스트림에서 공백(공백 문자, 탭, 줄바꿈 등)을 무시하고 정수를 읽어옵니다.
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                sc.close();
                break;
            }
            System.out.println(a + b);
        }
    }
}
