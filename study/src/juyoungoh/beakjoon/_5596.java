package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5596 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String T = br.readLine();

        String S2[] = S.split(" ");
        String T2[] = T.split(" ");

        int sSum = 0;
        int tSum = 0;

        for (int i = 0; i < S2.length; i++) {
             sSum += Integer.parseInt(S2[i]);
        }

        for (int i = 0; i < T2.length; i++) {
            tSum += Integer.parseInt(T2[i]);
        }


        if (sSum < tSum) {
            System.out.println(tSum);
        } else if (tSum < sSum) {
            System.out.println(sSum);
        } else {
            System.out.println(sSum);
        }
    }
}
