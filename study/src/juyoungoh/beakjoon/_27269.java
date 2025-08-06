package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _27269 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> manList = new ArrayList<>();
        List<Integer> womenList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int num = Integer.parseInt(s[0]);

            if (num == 0) {
                manList.add(Integer.parseInt(s[1]));
            } else {
                womenList.add(Integer.parseInt(s[1]));
            }
        }

        Collections.sort(manList, Collections.reverseOrder());
        Collections.sort(womenList, Collections.reverseOrder());

        List<Integer> totalList = new ArrayList<>();
        totalList.addAll(manList);
        totalList.addAll(womenList);

        int maxDiff = 0;
        for (int i = 1; i < totalList.size(); i++) {
            int diff = Math.abs(totalList.get(i) - totalList.get(i - 1));
            maxDiff = Math.max(maxDiff, diff);
        }

        System.out.println(maxDiff);
    }
}
