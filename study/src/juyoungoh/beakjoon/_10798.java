package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strA[] = br.readLine().split("");
        String strB[] = br.readLine().split("");
        String strC[] = br.readLine().split("");
        String strD[] = br.readLine().split("");
        String strE[] = br.readLine().split("");

        String str = "";

        str += strA[0] + strB[0] + strC[0] + strD[0] + strE[0];

        for (int i = 1; i < 15; i++) {
            if (strA.length > i) {
                str += strA[i];
            }
            if (strB.length > i) {
                str += strB[i];
            }
            if (strC.length > i) {
                str += strC[i];
            }
            if (strD.length > i) {
                str += strD[i];
            }
            if (strE.length > i) {
                str += strE[i];
            }
        }
        System.out.println(str);
    }
}

