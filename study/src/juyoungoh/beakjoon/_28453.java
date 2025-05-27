package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _28453 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            if (Integer.parseInt(s[i]) == 300) {
                sb.append(1).append(" ");
            } else if (Integer.parseInt(s[i]) >= 275) {
                sb.append(2).append(" ");
            } else if (Integer.parseInt(s[i]) >= 250) {
                sb.append(3).append(" ");
            } else if (Integer.parseInt(s[i]) < 250) {
                sb.append(4).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}

