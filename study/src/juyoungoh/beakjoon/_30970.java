package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _30970 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i));
        }

        Collections.sort(list, (o1, o2) -> {
            String[] s1 = o1.split(" ");
            String[] s2 = o2.split(" ");

            int compare = Integer.compare(Integer.parseInt(s2[0]), Integer.parseInt(s1[0]));

            if (compare == 0) {
                return Integer.compare(Integer.parseInt(s1[1]), Integer.parseInt(s2[1]));
            }

            return compare;
        });

        Collections.sort(list2, ((o1, o2) -> {
            String[] s1 = o1.split(" ");
            String[] s2 = o2.split(" ");

            int compare = Integer.compare(Integer.parseInt(s1[1]), Integer.parseInt(s2[1]));

            if (compare == 0) {
                return Integer.compare(Integer.parseInt(s2[0]), Integer.parseInt(s1[0]));
            }

            return compare;
        }));

        for (int i = 0; i < 2; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.print(list2.get(i) + " ");
        }
    }
}
