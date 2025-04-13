package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27222 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");

        int answer = 0;
        for (int i = 0; i < n; i++) {
            String str[] = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);

            if (s[i].equals("1") && y - x > 0) {
                answer += (y - x);
            }
        }
        System.out.println(answer);
    }
}
