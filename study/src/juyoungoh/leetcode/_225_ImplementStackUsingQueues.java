package juyoungoh.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class _225_ImplementStackUsingQueues {

    // 큐 변수, 구현체는 LinkedList로 선언
    Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        // 엘리먼트 삽입
        queue.add(x);
        // 맨 앞에 두는 상태로 전체 재정렬
        for (int i = 1; i < queue.size(); i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        // 재정렬한 상태이므로 큐 연산으로 추출
        return queue.remove();
    }

    public int top() {
        // 재정렬한 상태이므로 큐 연산으로 조회
        return queue.peek();
    }

    public boolean empty() {
        // 크기를 비교해 비어 있는지 확인
        return queue.size() == 0;
    }

    public static void main(String[] args) {
        _225_ImplementStackUsingQueues stack = new _225_ImplementStackUsingQueues();

        // 스택에 엘리먼트 삽입
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // 최상단 엘리먼트 출력
        System.out.println("Top element: " + stack.top());  // 3

        // 최상단 엘리먼트 제거
        System.out.println("Popped element: " + stack.pop());  // 3

        // 최상단 엘리먼트 출력
        System.out.println("Top element: " + stack.top());  // 2

        // 스택이 비어있는지 확인
        System.out.println("Is stack empty? " + stack.empty());  // false

        // 모든 엘리먼트 제거
        stack.pop();
        stack.pop();

        // 스택이 비어있는지 다시 확인
        System.out.println("Is stack empty? " + stack.empty());  // true
    }
}
