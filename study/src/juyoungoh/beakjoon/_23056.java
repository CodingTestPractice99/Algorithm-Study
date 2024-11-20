package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _23056 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arr[] = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        while (true) {
            String str = br.readLine();
            if (str.equals("0 0")) {
                break;
            } else {
                String[] s = str.split(" ");
                int num = Integer.parseInt(s[0]);
                if (num % 2 == 0) {
                    int count = 0;
                    for (int i = 0; i < list2.size(); i++) {
                        String[] s2 = list2.get(i).split(" ");
                        if (s2[0].equals(s[0])) {
                            count++;
                        }
                    }
                    if (count >= m) {
                        count = 0;
                    } else {
                        count = 0;
                        list2.add(str);
                    }
                } else {
                    int count = 0;
                    for (int i = 0; i < list1.size(); i++) {
                        String[] s1 = list1.get(i).split(" ");
                        if (s1[0].equals(s[0])) {
                            count++;
                        }
                    }
                    if (count >= m) {
                        count = 0;
                    } else {
                        count = 0;
                        list1.add(str);
                    }
                }
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);

        Collections.sort(list1, (o1, o2) -> {
            String s1[] = o1.split(" ");
            String s2[] = o2.split(" ");
            int compare = Integer.compare(Integer.parseInt(s1[0]), Integer.parseInt(s2[0]));

            if (compare == 0) {
                return Integer.compare(s1[1].length(), s2[1].length());
            }

            return compare;
        });

        Collections.sort(list2, (o1, o2) -> {
            String s1[] = o1.split(" ");
            String s2[] = o2.split(" ");
            int compare = Integer.compare(Integer.parseInt(s1[0]), Integer.parseInt(s2[0]));

            if (compare == 0) {
                return Integer.compare(s1[1].length(), s2[1].length());
            }
            return compare;
        });

        StringBuilder sb = new StringBuilder();
        for (String s : list1) {
            sb.append(s).append("\n");
        }
        for (String s : list2) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}
