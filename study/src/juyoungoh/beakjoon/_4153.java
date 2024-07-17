package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _4153 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals("0 0 0")) {
                break;
            } else {
                String arr[] = str.split(" ");
                int number[] = new int[3];

                for (int i = 0; i < arr.length; i++) {
                    number[i] = Integer.parseInt(arr[i]);
                }
                Arrays.sort(number);

                int a = number[0];
                int b = number[1];
                int c = number[2];

                double a2 = Math.pow(a, 2);
                double b2 = Math.pow(b, 2);
                double c2 = Math.pow(c, 2);

                if (a2 + b2 == c2) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        }
    }
}
