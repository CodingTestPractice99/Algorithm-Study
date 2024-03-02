package juyoungoh.programmers.lv0;

public class _120585 {
    public static int solution(int[] array, int height) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (height < array[i]) {
                ++answer;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{149, 180, 192, 170}, 167));
    }
}
