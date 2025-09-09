package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _33135 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int n = S.length();

        for (int k = 1; k < n; k++) {
            String t = S.substring(0, k);
            String u = S.substring(k);

            // u가 정렬되어 있고 distinct해야 함
            if (!isSortedDistinct(u)) continue;

            Set<Character> setT = new HashSet<>();
            for (char c : t.toCharArray()) setT.add(c);

            Set<Character> setU = new HashSet<>();
            for (char c : u.toCharArray()) setU.add(c);

            if (setT.equals(setU)) {
                System.out.println(k);
                return;
            }
        }
    }

    static boolean isSortedDistinct(String u) {
        for (int i = 1; i < u.length(); i++) {
            if (u.charAt(i - 1) >= u.charAt(i)) return false;
        }
        return true;
    }
}
