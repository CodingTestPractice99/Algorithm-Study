package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _10815 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        Set<String> set = new HashSet<>();
        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int m = Integer.parseInt(br.readLine());
        String str2 = br.readLine();
        String arr2[] = str2.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        System.out.print(sb);
    }
}
