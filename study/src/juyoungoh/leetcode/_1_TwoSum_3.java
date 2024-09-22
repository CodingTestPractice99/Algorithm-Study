package juyoungoh.leetcode;

import java.util.Arrays;

public class _1_TowSum_3 {

    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left != right) {
            // 합이 target 보다 작으면 왼쪽 포인터를 오른쪽으로 이동
            if (nums[left] + nums[right] < target) {
                left += 1;

                // 합이 target 보다 크면 오른쪽 포인터를 왼쪽으로 이동
            } else if (nums[left] + nums[right] > target) {
                right -= 1;
            } else {
                return new int[]{left, right};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{10, 6, 15, 2}, 8)));
    }
}
