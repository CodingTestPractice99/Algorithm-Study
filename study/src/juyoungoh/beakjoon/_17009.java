package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a[] = new int[3];
        int b[] = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 3; i++) {
            b[i] = Integer.parseInt(br.readLine());
        }

        int A = (a[0] * 3) + (a[1] * 2) + (a[2] * 1);
        int B = (b[0] * 3) + (b[1] * 2) + (b[2] * 1);

        if (A > B) {
            System.out.println("A");
        } else if (B > A) {
            System.out.println("B");
        } else {
            System.out.println("T");
        }
    }
}
