package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27329 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        String first = s.substring(0, n/2);
        String second = s.substring(n/2);

        if (first.equals(second)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
