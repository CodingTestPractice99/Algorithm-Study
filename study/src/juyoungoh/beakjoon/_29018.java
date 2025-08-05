package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _29018 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if (s.equals("#")) {
                break;
            }
            List<Character> upperList = new ArrayList<>();
            List<Character> lowerList = new ArrayList<>();
            List<Integer> digitList = new ArrayList<>();
            char[] charArray = s.toCharArray();
            for (char c : charArray) {
                if (Character.isLowerCase(c)) {
                    lowerList.add(c);
                } else if (Character.isUpperCase(c)) {
                    upperList.add(c);
                } else {
                    digitList.add(Integer.parseInt(String.valueOf(c)));
                }
            }
            StringBuilder sb = new StringBuilder();

            Collections.sort(upperList);
            Collections.sort(lowerList);
            Collections.sort(digitList);

            for (Character c : lowerList) {
                sb.append(c);
            }

            for (Character c : upperList) {
                sb.append(c);
            }
            for (Integer i : digitList) {
                sb.append(i);
            }
            System.out.println(sb.toString());
        }
    }
}
