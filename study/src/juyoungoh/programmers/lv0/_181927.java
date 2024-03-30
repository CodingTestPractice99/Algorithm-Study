package juyoungoh.programmers.lv0;

public class _181927 {

    public static int[] solution(int[] num_list) {
        int index[] = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++) {
            index[i] += num_list[i];
        }
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            index[index.length - 1] += num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            index[index.length - 1] += num_list[num_list.length - 1] * 2;
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 2}));
        System.out.println(solution(new int[]{1, 2, 2, 2, 2}));
        System.out.println(solution(new int[]{2, 1, 6}));
        System.out.println(solution(new int[]{5, 2, 1, 7, 5}));
        System.out.println(solution(new int[]{1, 2}));
        System.out.println(solution(new int[]{2, 1}));
    }
}
