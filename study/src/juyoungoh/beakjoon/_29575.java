package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _29575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 1. 상금표 개수 n
        int n = Integer.parseInt(br.readLine().trim());

        // 2. 조합 → 상금 저장
        Map<String, Integer> rewardMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String combo = st.nextToken();
            int reward = Integer.parseInt(st.nextToken());
            rewardMap.put(combo, reward);
        }

        // 3. 게임 횟수 m
        int m = Integer.parseInt(br.readLine().trim());

        int totalReward = 0;
        for (int i = 0; i < m; i++) {
            String result = br.readLine().trim();
            if (rewardMap.containsKey(result)) {
                totalReward += rewardMap.get(result);
            }
        }

        // 4. 비용 (10원 × m)
        int cost = m * 10;

        // 5. 최종 자본 변화 = 상금 합 - 비용
        int finalCapital = totalReward - cost;

        System.out.println(finalCapital);
    }
}
