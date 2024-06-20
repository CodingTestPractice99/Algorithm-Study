package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class _31994 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = new String[7];

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();

        int max = 0;
        int index = 0;

        for (int i = 0; i < 7; i++) {
            str[i] = br.readLine();
        }

        String one[] = str[0].split(" ");
        String two[] = str[1].split(" ");
        String three[] = str[2].split(" ");
        String four[] = str[3].split(" ");
        String five[] = str[4].split(" ");
        String six[] = str[5].split(" ");
        String seven[] = str[6].split(" ");

        arrayList.add(Integer.parseInt(one[1]));
        arrayList.add(Integer.parseInt(two[1]));
        arrayList.add(Integer.parseInt(three[1]));
        arrayList.add(Integer.parseInt(four[1]));
        arrayList.add(Integer.parseInt(five[1]));
        arrayList.add(Integer.parseInt(six[1]));
        arrayList.add(Integer.parseInt(seven[1]));

        arrayList2.add(one[0]);
        arrayList2.add(two[0]);
        arrayList2.add(three[0]);
        arrayList2.add(four[0]);
        arrayList2.add(five[0]);
        arrayList2.add(six[0]);
        arrayList2.add(seven[0]);

        for (int i = 0; i < arrayList.size(); i++) {
            if (max < arrayList.get(i)) {
                max = arrayList.get(i);
                index = i;
            }
        }
        System.out.println(arrayList2.get(index));
    }
}
