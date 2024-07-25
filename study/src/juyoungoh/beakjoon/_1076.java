package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1076 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        String[] color = new String[10];
        long[] max = new long[10];

        int a = 0;
        int b = 0;
        long c = 0;

        int AB = 0;
        long answer = 0;

        color[0] = "black";
        color[1] = "brown";
        color[2] = "red";
        color[3] = "orange";
        color[4] = "yellow";
        color[5] = "green";
        color[6] = "blue";
        color[7] = "violet";
        color[8] = "grey";
        color[9] = "white";

        max[0] = 1;
        max[1] = 10;
        max[2] = 100;
        max[3] = 1000;
        max[4] = 10_000;
        max[5] = 100_000;
        max[6] = 1_000_000;
        max[7] = 10_000_000;
        max[8] = 100_000_000;
        max[9] = 1_000_000_000;

        for (int i = 0; i < color.length; i++) {
            if (A.equals(color[i])) {
                a = i;
            }
            if (B.equals(color[i])) {
                b = i;
            }
            if (C.equals(color[i])) {
                c = max[i];
            }
        }

        String strAB = String.valueOf(a) + String.valueOf(b);
        int intAB = Integer.parseInt(strAB);

        answer = intAB * c;
        System.out.println(answer);
    }
}
