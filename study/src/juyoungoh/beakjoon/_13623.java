package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _13623 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        
        if (s[0].equals(s[1]) && s[1].equals(s[2])) {
            System.out.println("*");
        } else if (s[0].equals(s[1])) {
            System.out.println("C");
        } else if (s[1].equals(s[2])) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
