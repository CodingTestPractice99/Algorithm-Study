package juyoungoh.leetcode;

public class _641_DesignCircularDeque {

    // 이중 연결 리스트로 사용할 클래스 선언
    static class DoublyLinkedList {

        // 왼쪽으로 연결한 이중 연결 리스트
        DoublyLinkedList left;
        // 오른쪽으로 연결할 이중 연결 리스트
        DoublyLinkedList right;
        int val;

        public DoublyLinkedList(int val) {
            this.val = val;
        }
    }

    int len; // 현재 큐의 크기
    int k; // 전체 큐의 크기
    DoublyLinkedList head; // 이중 연결 리스트 head 노드
    DoublyLinkedList tail; // 이중 연결 리스트 tail 노드

    public _641_DesignCircularDeque(int k) {
        // 이중 연결 리스트 2개 생성
        head = new DoublyLinkedList(0);
        tail = new DoublyLinkedList(0);
        // 서로 연결
        head.right = tail;
        tail.left = head;
        // 전체 큐의 크기 지정
        this.k = k;
        // 현재 큐의 크기 지정
        this.len = 0;
    }

    public boolean insertFront(int value) {
        // 꽉 차 있으면 진행하지 않음
        if (isFull()) {
            return false;
        }
        DoublyLinkedList node = new DoublyLinkedList(value);
        // 신규 노드는 head 바로 오른쪽에 삽입
        node.right = head.right;
        node.left = head;
        head.right.left = node;
        head.right = node;
        len++;
        return true;
    }

    public boolean isFull() {
        // 현재 큐의 크기가 처음 선언한 큐의 크기와 일치하면 꽉 차 있음
        return len == k;
    }
}
