package juyoungoh.programmers.lv0;

public class _120887 {

    public static int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";

        for (int l = i; l <= j; l++) {
            str += String.valueOf(l);
        }
        String k2 = String.valueOf(k);
        char k22[] = k2.toCharArray();
        char c[] = str.toCharArray();
        for (int l = 0; l < c.length; l++) {
            if (k22[0] == c[l]) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 13, 1));
        System.out.println(solution(10, 50, 5));
        System.out.println(solution(3, 10, 2));
    }
}
