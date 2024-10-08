package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class _8979 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input[] = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            list.add(str);
        }

        Collections.sort(list, (o1, o2) -> {
            String s1[] = o1.split(" ");
            String s2[] = o2.split(" ");

            int compareGold = Integer.compare(Integer.parseInt(s2[1]), Integer.parseInt(s1[1]));
            int compareSilver = Integer.compare(Integer.parseInt(s2[2]), Integer.parseInt(s1[2]));
            int compareBronze = Integer.compare(Integer.parseInt(s2[3]), Integer.parseInt(s1[3]));

            if (compareGold != 0) {
                return compareGold;
            }
            if (compareSilver != 0) {
                return compareSilver;
            }
            if (compareBronze != 0) {
                return compareBronze;
            }
            return compareGold;
        });

        Set<String> set = new LinkedHashSet<>();

        for (int i = 0; i < list.size(); i++) {
            String[] s = list.get(i).split(" ");
            String s1 = s[1] + s[2] + s[3];
            set.add(s1);
        }

        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            String[] s = list.get(i).split(" ");
            String s1 = s[1] + s[2] + s[3];
            for (String s2 : set) {
                count++;
                if (Integer.parseInt(s[0]) == k) {
                    System.out.println(count);
                    return;
                }
            }
        }
    }
}
