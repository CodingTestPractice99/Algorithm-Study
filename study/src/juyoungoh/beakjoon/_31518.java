package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31518 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < 3; i++) {
            String s = br.readLine();
            if (!s.contains("7")) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(777);
    }
}
