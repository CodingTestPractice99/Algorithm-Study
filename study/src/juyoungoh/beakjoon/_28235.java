package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _28235 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        if (str.equals("SONGDO")) {
            System.out.println("HIGHSCHOOL");
        } else if (str.equals("CODE")) {
            System.out.println("MASTER");
        } else if (str.equals("2023")) {
            System.out.println("0611");
        } else if (str.equals("ALGORITHM")) {
            System.out.println("CONTEST");
        }
    }
}
