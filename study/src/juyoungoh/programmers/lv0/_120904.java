package juyoungoh.programmers.lv0;

public class _120904 {

    public static int solution(int num, int k) {
        int answer = 0;
        String number = String.valueOf(num);
        String k2 = String.valueOf(k);
        char c[] = number.toCharArray();
        char c2[] = k2.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c2[0] == c[i]) {
                answer = i + 1;
                return answer;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(29183, 1)); // 3
        System.out.println(solution(232443, 4)); // 4
        System.out.println(solution(123456, 7)); // -1
    }
}
