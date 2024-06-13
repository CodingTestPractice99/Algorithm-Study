package juyoungoh.programmers.lv0;

public class _120848_4 {
    public static int solution(int n) {
        int answer = 0;
        int factorial = 1;
        int index = 1;

        while (factorial < n) {
            factorial *= index;
            if (factorial < n) {
                index++;
            } else if (factorial == n) {
                answer = index;
            } else if (n < factorial) {
                answer = (index - 1);
            }
        }
        return answer;
    }
}
