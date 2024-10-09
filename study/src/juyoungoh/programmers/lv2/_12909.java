package juyoungoh.programmers.lv2;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class _12909 {


    public static boolean solution(String s) {
        Map<String, String> map = new HashMap<>() {{
            put(")", "(");
        }};

        Deque<String> stack = new ArrayDeque<>();

        String[] split = s.split("");
        for (int j = 0; j < split.length; j++) {
            if (!map.containsKey(split[j])) {
                stack.push(split[j]);
            } else if (stack.isEmpty() || !(map.get(split[j]).equals(stack.pop()))) {
                return false;
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));
        System.out.println(solution("())((()))(()")); // false
    }
}
