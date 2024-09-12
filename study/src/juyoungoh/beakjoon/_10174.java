package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10174 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String str2 = str.toLowerCase();
            String str3 = new StringBuilder(str2).reverse().toString();

            if (str2.equals(str3)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
