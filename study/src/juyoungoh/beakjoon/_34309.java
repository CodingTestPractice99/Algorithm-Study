package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _34309 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        String prev = br.readLine().trim();
        int total = 0;
        int prevR = prev.charAt(0) - 'A';
        int prevC = prev.charAt(1) - 'A';
        for (int i = 1; i < N; i++) {
            String cur = br.readLine().trim();
            int r = cur.charAt(0) - 'A';
            int c = cur.charAt(1) - 'A';
            total += Math.abs(prevR - r) + Math.abs(prevC - c);
            prevR = r;
            prevC = c;
        }
        System.out.println(total);
    }
}
