package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1373 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        int padding = 3 - (str.length() % 3);
        if (padding != 3) {
            str = "0".repeat(padding) + str;
        }

        for (int i = 0; i < str.length(); i += 3) {
            String chunk = str.substring(i, i + 3);
            int octalDigit = Integer.parseInt(chunk, 2);
            sb.append(octalDigit);
        }

        System.out.println(sb.toString());
    }
}
