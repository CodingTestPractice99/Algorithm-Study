package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        String str[] = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(str[i]));
        }

        list.sort(null);
    }
}
