package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _2609 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int a2 = 0;
        int b2 = 0;

        List<Integer> integerList1 = new ArrayList<>();
        List<Integer> integerList2 = new ArrayList<>();

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                integerList1.add(i);
            }
        }

        for (int i = 1; i < b; i++) {
            if (b % i == 0) {
                integerList2.add(i);
            }
        }

        for (int i = 0; i < integerList1.size(); i++) {
            for (int j = 0; j < integerList2.size(); j++) {
                if (integerList1.get(i) == integerList2.get(j)) {
                    a2 = integerList1.get(i);
                }
            }
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        int index = 2;
        while (b2 == 0) {
            list1.add(a * index);
            list2.add(b * index);
            index++;

            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    if (list1.get(i) == list2.get(j)) {
                        b2 = list1.get(i);
                        break;
                    }
                }
            }
        }
        System.out.println(a2);
        System.out.println(b2);
    }
}
