package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            num.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
        Collections.sort(num);
        Collections.reverse(num);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.size(); i++) {
            sb.append(num.get(i));
        }
        System.out.print(sb);
    }
}
