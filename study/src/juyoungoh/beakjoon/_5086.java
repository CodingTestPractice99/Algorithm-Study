package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5086 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
           String str = br.readLine();
           String strArr[] = str.split(" ");
           int n = Integer.parseInt(strArr[0]);
           int m = Integer.parseInt(strArr[1]);

            if (n == 0 && m == 0) {
                break;
            } else if (n > m) {
                if (n % m == 0) {
                    System.out.println("multiple");
                } else {
                    System.out.println("neither");
                }
            } else if (n < m) {
                if (m % n == 0) {
                    System.out.println("factor");
                } else {
                    System.out.println("neither");
                }
            }
        }
    }
}
