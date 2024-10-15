package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _10431 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String arr[] = br.readLine().split(" ");

            List<Integer> list = new ArrayList<>();

            for (int j = 1; j < arr.length; j++) {
                list.add(Integer.parseInt(arr[j]));
            }

            int count = 0;
            Collections.sort(list, (o1, o2) -> {
                int compare = Integer.compare(o1, o2);
                if (compare != 0) {
                    // count++;
                }
                return compare;
            });

            sb.append(i).append(" ").append(count).append("\n");
            count = 0;
        }
        System.out.print(sb);
    }
}
