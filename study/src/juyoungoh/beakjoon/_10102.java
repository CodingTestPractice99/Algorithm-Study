package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10102 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();

        int A = 0;
        int B = 0;

        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals("A")) {
                A++;
            } else {
                B++;
            }
        }

        if (A > B) {
            System.out.print("A");
        } else if (B > A) {
            System.out.print("B");
        } else {
            System.out.print("Tie");
        }
    }
}
