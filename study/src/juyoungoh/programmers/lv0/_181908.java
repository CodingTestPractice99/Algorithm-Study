package juyoungoh.programmers.lv0;

public class _181908 {

    public static int solution(String my_string, String is_suffix) {
        String str = "";

        if (my_string.length() == is_suffix.length() && my_string.equals(is_suffix)) {
            return 1;
        }
        if (my_string.length() < is_suffix.length()) {
            return 0;
        }
        str = my_string.substring((my_string.length() - is_suffix.length()), my_string.length());
        if (str.equals(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("banana", "nan"));
        System.out.println(solution("banana", "wxyz"));
        System.out.println(solution("banana", "abanana"));
        System.out.println(solution("banana", "a"));
        System.out.println(solution("banana", "na"));
        System.out.println(solution("banana", "nana"));
    }
}
