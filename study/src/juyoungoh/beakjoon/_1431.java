package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1431 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        Collections.sort(list, (o1, o2) -> {
            int compareLength = Integer.compare(o1.length(), o2.length());

            char s1[] = o1.toCharArray();
            char s2[] = o2.toCharArray();

            int s1Sum = 0;
            int s2Sum = 0;
            for (int i = 0; i < s1.length; i++) {
                if (Character.isDigit(s1[i])) {
                    s1Sum += Integer.parseInt(String.valueOf(s1[i]));
                }
            }

            for (int i = 0; i < s2.length; i++) {
                if (Character.isDigit(s2[i])) {
                    s2Sum += Integer.parseInt(String.valueOf(s2[i]));
                }
            }

            int compareSum = Integer.compare(s1Sum, s2Sum);
            int compare = o1.compareTo(o2);

            if (compareLength != 0) {
                return compareLength;
            }
            if (compareSum != 0) {
                return compareSum;
            }
            if (compare != 0) {
                return compare;
            }
            return compareLength;
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.print(sb);
    }
}
