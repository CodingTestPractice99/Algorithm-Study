package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _11004 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int index = Integer.parseInt(str[1]);

        String arr[] = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }

        Collections.sort(list);

        System.out.println(list.get(index - 1));
    }
}
