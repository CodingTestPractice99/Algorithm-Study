package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _11651 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }
        Collections.sort(list, (o1, o2) -> {
            String s1[] = o1.split(" ");
            String s2[] = o2.split(" ");

            int s1x = Integer.parseInt(s1[1]);
            int s2x = Integer.parseInt(s2[1]);

            int compare = Integer.compare(s1x, s2x);

            if (compare == 0) {
                return Integer.compare(Integer.parseInt(s1[0]), Integer.parseInt(s2[0]));
            } else {
                return compare;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}
