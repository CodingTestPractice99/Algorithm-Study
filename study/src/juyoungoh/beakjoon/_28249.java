package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _28249 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.equals("Poblano")) {
                answer += 1500;
            } else if (s.equals("Mirasol")) {
                answer += 6000;
            } else if (s.equals("Serrano")) {
                answer += 15500;
            } else if (s.equals("Cayenne")) {
                answer += 40000;
            } else if (s.equals("Thai")) {
                answer += 75000;
            } else if (s.equals("Habanero")) {
                answer += 125000;
            }
        }
        System.out.println(answer);
    }
}
