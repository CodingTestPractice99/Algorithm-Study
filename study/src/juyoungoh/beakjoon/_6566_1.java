package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _6566_1 {

    // 단어 그룹과 크기를 저장할 클래스
    static class Group {
        List<String> words;
        int size;

        Group(List<String> words, int size) {
            this.words = words;
            this.size = size;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Map<String, Integer>> map = new HashMap<>();

        // 입력 받기
        while (true) {
            String str = br.readLine();
            if (str == null || str.isEmpty()) {
                break;
            }
            char[] c = str.toCharArray();
            Arrays.sort(c);  // 단어를 정렬하여 애너그램 그룹의 key로 사용
            String key = String.valueOf(c);

            // 애너그램 그룹에 단어 추가 및 카운트 증가
            map.putIfAbsent(key, new HashMap<>());
            Map<String, Integer> countWord = map.get(key);
            countWord.put(str, countWord.getOrDefault(str, 0) + 1);  // 단어의 개수 카운트
        }

        // Group 리스트 생성
        List<Group> groups = new ArrayList<>();

        for (Map<String, Integer> wordCount : map.values()) {
            List<String> groupWords = new ArrayList<>(wordCount.keySet());  // 중복 제외한 단어 리스트
            Collections.sort(groupWords);  // 단어들을 사전순으로 정렬

            int groupSize = 0;
            for (int count : wordCount.values()) {
                 groupSize += count;  // 그룹의 크기 계산 (중복 단어 포함)
            }

            groups.add(new Group(groupWords, groupSize));  // Group 객체로 추가
        }

        // 그룹 크기별로 내림차순 정렬, 크기가 같으면 첫 번째 단어 기준으로 사전순 정렬
        Collections.sort(groups, (g1, g2) -> {
            if (g1.size != g2.size) {
                return Integer.compare(g2.size, g1.size);  // 크기 내림차순
            }
            return g1.words.get(0).compareTo(g2.words.get(0));  // 첫 번째 단어 사전순 정렬
        });

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (Group group : groups) {
            if (count >= 5) {  // 최대 5개의 그룹만 출력
                break;
            }
            sb.append("Group of size ").append(group.size).append(":");

            // 각 그룹의 단어 출력 (중복 없이)
            for (String word : group.words) {
                sb.append(" ").append(word);
            }
            sb.append(" .\n");
            count++;
        }
        System.out.print(sb);
    }
}
