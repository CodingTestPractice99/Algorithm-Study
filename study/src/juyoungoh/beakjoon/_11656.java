package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _11656 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        ArrayList<String> strArr = new ArrayList<>();

        strArr.add(str);

        for (int i = 1; i < str.length(); i++) {
             strArr.add(str.substring(i, str.length()));
        }

        Collections.sort(strArr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.size(); i++) {
            sb.append(strArr.get(i)).append("\n");
        }
        System.out.print(sb);
    }
}
