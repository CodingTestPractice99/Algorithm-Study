package juyoungoh.programmers.lv0;

public class _181930_1 {
    public int solution(int a, int b, int c) {
        int answer = 1;
        int count = 1;

        if (a == b || a == c || b == c) {
            count++;
        }

        if (a == b && b == c) {
            count++;
        }

        for (int i = 1; i <= count; i++) {
            answer *= (pow(a, i) + pow(b, i) + pow(c, i));
        }
        return answer;
    }

    private int pow(int a, int b) {
        if (b == 0) return 1;
        return a * pow(a, b - 1);
    }

    public static void main(String[] args) {
        _181930_1 answer = new _181930_1();
        System.out.println(answer.solution(2, 6, 1));
        System.out.println(answer.solution(5, 3, 3));
        System.out.println(answer.solution(4, 4, 4));
    }
}
