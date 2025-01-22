package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _9946 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        while (true) {
            String s = br.readLine();
            String s2 = br.readLine();

            if (s.equals("END") && s2.equals("END")) {
                break;
            } else {
                List<String> list = new ArrayList<>();
                List<String> list2 = new ArrayList<>();

                String[] split = s.split("");
                String[] split2 = s2.split("");

                for (int i = 0; i < split.length; i++) {
                    list.add(split[i]);
                }

                for (int i = 0; i < split2.length; i++) {
                    list2.add(split2[i]);
                }
                Collections.sort(list);
                Collections.sort(list2);

                String answer1 = "";
                String answer2 = "";

                for (int i = 0; i < list.size(); i++) {
                    answer1 += list.get(i);
                }
                for (int i = 0; i < list2.size(); i++) {
                    answer2 += list2.get(i);
                }
                count++;

                if (answer1.equals(answer2)) {
                    System.out.println("Case " + count + ": same");
                } else {
                    System.out.println("Case " + count + ": different");
                }
            }
        }
    }
}
