package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _7946 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            int n2 = Integer.parseInt(s[1]);
            List<Integer> list = new ArrayList<>();
            String s2[] = br.readLine().split(" ");

            for (int j = 0; j < s2.length; j++) {
                list.add(Integer.parseInt(s2[j]));
            }

            Collections.sort(list);

            System.out.println(list.get(n2 - 1));
        }
    }
}
