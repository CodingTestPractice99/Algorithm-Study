package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1264 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if (str.equals("#")) {
                break;
            }
            int count = 0;
            char strArr[] = str.toCharArray();
            for (int i = 0; i < strArr.length; i++) {
                if (String.valueOf(strArr[i]).equals("a") || String.valueOf(strArr[i]).equals("A") ||
                String.valueOf(strArr[i]).equals("e") || String.valueOf(strArr[i]).equals("E") || String.valueOf(strArr[i]).equals("i")
                || String.valueOf(strArr[i]).equals("I") || String.valueOf(strArr[i]).equals("o") ||
                String.valueOf(strArr[i]).equals("O") || String.valueOf(strArr[i]).equals("u") ||
                String.valueOf(strArr[i]).equals("U")) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}
