package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class _2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] input = str.split(" ");
        int N = Integer.parseInt(input[0]);
        int number = Integer.parseInt(input[1]);

        String num = br.readLine();
        String[] numCount = num.split(" ");
        int[] numArray = new int[numCount.length];

        for (int i = 0; i < N; i++) {
            numArray[i] = Integer.parseInt(numCount[i]);
        }

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < numArray.length; i++) {
            integerList.add(numArray[i]);
        }

        Set<Integer> integerSet = new TreeSet<>();

        for (int i = 0; i < integerList.size(); i++) {
            for (int j = 0; j < integerList.size(); j++) {
                for (int k = 0; k < integerList.size(); k++) {
                    if (i != j &&
                        i != k &&
                        j != k) {
                        integerSet.add(integerList.get(i) + integerList.get(j) + integerList.get(k));
                    }
                }
            }
        }

        List<Integer> integers = new ArrayList<>(integerSet);
        integers.add(number);

        Collections.sort(integers);

        int index = 0;

        for (int i = 0; i < integers.size(); i++) {
            if (number == integers.get(i) && i == 0) {
                System.out.println(integers.get(1));
                return;
            } else if (number == integers.get(i) && i == integers.size() - 1) {
                System.out.println(integers.get(integers.size() - 2));
                return;
            }
            if (number == integers.get(i)) {
                index = i;
            }
        }

        int index1 = integers.get(index - 1);
        int index2 = integers.get(index + 1);

        if (index1 == number) {
            System.out.println(index1);
        } else if (index2 == number) {
            System.out.println(index2);
        } else {
            System.out.println(index1);
        }
    }
}

