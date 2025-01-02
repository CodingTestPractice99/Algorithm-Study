package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _25773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = br.readLine().split("");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            list.add(Integer.parseInt(str[i]));
        }

        Collections.sort(list, (o1, o2) -> {
            int compare = Integer.compare(o2, o1);
            return compare;
        });

        String answer = "";
        for (Integer i : list) {
            answer += i;
        }
        System.out.println(answer);
    }
}
