package juyoungoh.programmers.lv0;

public class _181843 {
    public static int solution(String my_string, String target) {
        if (my_string.contains(target)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("banana", "wxyz"));
    }

}
