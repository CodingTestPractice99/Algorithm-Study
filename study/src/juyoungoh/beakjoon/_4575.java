package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _4575 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if (s.equals("END")) {
                break;
            }
            String withoutSpaces = s.replace(" ", "");
            String[] str = withoutSpaces.split("");
            String s2 = "";
            Set<String> set = new HashSet<>();
            for (int i = 0; i < str.length; i++) {
                if (!(str[i].isBlank()) || !(str[i].isEmpty())) {
                    s2 += str[i];
                    set.add(str[i]);
                }
            }

            if (set.size() == s2.length()) {
                System.out.println(s);
            }
        }
    }
}
