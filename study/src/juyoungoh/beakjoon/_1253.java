package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _1253 {

    // 어떤 수가 다른 수 두 개의 합으로 나타낼 수 있다

    /**
     * 5 -1 0 1 2 3
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String arr[] = br.readLine().split(" ");
        int num[] = new int[arr.length];
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
            set.add(Integer.parseInt(arr[i]));
        }
        Arrays.sort(num);

        int index = n - 1;
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {
                if (set.contains(num[i] + num[j]) && i != j && i != index && j != index && index >= 0) {
                    set.remove(num[i] + num[j]);
                }
            }
            index--;
        }

        System.out.println(n - set.size());
    }
}
