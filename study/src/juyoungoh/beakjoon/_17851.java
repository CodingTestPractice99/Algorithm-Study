package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _17851 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = br.readLine().split(" ");
        String str2[] = br.readLine().split(" ");

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            list1.add(Integer.parseInt(str[i]));
        }

        for (int i = 0; i < str2.length; i++) {
            list2.add(Integer.parseInt(str2[i]));
        }

        Collections.sort(list1);
        Collections.sort(list2);

        int answer = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) > list2.get(i)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
