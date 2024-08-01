package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2231_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 자릿수의 길이를 알기 위해 일단 문자열로 입력받는다.
        String str_N = br.readLine();

        // 해당 문자열의 길이 변수
        int N_len = str_N.length();

        // 문자열을 정수(int)로 변환
        int N = Integer.parseInt(str_N);
        int result = 0;

        // i 는 가능한 최솟값인 N - 9 * N 의 각 자릿수부터 시작
        for (int i = (N - (N_len * 9)); i < N; i++) {
            int number = i;
            int sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            // i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
            if (sum + i == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
