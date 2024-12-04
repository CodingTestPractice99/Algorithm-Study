package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3733 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str == null || str.isEmpty() || str.isBlank()) {
                break;
            } else {
                String[] s = str.split(" ");
                long a = Long.parseLong(s[0]);
                long b = Long.parseLong(s[1]);

                long a2 = a + 1;

                long answer = b / a2;
                System.out.println(answer);
            }
        }
    }
}
