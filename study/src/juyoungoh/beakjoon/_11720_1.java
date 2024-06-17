package juyoungoh.beakjoon;

import java.util.Scanner;

public class _11720_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a = sc.next();
        sc.close();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a.charAt(i)-'0';
            /**
             * a.charAt(i) - '0' 은 문자를 정수로 변환하는 작업을 수행한다.
             * '0'은 아스키 코드에서 48에 해당한다.
             * a.charAt(i)가 '3'이라면 아스키 코드 값은 51
             * 따라서 'a.charAt(i) - '0' 은 51 - 48 = 3
             * 문자 '3'을 3으로 변환하는 방식이다.
             */
        }
        System.out.print(sum);
    }
}
