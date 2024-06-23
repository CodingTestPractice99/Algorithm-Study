package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class _3052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(br.readLine());
            int number2 = number % 42;
            num.add(number2);
        }

        Set<Integer> setNum = new HashSet<>(num);
        System.out.println(setNum.size());
    }
}
