package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _34071 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int min = list.get(0);
        int max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }

        if (min == list.get(0)) {
            System.out.println("ez");
        } else if (max == list.get(0)) {
            System.out.println("hard");
        } else {
            System.out.println("?");
        }
    }
}
