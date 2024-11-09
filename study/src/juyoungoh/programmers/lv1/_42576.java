package juyoungoh.programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class _42576 {

    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> m = new HashMap<>();
        // 참여 선수 이름, 동명이인인 경우 +1 해시맵 삽입
        for (String p : participant) {
            m.put(p, m.getOrDefault(p, 0) + 1);
        }
        // 완주 선수 이름 제거
        for (String c : completion) {
            int left = m.get(c);
            if (left == 1) {
                m.remove(c);
            } else {
                m.put(c, left - 1);
            }
        }
        // 남아 있는 유일한 키(이름) 리턴
        return m.entrySet().iterator().next().getKey();
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
            new String[]{"josipa", "filipa", "marina", "nikola"}));
    }
}
