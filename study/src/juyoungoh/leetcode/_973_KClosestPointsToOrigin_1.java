package juyoungoh.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _973_KClosestPointsToOrigin_1 {

    // 거리와 좌표를 보관할 Point 클래스 선언
    static class Point {

        long distance;
        int[] point;

        // 거리와 좌표를 파라미터로 받는다.
        public Point(long distance, int[] point) {
            this.distance = distance;
            this.point = point;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        // Point 클래스를 저장하는 우선순위 큐로, 정렬 기준은 distance 로 한다.
        PriorityQueue<Point> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a.distance));

        // 파라미터로 받은 좌표 목록 순회
        for (int[] point : points) {
            // 유클리드 거리 계산
            long distance = (long) point[0] * point[0] + (long) point[1] * point[1];
            // 우선순위 큐에 거리와 좌표를 Point 클래스로 담아 삽입
            pq.add(new Point(distance, point));
        }

        int[][] results = new int[k][];
        // k번만큼 반복하여 결과 추출
        for (int i = 0; i < k; i++) {
            // 우선순위 큐에서 추출한 Point 클래스의 좌표(point)를 결과로 삽입
            results[i] = pq.poll().point;
        }
        return results;
    }
}
