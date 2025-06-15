package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31746 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s = "SciComLove";

        if (n % 2 == 0) {
            System.out.println(s);
        } else {
            String reversed = new StringBuilder(s).reverse().toString();
            System.out.println(reversed);
        }
    }
}
