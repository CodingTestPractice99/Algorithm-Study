package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _26906 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        Map<String, Character> dict = new HashMap<>();

        // T개의 알파벳과 이진수 매핑 입력받기
        for (int i = 0; i < T; i++) {
            String[] parts = br.readLine().split(" ");
            char ch = parts[0].charAt(0);
            String code = parts[1];
            dict.put(code, ch);
        }

        String runestone = br.readLine();
        StringBuilder sb = new StringBuilder();

        // 4자리씩 잘라서 변환
        for (int i = 0; i < runestone.length(); i += 4) {
            String chunk = runestone.substring(i, i + 4);
            if (dict.containsKey(chunk)) {
                sb.append(dict.get(chunk));
            } else {
                sb.append("?");
            }
        }

        System.out.println(sb.toString());
    }
}
