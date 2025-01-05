package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _27386 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1[] = br.readLine().split("");
        String s2[] = br.readLine().split("");

        List<String> list = new ArrayList<>();
        for (int i = 0; i < s1.length; i++) {
            list.add(s1[i]);
        }

        for (int i = 0; i < s2.length; i++) {
            list.add(s2[i]);
        }

        Collections.sort(list);
        String answer = "";
        for (String s : list) {
            answer += s;
        }
        System.out.println(answer);
    }
}
