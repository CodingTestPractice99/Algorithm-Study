package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _20976 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(s[0]));
        list.add(Integer.parseInt(s[1]));
        list.add(Integer.parseInt(s[2]));

        Collections.sort(list);

        System.out.println(list.get(1));
    }
}
