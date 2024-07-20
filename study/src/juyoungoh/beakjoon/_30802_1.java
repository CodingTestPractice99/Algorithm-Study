package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _30802_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] sizeArr = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            sizeArr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            cnt += sizeArr[i] / T;
            cnt = sizeArr[i] % T > 0 ? cnt + 1 : cnt;
        }
        bw.write(cnt + "\n");
        bw.write(N / P + " " + N % P);

        br.close();
        bw.flush();
        bw.close();
    }

}
