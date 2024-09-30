package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _1269 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        String str = br.readLine();
        String strA = br.readLine();
        String strB = br.readLine();

        String arrA[] = strA.split(" ");
        String arrB[] = strB.split(" ");

        for (int i = 0; i < arrA.length; i++) {
            setA.add(Integer.parseInt(arrA[i]));
        }

        for (int i = 0; i < arrB.length; i++) {
            setB.add(Integer.parseInt(arrB[i]));
        }

        Set<Integer> a = new HashSet<>(setA);
        Set<Integer> b = new HashSet<>(setB);

        a.removeAll(b);

        Set<Integer> a2 = new HashSet<>(setA);
        Set<Integer> b2 = new HashSet<>(setB);
        b2.removeAll(a2);

        System.out.println(a.size() + b2.size());
    }
}
