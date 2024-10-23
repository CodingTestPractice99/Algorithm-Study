package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class _28445 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String dad[] = br.readLine().split(" ");
        String mom[] = br.readLine().split(" ");

        Set<String> set = new TreeSet<>();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                set.add(dad[i] + " " + dad[i]);
                set.add(dad[i] + " " + dad[j]);
                set.add(mom[i] + " " + mom[i]);
                set.add(mom[i] + " " + mom[j]);
                set.add(dad[i] + " " + mom[j]);
                set.add(mom[i] + " " + dad[j]);
            }
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}
