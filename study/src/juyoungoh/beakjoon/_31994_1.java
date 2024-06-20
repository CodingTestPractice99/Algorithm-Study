package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _31994_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            String[] input = br.readLine().split(" ");
            names.add(input[0]);
            scores.add(Integer.parseInt(input[1]));
        }

        int maxIndex = findMaxIndex(scores);
        System.out.println(names.get(maxIndex));
    }

    private static int findMaxIndex(ArrayList<Integer> list) {
        int max = list.get(0);
        int index = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                index = i;
            }
        }
        return index;
    }
}
