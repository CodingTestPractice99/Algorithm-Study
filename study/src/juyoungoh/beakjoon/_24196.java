package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24196 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String encrypted = br.readLine().trim();

        StringBuilder result = new StringBuilder();
        int index = 0;

        while (index < encrypted.length()) {
            char current = encrypted.charAt(index);
            result.append(current);

            if (index == encrypted.length() - 1) {
                break;
            }

            int step = current - 'A' + 1;
            index += step;
        }
        System.out.println(result.toString());
    }
}
