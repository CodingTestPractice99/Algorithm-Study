package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9093 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            for (int j = 0; j < s.length; j++) {
                String reversedStr = new StringBuilder(s[j]).reverse().toString();
                System.out.print(reversedStr + " ");
            }
            System.out.println();
        }
    }
}
