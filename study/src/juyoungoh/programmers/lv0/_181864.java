package juyoungoh.programmers.lv0;

public class _181864 {

    public static int solution(String myString, String pat) {
        int answer = 0;
        String str = "";

        char c[] = myString.toCharArray();
        char c2[] = new char[c.length];
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'A') {
                c2[i] = 'B';
            } else {
                c2[i] = 'A';
            }
        }
        str = String.valueOf(c2);

        if (str.contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        System.out.println(solution("ABBAA", "AABB"));
        System.out.println(solution("ABAB", "ABAB"));
    }
}
