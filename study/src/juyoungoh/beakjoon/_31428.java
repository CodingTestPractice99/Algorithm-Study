package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31428 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");
        String str = br.readLine();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (str.equals(arr[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
