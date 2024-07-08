package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class _1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String strUpper = str.toUpperCase();

        char charStr[] = strUpper.toCharArray();
        Arrays.sort(charStr);

        List<String> list = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();

        for (int i = 0; i < charStr.length; i++) {
            list.add(String.valueOf(charStr[i]));
        }

        for (int i = 0; i < list.size(); i++) {
            stringSet.add(list.get(i));
        }

        List<String> setList = new ArrayList<>(stringSet);
        setList.sort(null);
        List<Integer> listNum = new ArrayList<>();

        int index = 0;
        int listIndex = 0;
        for (int i = 0; i < setList.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (setList.get(i).equals(list.get(j))) {
                    listIndex = i;
                    index++;
                }
            }
            listNum.add(listIndex, index);
            index = 0;
        }
        int max = 0;
        String str2 = "";

        for (int i = 0; i < listNum.size(); i++) {
            if (max < listNum.get(i)) {
                max = listNum.get(i);
                index = i;
            }
        }

        for (int i = 0; i < listNum.size(); i++) {
            if (index != i && max == listNum.get(i)) {
                str2 = "?";
            }
        }

        if (setList.size() == 1) {
            System.out.println(setList.get(index));
        } else if (str2.equals("?")) {
            System.out.println(str2);
        } else {
            System.out.println(setList.get(index));
        }
    }
}
