package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15096 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");

        int sum = 0;
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            int num = Integer.parseInt(s[i]);
            if (!(num == -1)) {
                sum += num;
                count++;
            }
        }
        double answer = (double) sum / count;
        System.out.println(answer);
    }
}
