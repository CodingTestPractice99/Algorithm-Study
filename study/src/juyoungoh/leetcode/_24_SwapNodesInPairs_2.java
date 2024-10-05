package juyoungoh.leetcode;

import juyoungoh.leetcode._2_AddTwoNumbers_1.ListNode;

public class _24_SwapNodesInPairs_2 {
    public ListNode swapPairs(ListNode head) {
        // 현재 노드와 다음 노드가 있으면 반복
        if (head != null && head.next != null) {
            // 다음 노드 선언
            ListNode p = head.next;
            // 다음 다음 노드를 파라미터로 전달하고 스왑된 값을 리턴받음
            head.next = swapPairs(head.next.next);
            // 다음 다음 노드는 현재 노드로 지정
            p.next = head;
            // 다음 노드 리턴
            return p;
        }
        return head;
    }
}
