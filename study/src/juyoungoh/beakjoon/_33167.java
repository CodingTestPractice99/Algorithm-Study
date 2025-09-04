package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _33167 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String t = br.readLine();

        int aWin = 0;
        int bWin = 0;

        for (int i = 0; i < n; i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (a == 'R' && b == 'P') {
                bWin++;
            } else if (a == 'S' && b == 'R') {
                bWin++;
            } else if (a == 'S' && b == 'P') {
                aWin++;
            }
        }
        System.out.println(aWin + " " + bWin);
    }
}
