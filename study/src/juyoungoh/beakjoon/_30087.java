package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _30087 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.equals("Algorithm")) {
                System.out.println(204);
            } else if (str.equals("DataAnalysis")) {
                System.out.println(207);
            } else if (str.equals("ArtificialIntelligence")) {
                System.out.println(302);
            } else if (str.equals("CyberSecurity")) {
                System.out.println("B101");
            } else if (str.equals("Network")) {
                System.out.println(303);
            } else if (str.equals("Startup")) {
                System.out.println(501);
            } else if (str.equals("TestStrategy")) {
                System.out.println(105);
            }
        }
    }
}
