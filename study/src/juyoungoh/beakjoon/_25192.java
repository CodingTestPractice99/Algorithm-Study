package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class _25192 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<String> strList = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
             strList.add(br.readLine());
            if (strList.get(i).equals("ENTER")) {
                
            }
        }

        for (int i = 0; i < strList.size(); i++) {
            if (!(strList.get(i).equals("ENTER"))) {
                count++;
            }
        }
        System.out.println(count);
    }
}

