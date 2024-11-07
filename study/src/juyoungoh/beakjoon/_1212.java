package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1212 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int t = str.charAt(i) - '0';
            String s = Integer.toBinaryString(t);
            if (s.length() == 3) {
                sb.append(s);
            } else if (s.length() == 2 && i != 0) {
                sb.append("0" + s);
            } else if (s.length() == 1 && i != 0) {
                sb.append("00" + s);
            } else {
                sb.append(s);
            }
        }
        System.out.println(sb.toString());
    }
}
