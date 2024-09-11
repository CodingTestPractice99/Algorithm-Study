package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1110_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int m = n;
        while (true) {
            int first, second;
            if (m < 10) {
                first = 0;
                second = m;
            } else {
                first = m / 10;
                second = m % 10;
            }
            int sum = first + second;
            m = (m % 10 * 10) + (sum % 10);
            if (n == m) {
                break;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
