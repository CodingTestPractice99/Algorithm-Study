package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class _26265 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);

        Collections.sort(list, (o1, o2) -> {
            String s1[] = o1.split(" ");
            String s2[] = o2.split(" ");

            int compare = s1[0].compareTo(s2[0]);

            if (compare == 0) {
                return s2[1].compareTo(s1[1]);
            }
            return compare;
        });

        for (String s : list) {
            System.out.println(s);
        }
    }
}
