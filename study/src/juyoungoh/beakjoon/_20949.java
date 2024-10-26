package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _20949 {

    static class Monitor {

        int width;
        int height;
        int number;
        double ppl;

        public Monitor(int width, int height, int number) {
            this.width = width;
            this.height = height;
            this.number = number;
            pplCalculator();
        }

        private void pplCalculator() {
            ppl = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)) / 77;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Monitor> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            String[] s = str.split(" ");
            int w = Integer.parseInt(s[0]);
            int h = Integer.parseInt(s[1]);
            list.add(new Monitor(w, h, i));
        }

        Collections.sort(list, (o1, o2) -> {
            int compare = Double.compare(o2.ppl, o1.ppl);
            return compare;
        });

        for (Monitor m : list) {
            System.out.println(m.number);
        }
    }
}
