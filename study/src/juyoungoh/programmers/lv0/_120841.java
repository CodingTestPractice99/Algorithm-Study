package juyoungoh.programmers.lv0;

public class _120841 {
    public static int solution(int[] dot) {
        int answer = 0;
        if (dot[0] >= 1 && dot[1] >= 1) {
            return 1;
        } else if (dot[0] < 0 && dot[1] >= 1) {
            return 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            return 3;
        } else if (dot[0] >= 1 && dot[1] < 0) {
            return 4;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 4}));
        System.out.println(solution(new int[]{-7, 9}));
    }
}
