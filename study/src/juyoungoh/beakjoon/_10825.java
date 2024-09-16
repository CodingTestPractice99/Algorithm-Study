package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1. 국어 점수가 감소하는 순서로
 * 2. 국어 점수가 같으면 영어 점수가 증가하는 순서로
 * 3. 국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
 * 4. 모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 (단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)
 */
public class _10825 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        Collections.sort(list, (o1, o2) -> {
            String s1[] = o1.split(" ");
            String s2[] = o2.split(" ");

            int compare = Integer.compare(Integer.parseInt(s2[1]), Integer.parseInt(s1[1]));
            int compare2 = Integer.compare(Integer.parseInt(s1[2]), Integer.parseInt(s2[2]));
            int compare3 = Integer.compare(Integer.parseInt(s2[3]), Integer.parseInt(s1[3]));
            int compare4 = s1[0].compareTo(s2[0]);

            if (compare != 0) {
                return compare;
            }
            if (compare2 != 0) {
                return compare2;
            }
            if (compare3 != 0) {
                return compare3;
            }
            if (compare4 != 0) {
                return compare4;
            }
            return compare;
        });

        for (int i = 0; i < list.size(); i++) {
            String str[] = list.get(i).split(" ");
            System.out.println(str[0]);
        }
    }
}
