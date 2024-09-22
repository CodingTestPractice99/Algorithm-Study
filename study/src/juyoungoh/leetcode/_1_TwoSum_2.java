package juyoungoh.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum_2 {
    public static int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> numsMap = new HashMap<>();
       // 하나의 for 반복으로 통합
        for (int i = 0; i < nums.length; i++) {
            // target 에서 num 을 뺀 값이 있으면 정답으로 리턴
            if (numsMap.containsKey(target - nums[i])) {
                return new int[]{numsMap.get(target - nums[i]), i};
            }
            // 정답이 아니므로 다음번 비교를 위해 인덱스를 맵에 저장
            numsMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{10, 6, 15, 2}, 8)));
    }
}
