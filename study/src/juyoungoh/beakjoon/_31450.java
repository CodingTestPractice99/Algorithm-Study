package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31450 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split( " ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        if (a % b == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
