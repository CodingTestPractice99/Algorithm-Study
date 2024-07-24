package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1259 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals("0")) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = sb.reverse().toString();
            if (str.equals(str2)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
