package juyoungoh.beakjoon;

import java.util.Scanner;

public class _2750_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        /**
         * range : -1000 ~ 1000
         * 0 은 index[1000] 을 의미
         */
        boolean[] arr = new boolean[2001];

        for (int i = 0; i < n; i++) {
            arr[sc.nextInt() + 1000] = true;
        }

        // 정렬 과정이 따로 필요 없음
        for (int i = 0; i < 2001; i++) {
            if (arr[i]) {
                System.out.println(i - 1000);
            }
        }
    }
}
