package juyoungoh.beakjoon;

import java.util.Scanner;

// 시는 0부터 23까지의 정수
// 분은 0부터 59까지의 정수

// useTime + minute 를 더했을 때 60이 안넘는 경우 => 분만 더한다.
// useTime + minute 를 더했을 때 60이 넘는 경우 => 시간과 분을 계산한다.
// useTime 자체가 60이 넘는 경우, 반복문을 돌리면서 분을 60으로 빼주고 시간을 +1씩 한다.
// 60이 넘을 경우 시간을 +1씩 더한다.
// 23시가 넘을 경우는 0으로 다시 돌아간다.

public class _2525 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String startTime[] = scanner.nextLine().split(" ");
        int useTime = scanner.nextInt();
        scanner.nextLine();

        int hour = Integer.parseInt(startTime[0]);
        int minute = Integer.parseInt(startTime[1]);

        if (useTime + minute < 60) {
            System.out.println(hour + " " + (useTime + minute));
        } else if (useTime >= 60) {
            while (minute + useTime >= 60) {
                minute -= 60;
                if (hour == 23) {
                    hour = 0;
                } else {
                    hour++;
                }
            }
            System.out.println(hour + " " + (useTime + minute));
        } else if (useTime + minute >= 60) {
            while (minute + useTime >= 60) {
                minute -= 60;
                if (hour == 23) {
                    hour = 0;
                } else {
                    hour++;
                }
            }
            System.out.println(hour + " " + (useTime + minute));
        }
    }
}
