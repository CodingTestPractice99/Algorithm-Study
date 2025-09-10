package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _34310 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        long stu = 0, fac = 0, vis = 0;

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            if (line == null || line.isEmpty()) { i--; continue; }
            String[] parts = line.split("\\s+");
            String type = parts[0];
            String dir  = parts[1];
            int num = Integer.parseInt(parts[2]);

            long delta = (dir.equals("IN")) ? num : -num;
            if (type.equals("STU")) stu += delta;
            else if (type.equals("FAC")) fac += delta;
            else if (type.equals("VIS")) vis += delta;
        }

        long total = stu + fac + vis;
        if (total == 0) System.out.println("NO STRAGGLERS");
        else System.out.println(total);
    }
}
