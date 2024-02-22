package juyoungoh.programmers.lv0;

public class _120903 {

    public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        if (s1.length > s2.length) {
            for (int i = 0; i < s2.length; i++) {
                for (int j = 0; j < s1.length; j++) {
                    if (s2[i].equals(s1[j])) {
                        answer++;
                    }
                }
                return answer;
            }
        } else if (s1.length == s2.length) {
            for (int i = 0; i < s2.length; i++) {
                for (int j = 0; j < s1.length; j++) {
                    if (s2[i].equals(s1[j])) {
                        answer++;
                    }
                }
            }
            return answer;
        } else {
            for (int i = 0; i < s1.length; i++) {
                for (int j = 0; j < s2.length; j++) {
                    if (s1[i].equals(s2[j])) {
                        answer++;
                    }
                }
            }
        }
        return answer;
}

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "c", "d", "q"}));
        System.out.println(solution(new String[]{"n", "omg"}, new String[]{"m", "dot"}));
    }
}
