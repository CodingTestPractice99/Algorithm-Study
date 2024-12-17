package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _29934 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        int n2 = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < n2; i++) {
            String str = br.readLine();
            if (set.contains(str)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
