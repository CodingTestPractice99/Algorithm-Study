package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4999 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String JeaHwan = br.readLine();
        String doctor = br.readLine();

        char arr1[] = JeaHwan.toCharArray();
        char arr2[] = doctor.toCharArray();

        if (arr1.length >= arr2.length) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
