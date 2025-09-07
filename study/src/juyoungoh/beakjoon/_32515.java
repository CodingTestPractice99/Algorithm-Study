package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _32515 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String jBases = br.readLine();
        String jKey = br.readLine();
        String iBases = br.readLine();
        String iMeasure = br.readLine();

        StringBuilder newKey = new StringBuilder();

        for (int idx = 0; idx < N; idx++) {
            if (jBases.charAt(idx) == iBases.charAt(idx)) { // 같은 기저일 때만 확인
                char jBit = jKey.charAt(idx);
                char iBit = iMeasure.charAt(idx);

                if (jBit != iBit) { // 다르면 도청 확실
                    System.out.println("htg!");
                    return;
                }
                newKey.append(jBit); // 같으면 새로운 키에 추가
            }
        }
        System.out.println(newKey.toString());
    }
}
