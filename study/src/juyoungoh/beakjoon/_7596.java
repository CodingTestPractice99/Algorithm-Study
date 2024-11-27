package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _7596 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = 0;

        while (true) {
            String str = br.readLine();
            List<String> list = new ArrayList<>();
            if (str.equals("0")) {
                break;
            } else {
                int n = Integer.parseInt(str);

                for (int i = 0; i < n; i++) {
                    list.add(br.readLine());
                }

                Collections.sort(list);
                System.out.println(++index);
                for (String s : list) {
                    System.out.println(s);
                }
            }
        }
    }
}
