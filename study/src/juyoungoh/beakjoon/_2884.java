package juyoungoh.beakjoon;


import java.util.Scanner;

// 케이스 1
// 분이 45보다 크거나 같은 경우 예) 46 -> 46 + 15 - 60 시간 - 1
// 분이 45보다 작은 경우인데 45를 더했을 때, 60이 안넘는 경우 -> 시간 그대로
// 분이 45보다 작은 경우인데 45를 더했을 때, 60이 넘는 경우 -> 시간 -1

public class _2884 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num[] = scanner.nextLine().split(" ");
        int hour = Integer.parseInt(num[0]);
        int minutes = Integer.parseInt(num[1]);

        int minuteResult = 0;
        int hourResult = 0;

        if (minutes < 45 && minutes >= 0 && hour == 0) {
            minuteResult = minutes + 15;
            hourResult = 23;
            System.out.println(hourResult + " " + minuteResult);
        } else if (minutes < 45 && minutes >= 0 && hour <= 23) {
            minuteResult = minutes + 15;
            hourResult = hour - 1;
            System.out.println(hourResult + " " + minuteResult);
        } else if (minutes >= 45 && minutes < 60 && hour <= 23) {
            minuteResult = minutes - 45;
            hourResult = hour;
            System.out.println(hourResult + " " + minuteResult);
        }
    }
}
