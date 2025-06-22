package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _22015 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int z = Integer.parseInt(s[2]);

        int max_val = Math.max(n, Math.max(m, z));

        int result = (max_val - n) + (max_val - m) + (max_val - z);
        System.out.println(result);
    }
}
