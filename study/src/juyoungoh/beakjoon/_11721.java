package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11721 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int strLength = str.length();
        int strLength10 = 0;
        if (strLength % 10 != 0) {
            strLength10 = strLength / 10 + 1;
        } else {
            strLength10 = strLength / 10;
        }
        String strArr[] = new String[strLength10];
        int index1 = 0;
        int index2 = 10;

        for (int i = 0; i < strArr.length; i++) {
            if (index2 < str.length()) {
                strArr[i] = str.substring(index1, index2);
                index1 += 10;
                index2 += 10;
            } else {
                strArr[i] = str.substring(index1);
            }
            System.out.println(strArr[i]);
        }
    }
}