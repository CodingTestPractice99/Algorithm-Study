package juyoungoh.leetcode;

import java.util.Arrays;

public class _238_ProductOfArrayExceptSelf_1 {

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int[] a = new int[nums.length];
        int[] b = new int[nums.length];

        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            a[i] = p;
            p *= nums[i];

        }

        p = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            b[i] = p;
            p *= nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = (a[i] * b[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}
