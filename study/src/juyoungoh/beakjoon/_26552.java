package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _26552 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            int num2 = num + 1;
            while (true) {
                if (!String.valueOf(num2).contains("0")) {
                    System.out.println(num2);
                    break;
                }
                num2++;
            }
        }
    }
}
