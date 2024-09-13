package juyoungoh.programmers.lv0;

public class _181934 {
    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String str = ineq + eq;
        if (str.equals(">=")) {
            if (n >= m) {
                return 1;
            } else {
                return 0;
            }
        } else if (str.equals("<=")) {
            if (n <= m) {
                return 1;
            } else {
                return 0;
            }
        } else if (str.equals(">!")) {
            if (n > m) {
                return 1;
            } else {
                return 0;
            }
        } else if (str.equals("<!")) {
            if (n < m) {
                return 1;
            } else {
                return 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("<", "=", 20, 50));
        System.out.println(solution(">", "!", 41, 78));
    }

}
