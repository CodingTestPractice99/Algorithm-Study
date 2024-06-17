package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11720_2 {

    /**
     * getBytes() - String(문자열) 에 대하여 해당 문자열을 하나의 byte 배열로 변환해주는 메소드다.
     * readLine() 으로 읽어들인 문자를 byte[] 로 변환하여 반환되므로 for-each 구문을 통해 문자열의 문자를 하나하나씩 읽어들일 수 있다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
        br.readLine(); // N 은 쓸모가 없으므로 입력만 받는다.

        int sum = 0;

        for (byte value : br.readLine().getBytes()) {
            sum += (value - '0');
        }
        System.out.print(sum);
    }
}
