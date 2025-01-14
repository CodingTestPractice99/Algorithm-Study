package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3449 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String binaryStr1 = br.readLine();
            String binaryStr2 = br.readLine();


            int distance = calculateHammingDistance(binaryStr1, binaryStr2);


            System.out.println("Hamming distance is " + distance + ".");
        }
    }

    public static int calculateHammingDistance(String str1, String str2) {
        int distance = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                distance++; // 비트가 다르면 해밍 거리 증가
            }
        }
        return distance;
    }
}
