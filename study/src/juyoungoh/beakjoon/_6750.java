package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _6750 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Character> set = new HashSet<>(Arrays.asList('I', 'O', 'S', 'H', 'Z', 'X', 'N'));

        String input = br.readLine();
        for (char ch : input.toCharArray()) {
            if (!set.contains(ch)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
