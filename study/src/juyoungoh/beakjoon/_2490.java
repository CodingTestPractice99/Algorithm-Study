package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2490 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < 3; j++) {
            String input = br.readLine();
            String[] inputArr = input.split(" ");
            int countZero = 0;
            int countOne = 0;

            for (int i = 0; i < inputArr.length; i++) {
                if (inputArr[i].equals("0")) {
                    countZero++;
                } else {
                    countOne++;
                }

                if (countZero == 1 && countOne == 3) {
                    sb.append("A").append("\n");
                } else if (countZero == 2 && countOne == 2) {
                    sb.append("B").append("\n");
                } else if (countZero == 3 && countOne == 1) {
                    sb.append("C").append("\n");
                } else if (countZero == 4) {
                    sb.append("D").append("\n");
                } else if (countOne == 4) {
                    sb.append("E").append("\n");
                }
            }
            countZero = 0;
            countOne = 0;
        }
        System.out.print(sb);
    }
}

