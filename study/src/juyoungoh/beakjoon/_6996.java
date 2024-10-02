package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _6996 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String arr[] = str.split(" ");
            char char1[] = arr[0].toCharArray();
            Arrays.sort(char1);
            char char2[] = arr[1].toCharArray();
            Arrays.sort(char2);
            String str1 = String.valueOf(char1);
            String str2 = String.valueOf(char2);

            if (str1.equals(str2)) {
                System.out.println(arr[0] + " & " + arr[1] + " are anagrams.");
            } else {
                System.out.println(arr[0] + " & " + arr[1] + " are NOT anagrams.");
            }
        }
    }
}
