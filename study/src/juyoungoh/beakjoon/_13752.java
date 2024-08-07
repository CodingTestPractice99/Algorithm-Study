package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _13752 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int number[] = new int[num];

        for (int i = 0; i < num; i++) {
            number[i] = Integer.parseInt(br.readLine());
        }

        String str = "=";

        for (int i = 0; i < number.length; i++) {
            int num2 = number[i];
            for (int j = 0; j < num2; j++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
