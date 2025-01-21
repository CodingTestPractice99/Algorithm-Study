package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _28114 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");
        String s3[] = br.readLine().split(" ");

        int answer1[] = new int[3];

        answer1[0] = Integer.parseInt(s1[1]) % 100;
        answer1[1] = Integer.parseInt(s2[1]) % 100;
        answer1[2] = Integer.parseInt(s3[1]) % 100;

        Arrays.sort(answer1);

        String s = "";

        for (int i = 0; i < answer1.length; i++) {
            s += "" + answer1[i];
        }

        System.out.println(s);

        String members[][] = new String[3][3];
        members[0] = s1;
        members[1] = s2;
        members[2] = s3;

        Arrays.sort(members, (a, b) -> Integer.parseInt(b[0]) - Integer.parseInt(a[0]));

        StringBuilder sb = new StringBuilder();
        for(String[] member : members) {
            sb.append(member[2].charAt(0));
        }
        System.out.println(sb);
    }
}
