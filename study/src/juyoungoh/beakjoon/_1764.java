package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class _1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        Set<String> nList = new TreeSet<>();
        Set<String> mList = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            nList.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            mList.add(br.readLine());
        }

        List<String> answer = new ArrayList<>();



        System.out.println(count);
        Collections.sort(answer);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.size(); i++) {
            sb.append(answer.get(i)).append("\n");
        }
        System.out.print(sb);
    }
}
