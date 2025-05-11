package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _33179 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        String s = br.readLine();
        String s2[] = br.readLine().split(" ");

        for (int i = 0; i < s2.length; i++) {
            int pages = Integer.parseInt(s2[i]);
            sum += pages;
            // 홀수 페이지이면 빈 페이지 추가
            if (pages % 2 == 1) {
                sum++;
            }
        }

        System.out.println((sum + 1) / 2);
    }
}
