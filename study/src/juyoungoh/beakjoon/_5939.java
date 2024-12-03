package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _5939 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        Collections.sort(list, (o1, o2) -> {
            String[] s1 = o1.split(" ");
            String[] s2 = o2.split(" ");

            int compare = Integer.compare(Integer.parseInt(s1[0]), Integer.parseInt(s2[0]));
            int compare2 = Integer.compare(Integer.parseInt(s1[1]), Integer.parseInt(s2[1]));
            int compare3 = Integer.compare(Integer.parseInt(s1[2]), Integer.parseInt(s2[2]));

            if (compare == 0 && compare2 == 0) {
                return compare3;
            } else if (compare == 0) {
                return compare2;
            } else {
                return compare;
            }
        });

        for (String s : list) {
            System.out.println(s);
        }
    }

}
