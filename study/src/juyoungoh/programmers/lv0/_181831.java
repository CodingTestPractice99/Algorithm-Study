package juyoungoh.programmers.lv0;

public class _181831 {
    public static int solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{5, 192, 33}, {192, 72, 95}, {33, 95, 999}})); // 1
        System.out.println(solution(new int[][]{{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}})); // 0
    }
}
