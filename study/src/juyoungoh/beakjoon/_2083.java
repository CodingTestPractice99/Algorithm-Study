package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2083 {

    // 나이가 17세보다 많거나, 몸무게가 80kg 이상이면 성인부이다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals("# 0 0")) {
                break;
            } else {
                String arr2[] = str.split(" ");
                int age = Integer.parseInt(arr2[1]);
                int weight = Integer.parseInt(arr2[2]);

                if (age > 17 || weight >= 80) {
                    System.out.println(arr2[0] + " Senior");
                } else {
                    System.out.println(arr2[0] + " Junior");
                }
            }
        }
    }
}
