package juyoungoh.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _347_TopKFrequentElements_1 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Map<Integer, List<Integer>> freq = new HashMap<>();
        for (int elem : freq.keySet()) {
            int frequency = map.get(elem);
            List<Integer> list = freq.getOrDefault(frequency, new ArrayList<>());
            list.add(elem);
            freq.put(frequency, list);
        }

        int answer[] = new int[k];
        int index = 0;
        for (int i = nums.length; i >= 0 && index < k; i--) {
            if (freq.get(i) != null) {
                for (int n : freq.get(i)) {
                    answer[index] = n;
                    index++;
                }
            }
        }
        return answer;
    }
}
