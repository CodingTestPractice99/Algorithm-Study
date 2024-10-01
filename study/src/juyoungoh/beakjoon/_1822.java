package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class _1822 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String a[] = br.readLine().split(" ");
        String b[] = br.readLine().split(" ");

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            setA.add(Integer.parseInt(a[i]));
        }

        Set<Integer> answer = new TreeSet<>(setA);

        for (int i = 0; i < b.length; i++) {
            setB.add(Integer.parseInt(b[i]));
        }

        answer.removeAll(setB);

        StringBuilder sb = new StringBuilder();

        if (answer.size() == 0) {
            System.out.println(0);
        } else {
            System.out.println(answer.size());
            for (Integer i : answer) {
                sb.append(i).append(" ");
            }
            System.out.print(sb);
        }
    }
}
