package juyoungoh.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 1. 로그의 가장 앞부분은 식별자로서, 순서에 영향을 끼치지 않는다.
 2. 문자로 구성된 로그가 숫자 로그보다 앞에 오며, 문자 로그는 사전순으로 한다.
 3. 문자가 동일할 경우에는 식별자순으로 한다.
 4. 숫자 로그는 입력 순서대로 한다.
 */

public class _937_ReorderDataInLogFiles_1 {

    public static String[] reorderLogFiles(String[] logs) {
        List<String> digitList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        for (String s : logs) {
            String arr[] = s.split(" ");
            if (Character.isDigit(arr[1].charAt(0))) {
                digitList.add(s);
            } else {
                stringList.add(s);
            }
        }

        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1[] = o1.split(" ", 2);
                String s2[] = o2.split(" ", 2);

                // 로그 본문을 비교
                int compared = s1[1].compareTo(s2[1]);

                // 로그 본문이 동일하면 식별자 비교
                if (compared == 0) {
                    return s1[0].compareTo(s2[0]);
                } else {
                    return compared;
                }
            }
        });

        stringList.addAll(digitList);
        return stringList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reorderLogFiles(
            new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"})));
    }
}
