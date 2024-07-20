package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31403 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String strA = String.valueOf(A);
        String strB = String.valueOf(B);
        String strAB = strA + strB;
        int AB = Integer.parseInt(strAB);

        System.out.println((A + B) - C);
        System.out.println(AB - C);
    }
}
