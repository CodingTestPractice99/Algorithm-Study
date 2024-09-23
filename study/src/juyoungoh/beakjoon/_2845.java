package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s[] = str.split(" ");
        int L = Integer.parseInt(s[0]);
        int P = Integer.parseInt(s[1]);
        int sum = L * P;
        String num = br.readLine();
        String numArr[] = num.split(" ");

        int answer[] = new int[5];
        for (int i = 0; i < numArr.length; i++) {
            answer[i] = Integer.parseInt(numArr[i]) - sum;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.length; i++) {
            sb.append(answer[i]).append(" ");
        }
        System.out.print(sb);
    }
}
