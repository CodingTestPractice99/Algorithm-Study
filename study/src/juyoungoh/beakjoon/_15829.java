package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15829 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long num = Long.parseLong(br.readLine());
        String str = br.readLine();

        char alphabet[] = str.toCharArray();

        long mod = 1234567891;
        long r = 31;
        long sum = 0;

        for (int i = 0; i < num; i++) {
            long V = alphabet[i] - 'a' + 1;
            long a2 = 1;
            for (int j = 0; j < i; j++) {
                a2 = (r * a2) % mod;
            }
            long temp = V * a2 % mod;
            sum += temp % mod;
        }
        System.out.println(sum % mod);
    }
}
