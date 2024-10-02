package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _11652 {

    static class Word {

        Long number;
        int count;

        Word(Long number, int count) {
            this.number = number;
            this.count = count;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Word> list = new ArrayList<>();
        Map<Long, Integer> map = new HashMap<>();

        while (true) {
            String str = br.readLine();
            if (str == null || str.isEmpty()) { // 먼저 null 체크 후 empty 체크
                break;
            } else {
                Long l = Long.parseLong(str);
                map.put(l, map.getOrDefault(l, 0) + 1);  // 숫자의 빈도를 카운트
            }
        }

        for (Long key : map.keySet()) {
            list.add(new Word(key, map.get(key)));
        }

        Collections.sort(list, (o1, o2) -> {
            int compare = Integer.compare(o2.count, o1.count);
            if (compare == 0) {
                return Long.compare(o1.number, o2.number);
            }
            return compare;
        });

        System.out.print(list.get(0).number);
    }
}

