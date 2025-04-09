package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _25784 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        int i[] = new int[3];
        i[0] = a;
        i[1] = b;
        i[2] = c;

        Arrays.sort(i);

        if (i[0] + i[1] == i[2]) {
            System.out.println(1);
        } else if (i[0] * i[1] == i[2]) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}
