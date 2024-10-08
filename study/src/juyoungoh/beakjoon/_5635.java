package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _5635 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            list.add(str);
        }

        Collections.sort(list, (o1, o2) -> {
            String str1[] = o1.split(" ");
            String str2[] = o2.split(" ");

            int compareYear = Integer.compare(Integer.parseInt(str1[3]), Integer.parseInt(str2[3]));
            int compareMonth = Integer.compare(Integer.parseInt(str1[2]), Integer.parseInt(str2[2]));
            int compareDay = Integer.compare(Integer.parseInt(str1[1]), Integer.parseInt(str2[1]));

            if (compareYear != 0) {
                return compareYear;
            }
            if (compareMonth != 0) {
                return compareMonth;
            }
            if (compareDay != 0) {
                return compareDay;
            }
            return compareYear;
        });

        String[] s2 = list.get(list.size() - 1).split(" ");
        System.out.println(s2[0]);

        String[] s1 = list.get(0).split(" ");
        System.out.println(s1[0]);
    }
}
