package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class _10867 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Set<Integer> num = new HashSet<>();

        String numberStr[] = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            num.add(Integer.parseInt(numberStr[i]));
        }

        ArrayList<Integer> arrayList = new ArrayList<>(num);
        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i) + " ");
        }
        System.out.print(sb);
    }
}
