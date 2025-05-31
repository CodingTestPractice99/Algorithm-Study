package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _31821 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int p = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int i = 0; i < p; i++) {
            answer += list.get(Integer.parseInt(br.readLine()) - 1);
        }
        System.out.println(answer);
    }
}
