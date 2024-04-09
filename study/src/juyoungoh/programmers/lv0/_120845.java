package juyoungoh.programmers.lv0;

public class _120845 {

    public static int solution(int[] box, int n) {
        int width = box[0] / n;
        int length = box[1] / n;
        int height = box[2] / n;

        return width * length * height;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 1}, 1));
        System.out.println(solution(new int[]{10, 8, 6}, 3));
    }
}
