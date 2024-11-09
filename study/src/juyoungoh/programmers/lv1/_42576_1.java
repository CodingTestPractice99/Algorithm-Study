package juyoungoh.programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class _42576_1 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            int n = map.get(s);
            if (n == 1) {
                map.remove(s);
            } else {
                map.put(s, map.get(s) - 1);
            }
        }
        return map.entrySet().iterator().next().getKey();
    }
}
