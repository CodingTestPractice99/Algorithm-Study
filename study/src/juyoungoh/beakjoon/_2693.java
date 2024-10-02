package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2693 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String strArr[] = str.split(" ");
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < strArr.length; j++) {
                 list.add(Integer.parseInt(strArr[j]));
            }
            Collections.sort(list);
            Collections.reverse(list);
            System.out.println(list.get(2));
        }
    }
}

