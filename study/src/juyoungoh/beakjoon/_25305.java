package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _25305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String arr[] = str.split(" ");

        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        List<Integer> list = new ArrayList<>();
        String str2 = br.readLine();
        String arr2[] = str2.split(" ");
        for (int i = 0; i < arr2.length; i++) {
            list.add(Integer.parseInt(arr2[i]));
        }
        Collections.sort(list);
        Collections.reverse(list);
        int answer = 0;
        for (int i = 0; i < m; i++) {
            answer = list.get(i);
        }
        System.out.println(answer);
    }
}
