package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _120886 {

    public static int solution(String before, String after) {
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();

        // 배열을 정렬
        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);

        // 정렬된 배열이 같은지 비교
        boolean bool = Arrays.equals(beforeArray, afterArray);

        // 결과 반환
        return bool ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("olleh", "hello"));
        System.out.println(solution("allpe", "apple"));
        System.out.println(solution("wrong", "wrogn"));
    }
}
