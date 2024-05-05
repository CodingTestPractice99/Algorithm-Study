package juyoungoh.programmers.lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _181945 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        for (char c : a.toCharArray()) {
            System.out.println(c);
        }
    }
}
