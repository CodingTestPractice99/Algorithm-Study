package juyoungoh.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class _42_TrappingRainWater_2 {

    public static int trap(int[] height) {
        Deque<Integer> stack = new ArrayDeque<>();
        int volume = 0;

        for (int i = 0; i < height.length; i++) {
            // 변곡점을 만나는 경우
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                Integer top = stack.pop();

                if (stack.isEmpty()) {
                    break;
                }
                int distance = i - stack.peek() - 1;
                int waters = Math.min(height[i], height[stack.peek()]) - height[top];

                volume += distance * waters;
            }
            stack.push(i);
        }
        return volume;
    }
    public static void main(String[] args) {
        System.out.println(trap(new int[]{1, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
