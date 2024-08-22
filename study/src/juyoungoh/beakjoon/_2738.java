package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _2738 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input[] = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int a[][] = new int[n][m];
        int b[][] = new int[n][m];

        int answer[][] = new int[n][m];
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String a2[] = br.readLine().split(" ");
            for (int j = 0; j < a2.length; j++) {
                listA.add(Integer.parseInt(a2[j]));
            }
        }

        for (int i = 0; i < n; i++) {
            String b2[] = br.readLine().split(" ");
            for (int j = 0; j < b2.length; j++) {
                listB.add(Integer.parseInt(b2[j]));
            }
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = listA.get(index++);
            }
        }

        index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = listB.get(index++);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer[i][j] = a[i][j] + b[i][j];
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(answer[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
