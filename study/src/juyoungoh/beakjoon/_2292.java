package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _2292 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        int num = 1;
        int count = 1;

        while (true) {
            if (num >= 1100000000) {
                break;
            }
            list.add(num);
            num += count * 6;
            count++;
        }


        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                if (number <= list.get(i) && number > list.get(i - 1)) {
                    System.out.println(i + 1);
                }
            } else if (i == 0 && number == 1) {
                System.out.println(1);
            }
        }
    }
}
