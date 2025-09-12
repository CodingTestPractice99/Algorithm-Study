package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _14935 {
    static int F(String x) {
        int firstDigit = x.charAt(0) - '0'; // 첫 자리
        int length = x.length();            // 자리수
        return firstDigit * length;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine().trim();

        Set<Integer> seen = new HashSet<>();
        while (true) {
            int val = F(x);
            if (seen.contains(val)) {
                System.out.println("FA");
                break;
            }
            seen.add(val);
            x = String.valueOf(val);
        }
    }
}
