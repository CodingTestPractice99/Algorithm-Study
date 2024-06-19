package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5543 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int setMenu[] = new int[3];
        int drink[] = new int[2];

        int minDrink = 0;
        int minMenu = 0;

        int answer = 0;

        for (int i = 0; i < 3; i++) {
            setMenu[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 2; i++) {
            drink[i] = Integer.parseInt(br.readLine());
        }

        minMenu = setMenu[0];

        for (int i = 0; i < setMenu.length; i++) {
            if (setMenu[i] < minMenu) {
                minMenu = setMenu[i];
            }
        }

        minDrink = drink[0];
        if (minDrink > drink[1]) {
            minDrink = drink[1];
        }

        answer = (minMenu + minDrink) - 50;
        System.out.println(answer);
    }
}
