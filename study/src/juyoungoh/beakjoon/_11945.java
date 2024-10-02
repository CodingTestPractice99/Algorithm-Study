package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _11945 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String strArr[] = str.split(" ");

        int n = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);


        for (int i = 0; i < n; i++) {
            List<String> list = new ArrayList<>();
            String a = br.readLine();
            String s[] = a.split("");
            for (int j = s.length - 1; j >= 0; j--) {
                list.add(s[j]);
            }
            String s1 = "";
            for (int j = 0; j < list.size(); j++) {
                s1 += list.get(j);
            }
            System.out.println(s1);
        }
    }
}
