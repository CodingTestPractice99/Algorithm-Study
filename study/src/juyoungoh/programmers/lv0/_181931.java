package juyoungoh.programmers.lv0;

public class _181931 {

    public static int solution(int a, int b, boolean[] included) {
        int answer = 0;

        int index[] = new int[included.length];
        int a2 = a;
        index[0] = a;

        for (int i = 1; i < included.length; i++) {
            index[i] = (a2 += b);
        }

        for (int i = 0; i < included.length; i++) {
            if (included[i] == true) {
                answer += index[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 4, new boolean[]{true, false, false, true, true}));
        System.out.println(solution(7, 1, new boolean[]{false, false, false, true, false, false, false}));
    }
}
