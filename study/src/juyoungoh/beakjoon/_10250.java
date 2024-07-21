package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _10250 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            String strArr[] = input.split(" ");
            int H = Integer.parseInt(strArr[0]);
            int W = Integer.parseInt(strArr[1]);
            int people = Integer.parseInt(strArr[2]);

            List<String> stringList = new ArrayList<>();
            int count = 1;

            for (int j = 1; j <= W; j++) { // 12
                for (int k = 1; k <= H; k++) { // 6
                    if (j < 10) {
                        stringList.add(k + "0" + count);
                    } else {
                        stringList.add(k + (count + ""));
                    }
                }
                count++;
            }

            int count2 = 0;

            for (int j = 0; j < stringList.size(); j++) {
                count2++;
                if (people == count2) {
                    System.out.println(stringList.get(j));
                }
            }
        }
    }
}

