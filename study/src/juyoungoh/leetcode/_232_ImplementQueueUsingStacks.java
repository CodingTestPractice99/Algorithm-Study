package juyoungoh.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class _232_ImplementQueueUsingStacks {

    // 삽입할 때 사용하는 스택 선언
    Deque<Integer> input = new ArrayDeque<>();
    // 추출할 때 사용하는 스택 선언
    Deque<Integer> output = new ArrayDeque<>();

    public void push(int x) {
        // 삽입은 삽입 스택에 단순 추가
        input.push(x);
    }

    public int pop() {
        // 추출 스택 조회하면서 비어 있다면 처리 진행
        peek();
        // 추출 스택에 있는 마지막 값 추출
        return output.pop();
    }

    public int peek() {
        // 추출 스택에 저장된 게 없다면 진행
        if (output.isEmpty()) {
            // 삽입 스택이 비워질 때까지 진행
            while (!input.isEmpty()) {
                // 삽입 스택에서 추출한 결과를 추출 스택에 삽입(역순으로 저장된다.)
                output.push(input.pop());
            }
        }
        // 가장 나중에 삽입된 결과 조회
        return output.peek();
    }

    public boolean empty() {
        // 두 스택이 모두 비어야 비어 있는 것으로 처리
        return input.isEmpty() && output.isEmpty();
    }

    public static void main(String[] args) {
        // 큐 객체 생성
        _232_ImplementQueueUsingStacks queue = new _232_ImplementQueueUsingStacks();

        // 큐에 값 추가
        queue.push(1);
        queue.push(2);
        queue.push(3);

        // 큐의 첫 번째 값 출력 (peek)
        System.out.println("peek: " + queue.peek()); // 출력: 1

        // 첫 번째 값 추출 후 출력 (pop)
        System.out.println("pop: " + queue.pop());   // 출력: 1

        // 그 다음 값 출력 (peek)
        System.out.println("peek: " + queue.peek()); // 출력: 2

        // 큐가 비었는지 확인 (empty)
        System.out.println("is empty: " + queue.empty()); // 출력: false

        // 나머지 값 추출 후 큐가 비었는지 다시 확인
        queue.pop();
        queue.pop();
        System.out.println("is empty: " + queue.empty()); // 출력: true
    }
}
