package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _18411 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            list.add(Integer.parseInt(s[i]));
        }

        list.sort(null);

        System.out.println(list.get(1) + list.get(2));
    }
}
