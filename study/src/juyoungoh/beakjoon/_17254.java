package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _17254 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(br.readLine());
        }

        Collections.sort(list, (o1, o2) -> {
            String[] s1 = o1.split(" ");
            String[] s2 = o2.split(" ");

            int compare = Integer.compare(Integer.parseInt(s1[1]), Integer.parseInt(s2[1]));

            if (compare == 0) {
                return Integer.compare(Integer.parseInt(s1[0]), Integer.parseInt(s2[0]));
            }
            return compare;
        });

        String answer = "";
        for (int i = 0; i < list.size(); i++) {
            String[] s = list.get(i).split(" ");
            answer += s[2];
        }
        System.out.println(answer);
    }
}
