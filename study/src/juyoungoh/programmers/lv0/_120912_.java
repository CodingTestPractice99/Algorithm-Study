package juyoungoh.programmers.lv0;

public class _120912_ {

    public static int solution(int[] array) {
        int answer = 0;
        for (int i : array) {
            while (i != 0) {
                if (i % 10 == 7) {
                    answer++;
                }
                i /= 10;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{29}));
        System.out.println(solution(new int[]{7, 77, 17}));
        System.out.println(solution(new int[]{10, 29}));
    }
}
