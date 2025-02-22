package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _8633 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        Collections.sort(list, (o1, o2) -> {
            int compare = Integer.compare(o1.length(), o2.length());

            if (compare == 0) {
                return o1.compareTo(o2);
            } else {
                return compare;
            }
        });

        for (String s : list) {
            System.out.println(s);
        }
    }
}
