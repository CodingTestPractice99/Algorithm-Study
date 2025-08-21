package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _30067 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long answer = 0;

        while (true) {
            String s = br.readLine();
            if (s == null || s.isEmpty() || s.isBlank()) {
                break;
            }
            int n = Integer.parseInt(s);
            answer += n;
        }
        System.out.println(answer / 2);
    }
}
