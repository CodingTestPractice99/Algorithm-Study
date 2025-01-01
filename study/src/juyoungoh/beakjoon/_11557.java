package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _11557 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int n2 = Integer.parseInt(br.readLine());
            List<String> list = new ArrayList<>();

            for (int j = 0; j < n2; j++) {
                list.add(br.readLine());
            }

            Collections.sort(list, (o1, o2) ->  {
                String[] s1 = o1.split(" ");
                String[] s2 = o2.split(" ");

                int compare = Integer.compare(Integer.parseInt(s2[1]), Integer.parseInt(s1[1]));

                return compare;
            });

            String s = list.get(0);
            String[] s1 = s.split(" ");
            System.out.println(s1[0]);
        }
    }
}
