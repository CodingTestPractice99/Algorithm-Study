package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _2776 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Set<Integer> set = new HashSet<>();

            int n = Integer.parseInt(br.readLine());
            String str1 = br.readLine();
            String arr1[] = str1.split(" ");

            int m = Integer.parseInt(br.readLine());
            String str2 = br.readLine();
            String arr2[] = str2.split(" ");

            for (int j = 0; j < arr1.length; j++) {
                set.add(Integer.parseInt(arr1[j]));
            }

            for (int j = 0; j < arr2.length; j++) {
                if (set.contains(Integer.parseInt(arr2[j]))) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}
