package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4101 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String input[] = br.readLine().split(" ");
            if (Integer.parseInt(input[0]) == 0 && Integer.parseInt(input[1]) == 0) {
                break;
            }
            if (Integer.parseInt(input[0]) > Integer.parseInt(input[1])) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

