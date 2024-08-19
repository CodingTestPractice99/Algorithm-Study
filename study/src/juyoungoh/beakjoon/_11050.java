package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11050 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String s2[] = s.split(" ");

        long n = Integer.parseInt(s2[0]);
        long k = Integer.parseInt(s2[1]);
        long n2 = n - k;

        long a = 1;
        long b = 1;
        long c = 1;

        a = getMultiply(n, a);
        b = getMultiply(k, b);
        c = getMultiply(n2, c);

        long a2 = b * c;
        System.out.println(a / a2);
    }

    private static long getMultiply(long n, long a) {
        while (n != 0) {
            a *= n;
            n--;
        }
        return a;
    }
}
