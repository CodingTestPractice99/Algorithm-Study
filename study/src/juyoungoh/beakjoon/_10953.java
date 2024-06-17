package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10953 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String a[] = br.readLine().split(",");
            sb.append(Integer.parseInt(a[0]) + Integer.parseInt(a[1]) + "\n");
        }
        System.out.println(sb);
    }
}
