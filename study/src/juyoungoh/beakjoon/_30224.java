package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _30224 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int n2 = Integer.parseInt(n);

        if (!(n.contains("7")) && n2 % 7 != 0) {
            System.out.println(0);
        } else if (!(n.contains("7")) && n2 % 7 == 0){
            System.out.println(1);
        } else if ((n.contains("7")) && n2 % 7 != 0) {
            System.out.println(2);
        } else if ((n.contains("7") && n2 % 7 == 0)) {
            System.out.println(3);
        }


    }
}
