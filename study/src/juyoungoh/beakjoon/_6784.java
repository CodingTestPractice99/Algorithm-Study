package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6784 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String n1[] = new String[n];
        String answer[] = new String[n];

        for (int i = 0; i < n; i++) {
            n1[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            answer[i] = br.readLine();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (n1[i].equals(answer[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
