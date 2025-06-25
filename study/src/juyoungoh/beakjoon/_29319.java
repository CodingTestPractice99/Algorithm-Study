package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _29319 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split(" ");
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length; i++) {
            sum += Integer.parseInt(s[i]);
            list.add(Integer.parseInt(s[i]));
        }

        Collections.sort(list);

        System.out.println(sum - list.get(list.size() - 1));
    }
}
