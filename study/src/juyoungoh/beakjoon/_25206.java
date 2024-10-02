package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class _25206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double creditGradePointTotal = 0;
        double credit = 0;

        for (int i = 0; i < 20; i++) {
            String str = br.readLine();
            String arr[] = str.split(" ");
            if (!(arr[2].equals("P"))) {
                credit += Double.parseDouble(arr[1]);
                if (arr[2].equals("A+")) {
                    creditGradePointTotal +=
                        (Double.parseDouble(arr[1]) * 4.5);
                } else if (arr[2].equals("A0")) {
                    creditGradePointTotal +=
                        (Double.parseDouble(arr[1]) * 4.0);
                } else if (arr[2].equals("B+")) {
                    creditGradePointTotal +=
                        (Double.parseDouble(arr[1]) * 3.5);
                } else if (arr[2].equals("B0")) {
                    creditGradePointTotal +=
                        (Double.parseDouble(arr[1]) * 3.0);
                } else if (arr[2].equals("C+")) {
                    creditGradePointTotal +=
                        (Double.parseDouble(arr[1]) * 2.5);
                } else if (arr[2].equals("C0")) {
                    creditGradePointTotal +=
                        (Double.parseDouble(arr[1]) * 2.0);
                } else if (arr[2].equals("D+")) {
                    creditGradePointTotal +=
                        (Double.parseDouble(arr[1]) * 1.5);
                } else if (arr[2].equals("D0")) {
                    creditGradePointTotal +=
                        (Double.parseDouble(arr[1]) * 1.0);
                } else if (arr[2].equals("F")) {
                    creditGradePointTotal +=
                        (Double.parseDouble(arr[1]) * 0.0);
                }
            }
        }
        double value = creditGradePointTotal / credit;
        DecimalFormat df = new DecimalFormat("#.######");
        String formattedValue = df.format(value);
        System.out.println(formattedValue);
    }
}
