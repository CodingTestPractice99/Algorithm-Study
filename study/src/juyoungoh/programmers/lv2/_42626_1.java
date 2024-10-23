package juyoungoh.programmers.lv2;

import java.util.PriorityQueue;

public class _42626_1 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int aScoville : scoville) {
            heap.add(aScoville);
        }
        while (heap.peek() < K) {
            if (heap.size() == 1) {
                return -1;
            }

            //섞는다.
            int val1 = heap.poll();
            int val2 = heap.poll();

            int result = val1 + (val2 * 2);

            heap.add(result);
            answer++;
        }
        return answer;
    }
}
