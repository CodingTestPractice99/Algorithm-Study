package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _7587 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while (!(s = br.readLine()).equals("0")) {
            int n = Integer.parseInt(s);
            Map<String, List<String>> map = new HashMap<>();
            List<String> words = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String str = br.readLine();
                words.add(str);
                char[] charArray = str.toCharArray();
                Arrays.sort(charArray);
                String sorted = new String(charArray);

                map.putIfAbsent(sorted, new ArrayList<>());
                map.get(sorted).add(str);
            }

            int max = 0;
            String answer = "";
            for (String word : words) {
                char[] charArray = word.toCharArray();
                Arrays.sort(charArray);
                String sorted = new String(charArray);

                int size = map.get(sorted).size();
                if (size > max) {
                    max = size;
                    answer = word;
                }
            }
            System.out.println(answer + " " + (max - 1));
        }
    }
}