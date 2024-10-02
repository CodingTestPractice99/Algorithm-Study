package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _11652_1 {

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

        // 첫 번째 줄에서 카드의 개수 N을 입력받는다.
        int N = Integer.parseInt(br.readLine());

        Map<Long, Integer> map = new HashMap<>();

        // N개의 숫자 카드 입력 처리
        for (int i = 0; i < N; i++) {
            Long l = Long.parseLong(br.readLine());
            map.put(l, map.getOrDefault(l, 0) + 1);  // 숫자의 빈도를 카운트
        }

        List<Word> list = new ArrayList<>();
        for (Long key : map.keySet()) {
            list.add(new Word(key, map.get(key)));
        }

        // 빈도 순으로 내림차순, 숫자 순으로 오름차순 정렬
        Collections.sort(list, (o1, o2) -> {
            int compare = Integer.compare(o2.count, o1.count);
            if (compare == 0) {
                return Long.compare(o1.number, o2.number);
            }
            return compare;
        });

        // 가장 많이 나온 숫자를 출력
        System.out.print(list.get(0).number);
    }
}
