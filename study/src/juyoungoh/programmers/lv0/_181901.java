package juyoungoh.programmers.lv0;

public class _181901 {

    public static int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int index = 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count < n / k) {
                answer[count] += index * k;
                index++;
                count++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 3));
        System.out.println(solution(15, 5));
    }
}
