package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _13985 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[2]);
        int sum = Integer.parseInt(s[4]);

        if (a + b == sum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
