package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17598 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int lion = 0;
        int tiger = 0;

        while (true) {
            String s = br.readLine();
            if (s == null || s.isBlank() || s.isEmpty()) {
                break;
            }

            if (s.equals("Lion")) {
                lion++;
            } else if (s.equals("Tiger")) {
                tiger++;
            }
        }

        if (tiger >= 5) {
            System.out.println("Tiger");
        }
        if (lion >= 5) {
            System.out.println("Lion");
        }
    }
}
