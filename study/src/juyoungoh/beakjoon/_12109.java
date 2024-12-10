package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _12109 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(arr[i]));
        }

        Collections.sort(list);
        Collections.reverse(list);

        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            if ((i + 1) <= list.get(i)) {
                answer = i + 1;
            } else {
                break;
            }
        }

        System.out.println(answer);
    }
}
