package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _30802 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int people = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String arr[] = str.split(" ");

        int S = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        int L = Integer.parseInt(arr[2]);
        int XL = Integer.parseInt(arr[3]);
        int XXL = Integer.parseInt(arr[4]);
        int XXXL = Integer.parseInt(arr[5]);

        String str2 = br.readLine();
        String arr2[] = str2.split(" ");

        int T = Integer.parseInt(arr2[0]);
        int P = Integer.parseInt(arr2[1]);

        int arr3[] = new int[6];
        arr3[0] = S;
        arr3[1] = M;
        arr3[2] = L;
        arr3[3] = XL;
        arr3[4] = XXL;
        arr3[5] = XXXL;

        int num = 1;

        int arr4[] = new int[6];
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == 0) {
                arr4[i] = 0;
            } else if (T >= arr3[i]) {
                arr4[i] = 1;
            } else {
                while (true) {
                    arr4[i] += 1;
                    if (T * num < arr3[i]) {
                        num += 1;
                    } else {
                        break;
                    }
                }
            }
            num = 1;
        }

        int TSum = 0;

        for (int i = 0; i < arr4.length; i++) {
            TSum += arr4[i];
        }

        int P2 = people / P;
        int P3 = people - (P * P2);

        System.out.println(TSum);
        System.out.println(P2 + " " + P3);
    }
}
