package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _6177 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        double average = (double) sum / n;

        double answer2 = 0;
        if (n % 2 != 0) {
            answer2 = list.get(n / 2);
        } else {
            int sum2 = 0;
            sum2 += list.get(n / 2);
            sum2 += list.get((n / 2) - 1);
            answer2 = (double) sum2 / 2;
        }
        System.out.printf("%.6f\n", average);
        System.out.printf("%.6f\n", answer2);
    }
}
