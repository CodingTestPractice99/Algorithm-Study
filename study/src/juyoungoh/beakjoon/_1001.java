package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 1001
class _1001 { // 제출할 때 클래스 이름 반드시 Main으로 바꿔서 제출해야 함. (백준만)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 빠른 입력을 위한 도구 (알고리즘 용)
        String line = br.readLine(); // 한 줄 읽는다. 즉, 한 줄 입력 받는다.
        // =============== 입력은 여기까지 ===============

        // 문자열을 토큰으로 만들어주는 도구 (알고리즘 용)
        // 기본 구분자(delimiter)는 공백, 줄바꿈, Tab, ... 이다.
        StringTokenizer st = new StringTokenizer(line);

        // nextToken() 다음 토큰이 있으면 주세요~ 근데 문자열 토크나이저이기 때문에 문자열로 반환된다.
        // 그래서 정수로 변환해야지 int 타입 변수에 집어 넣을 수 있다.
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a - b);


    }
}