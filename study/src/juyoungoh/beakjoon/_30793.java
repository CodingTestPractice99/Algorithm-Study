package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _30793 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        double answer = (double) a / b;

        if (answer < 0.2) {
            System.out.println("weak");
        } else if (answer >= 0.2 && answer < 0.4) {
            System.out.println("normal");
        } else if (answer >= 0.4 && answer < 0.6) {
            System.out.println("strong");
        }
    }
}
