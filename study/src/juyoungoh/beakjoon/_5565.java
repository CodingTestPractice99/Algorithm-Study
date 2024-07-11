package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5565 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());

        int price[] = new int[9];
        int priceSum = 0;

        for (int i = 0; i < 9; i++) {
            price[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < price.length; i++) {
            priceSum += price[i];
        }

        System.out.println(sum - priceSum);
    }
}
