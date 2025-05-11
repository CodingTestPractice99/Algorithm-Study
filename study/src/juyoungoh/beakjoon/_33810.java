package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _33810 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split("");
        String answer[] = "SciComLove".split("");

        int count = 0;

        for (int i = 0; i < s.length; i++) {
            if (!(s[i].equals(answer[i]))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
