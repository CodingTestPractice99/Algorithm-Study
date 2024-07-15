package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10101 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int triangle[] = new int[3];

        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = Integer.parseInt(br.readLine());
        }

        if (triangle[0] == 60 && triangle[1] == 60 && triangle[2] == 60) {
            System.out.println("Equilateral");
        } else if (triangle[0] + triangle[1] + triangle[2] == 180 && triangle[0] == triangle[1]) {
            System.out.println("Isosceles");
        } else if (triangle[0] + triangle[1] + triangle[2] == 180 && triangle[1] == triangle[2]) {
            System.out.println("Isosceles");
        } else if (triangle[0] + triangle[1] + triangle[2] == 180 && triangle[2] == triangle[0]) {
            System.out.println("Isosceles");
        } else if (triangle[0] + triangle[1] + triangle[2] == 180 && triangle[2] != triangle[0]
            && triangle[1] != triangle[0] && triangle[2] != triangle[1]) {
            System.out.println("Scalene");
        } else {
            System.out.println("Error");
        }
    }
}