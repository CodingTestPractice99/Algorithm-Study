package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10824 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arr[] = br.readLine().split(" ");

        String a = arr[0] + arr[1];
        String b = arr[2] + arr[3];

        long aNum = Long.parseLong(a);
        long bNum = Long.parseLong(b);

        System.out.println(aNum + bNum);
    }
}
