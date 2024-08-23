package juyoungoh.programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _12917 {

    /**
     * num.get(i) 가 Integer 타입인 경우, 바로 'char' 로 캐스팅할 수 없기 때문에
     * "Inconvertible types" 오류가 발생한다. -> 먼저 'Integer' 값을 'int' 로 언박싱한 후 'char'로 캐스팅해야 한다.
     *
     */

    public static String solution(String s) {
        String answer = "";
        char c[] = s.toCharArray();
        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < c.length; i++) {
            num.add(((int) c[i]));
        }

        Collections.sort(num);
        Collections.reverse(num);

        for (int i = 0; i < num.size(); i++) {
            answer += String.valueOf((char) num.get(i).intValue());
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}
