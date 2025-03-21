package juyoungoh.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class _973_KClosestPointsToOrigin {

    static class Point {

        double distance;
        int[] point;

        // 거리와 좌표를 파라미터로 받는다.
        public Point(double distance, int[] point) {
            this.distance = distance;
            this.point = point;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        // Point 클래스를 저장하는 우선순위 큐로, 정렬 기준은 distance 로 한다.
        PriorityQueue<Point> pq = new PriorityQueue<>(Comparator.comparingDouble(a -> a.distance));

        // 파라미터로 받은 좌표 목록 순회
        for (int[] point : points) {
            // 유클리드 거리 계산
            double distance = Math.sqrt((long) point[0] * point[0] + (long) point[1] * point[1]);
            // 우선순위 큐에 거리와 좌표를 Point 클래스로 담아 삽입
            pq.add(new Point(distance, point));
        }

        int[][] results = new int[k][];
        // k번 만큼 반복하여 결과 추출
        for (int i = 0; i < k; i++) {
            // 우선순위 큐에서 추출한 Point 클래스의 좌표(point)를 결과로 삽입
            results[i] = pq.poll().point;
        }
        return results;
    }

    public static void main(String[] args) {
        // 입력값 설정
        int[][] points = {{3, 3}, {6, -1}, {-2, 4}};
        int k = 2;

        // _973_KClosestPointsToOrigin 클래스의 kClosest 메소드 호출
        _973_KClosestPointsToOrigin solution = new _973_KClosestPointsToOrigin();
        int[][] result = solution.kClosest(points, k);

        // 결과 출력
        System.out.println("K Closest Points to Origin: " + Arrays.deepToString(result));
    }
}
