package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _11536 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<String> strName = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            strName.add(br.readLine());
        }

        ArrayList<String> strNameDecreasing = new ArrayList<>(strName);
        Collections.sort(strNameDecreasing);
        Collections.reverse(strNameDecreasing);

        ArrayList<String> strNameIncreasing = new ArrayList<>(strName);
        Collections.sort(strNameIncreasing);

        if (strName.equals(strNameIncreasing)) {
            System.out.println("INCREASING");
        } else if (strName.equals(strNameDecreasing)) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }
    }
}
