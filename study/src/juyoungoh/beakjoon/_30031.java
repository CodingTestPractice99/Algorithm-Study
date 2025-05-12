package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _30031 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int num = Integer.parseInt(s[0]);

            if (num == 136) {
                answer += 1000;
            } else if (num == 148) {
                answer += 10000;
            } else if (num == 154) {
                answer += 50000;
            } else if (num == 142) {
                answer += 5000;
            }
        }
        System.out.println(answer);
    }
}
