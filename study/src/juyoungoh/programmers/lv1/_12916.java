package juyoungoh.programmers.lv1;

public class _12916 {

    public static boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        String s2 = s.toUpperCase();

        for (int i = 0; i < s2.length(); i++) {
            if (String.valueOf(s2.charAt(i)).equals("P")) {
                pCount++;
            } else if (String.valueOf(s2.charAt(i)).equals("Y")) {
                yCount++;
            }
        }

        if (pCount == yCount) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
    }
}
