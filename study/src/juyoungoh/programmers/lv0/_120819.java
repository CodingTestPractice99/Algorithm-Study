package juyoungoh.programmers.lv0;

public class _120819 {
    public static int[] solution(int money) {
        int[] answer = new int[2];
        int cup = money / 5500;
        answer[0] = cup;

        int useMoney = 5500 * cup;
        int changes = money - useMoney;
        answer[1] = changes;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5500));
        System.out.println(solution(15000));
    }
}
