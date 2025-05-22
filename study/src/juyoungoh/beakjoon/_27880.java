package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27880 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        while (true) {
            String s = br.readLine();
            if (s == null || s.isEmpty() || s.isBlank()) {
                break;
            }
            String[] split = s.split(" ");
            String s1 = split[0];
            int i1 = Integer.parseInt(split[1]);
            if (s1.equals("Es")) {
               sum += i1 * 21;
            } else {
                sum += i1 * 17;
            }
        }
        System.out.println(sum);
    }
}
