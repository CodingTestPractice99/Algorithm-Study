package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _9076 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            String str[] = br.readLine().split(" ");
            for (int j = 0; j < str.length; j++) {
                list.add(Integer.parseInt(str[j]));
            }
            Collections.sort(list);
            int min = list.get(1);
            int middle = list.get(2);
            int max = list.get(3);

            if (max - min >= 4) {
                System.out.println("KIN");
            } else {
                System.out.println(min + middle + max);
            }
        }
    }
}
