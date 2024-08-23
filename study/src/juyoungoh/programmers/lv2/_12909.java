package juyoungoh.programmers.lv2;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class _12909 {

    public static boolean solution2(String s) {
        String str = s;
        char c[] = str.toCharArray();
        String s1 = String.valueOf(c[0]);
        String s2 = String.valueOf(c[c.length - 1]);

        if (s1.equals("(") && s2.equals(")")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean solution(String s) {
        String str = s;
        if (s.charAt(0) == ')') {
            return false;
        }

        char c[] = str.toCharArray();

        Deque<String> strings = new ArrayDeque<>();
        for (int i = 0; i < c.length; i++) {
            strings.add(String.valueOf(c[i]));
        }

        if (strings.getFirst().equals("(") && strings.getLast().equals(")")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));
        System.out.println(solution("())((()))(()")); // false
    }
}
