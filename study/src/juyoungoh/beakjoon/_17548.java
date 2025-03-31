package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17548 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split("");
        int sLength = s.length - 2;

        String answer = "h";
        for (int i = 0; i < sLength * 2; i++) {
            answer += "e";
        }
        System.out.println(answer + "y");
    }
}
