package juyoungoh.leetcode;

import juyoungoh.leetcode._2_AddTwoNumbers_1.ListNode;

public class _24_SwapNodesInPairs_1 {
    public static void main(String[] args) {
        // 노드 리스트 생성 (1 -> 2 -> 3 -> 4 -> 5 -> 6)
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        // 연결리스트 연결
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        // swapPairs 메소드 호출
        _24_SwapNodesInPairs_1 solution = new _24_SwapNodesInPairs_1();
        ListNode swappedHead = solution.swapPairs(node1);

        // 결과 출력
        System.out.print("Swapped list: ");
        printList(swappedHead);
    }

    // 연결 리스트 출력 메소드
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println(); // 줄바꿈
    }

    // swapPairs 메소드 (기존 코드 그대로 유지)
    public ListNode swapPairs(ListNode head) {
        // 값을 계산할 임시 노드 선언
        ListNode node = new ListNode(0);
        // 임시 노드를 첫 번째 노드로 선언
        ListNode root = node;
        // 다음 노드는 첫 번째 노드로 지정
        node.next = head;
        // 다음 노드와 다음 다음 노드가 있으면 반복
        while (node.next != null && node.next.next != null) {
            // a는 다음 노드
            ListNode a = node.next;
            // b는 다음 다음 노드
            ListNode b = node.next.next;
            // 위치 변경
            a.next = b.next;
            node.next = b;
            node.next.next = a;
            // 두 칸 앞으로 이동
            node = node.next.next;
        }
        // 첫 번째 노드는 임시 노드이므로 그 다음부터 결과로 리턴
        return root.next;
    }
}
