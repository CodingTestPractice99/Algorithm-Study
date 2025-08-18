package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _28812 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str[] = br.readLine().split(" ");
            int sum = 0;
            for (int j = 0; j < str.length - 1; j++) {
                sum += Integer.parseInt(str[j]);
            }
            sum += (Integer.parseInt(str[str.length - 1])) * m;
            answerList.add(sum);
            sum = 0;
        }
        Collections.sort(answerList);
        System.out.println(answerList.get(0));
    }
}
