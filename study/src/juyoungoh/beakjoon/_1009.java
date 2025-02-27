package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            int lastDigit = getLastDigit(a, b);
            System.out.println(lastDigit);
        }
    }

    private static int getLastDigit(int a, int b) {
        a = a % 10;
        if (a == 0) {
            return 10;
        }

        int result = 1;
        for (int i = 0; i < b; i++) {
            result = (result * a) % 10;
        }
        return result;
    }
}
