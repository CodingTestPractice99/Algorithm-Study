package juyoungoh.leetcode;

import java.util.Stack;

public class _234_PalindromeLinkedList {
   static class ListNode {
        int val;       // 노드의 값 (데이터)
        ListNode next; // 다음 노드를 가리키는 포인터 (참조)

        // 생성자: ListNode를 만들 때 값을 설정하는 용도
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static boolean isPalindrome(ListNode head) {
        // 주의: 스택을 이렇게 선언하면 안됨
        Stack<Integer> stack = new Stack<>();
        // 연결 리스트를 스택에 삽입
        ListNode node = head;
        while (node != null) {
            stack.add(node.val);
            node = node.next;
        }

        // 연결 리스트가 모두 빌 때까지 비교
        while(head != null) {
            // 연결 리스트와 스택에서 추출한 값을 비교해 팰린드롬 판별
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        // 예제 연결 리스트: 1 -> 2 -> 2 -> 1
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);

        // 연결 리스트 연결
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // 팰린드롬 여부 확인
        boolean result = isPalindrome(node1);

        // 결과 출력
        if (result) {
            System.out.println("주어진 연결 리스트는 팰린드롬입니다.");
        } else {
            System.out.println("주어진 연결 리스트는 팰린드롬이 아닙니다.");
        }
    }

}
