package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1316_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (extracted(br)) {
                sum += 1;
            } else {
                sum += 0;
            }
        }
        System.out.println(sum);
    }

    private static boolean extracted(BufferedReader br) throws IOException {
        boolean check[] = new boolean[26];

        int prev = 0;
        String str = br.readLine();
        for (int j = 0; j < str.length(); j++) {
            int num = str.charAt(j);
            if (prev != num) {
                if (!check[num - 'a']) {
                    check[num - 'a'] = true;
                    prev = num;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
