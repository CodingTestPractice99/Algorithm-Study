package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _10811 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        int basketNum = Integer.parseInt(input[0]);
        int count = Integer.parseInt(input[1]);
        int temp = 0;

        int basket[] = new int[basketNum];
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < count; i++) {
            String basketCount[] = br.readLine().split(" ");
            int index1 = Integer.parseInt(basketCount[0]);
            int index2 = Integer.parseInt(basketCount[1]);

            for (int j = index1 - 1; j < index2; j++) {
                arrayList.add(basket[j]);
            }
            Collections.reverse(arrayList);

            for (int j = index1 - 1; j < index2; j++) {
                basket[j] = arrayList.get(temp);
                temp++;
            }
            temp = 0;
            arrayList.clear();
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < basket.length; i++) {
            sb.append(basket[i]).append(" ");
        }
        System.out.println(sb);
    }
}
