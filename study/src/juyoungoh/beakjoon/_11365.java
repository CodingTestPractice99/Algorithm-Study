package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11365 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals("END")) {
                break;
            } else {
                String reversed = new StringBuilder(str).reverse().toString();
                System.out.println(reversed);
            }
        }
    }
}
