package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8892 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            String str[] = new String[m];
            for (int j = 0; j < m; j++) {
                str[j] = br.readLine();
            }
            boolean b = false;
            String answer = "";
            for (int j = 0; j < str.length; j++) {
                if (b) {
                    break;
                }
                for (int k = 0; k < str.length; k++) {
                    if (j != k) {
                        answer = str[j] + str[k];
                        String answer2 = new StringBuilder(answer).reverse().toString();
                        if (answer.equals(answer2)) {
                            b = true;
                            System.out.println(answer2);
                            break;
                        }
                    }
                }
            }
            if (!b) {
                System.out.println(0);
            }
        }
    }
}
