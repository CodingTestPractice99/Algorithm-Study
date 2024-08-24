package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _14425 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<String> strN = new ArrayList<>();
        List<String> strM = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            strN.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            strM.add(br.readLine());
        }

        int count = 0;
        for (int i = 0; i < strN.size(); i++) {
            for (int j = 0; j < strM.size(); j++) {
                if (strN.get(i).equals(strM.get(j))) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
