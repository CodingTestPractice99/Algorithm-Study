package juyoungoh.programmers.lv0;

public class _181884 {

    public static int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if (answer > n) {
                return answer;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{34, 5, 71, 29, 100, 34}, 123));
        System.out.println(solution(new int[]{58, 44, 27, 10, 100}, 139));
    }
}
