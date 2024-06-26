package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _11931 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());
        ArrayList<Integer> number = new ArrayList<>();

        for (int i = 0; i < inputCount; i++) {
            number.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(number);
        Collections.reverse(number);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.size(); i++) {
            sb.append(number.get(i)).append("\n");
        }
        System.out.print(sb);
    }
}
