package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15964 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String strArr[] = str.split(" ");
        long A = Long.parseLong(strArr[0]);
        long B = Long.parseLong(strArr[1]);

        long answer = (A+B) * (A-B);
        System.out.println(answer);
    }
}
