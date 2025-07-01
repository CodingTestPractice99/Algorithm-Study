package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24183 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        // mm² → m² 변환: × 1e-6
        double envelopeWeight = a * 2 * 229 * 324 * 1e-6;
        double posterWeight = b * 2 * 297 * 420 * 1e-6;
        double infoWeight = c * 210 * 297 * 1e-6;

        double totalWeight = envelopeWeight + posterWeight + infoWeight;

        System.out.printf("%.6f\n", totalWeight);
    }
}
