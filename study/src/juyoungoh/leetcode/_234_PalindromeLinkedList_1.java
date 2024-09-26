package juyoungoh.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import juyoungoh.leetcode._234_PalindromeLinkedList.ListNode;

public class _234_PalindromeLinkedList_1 {

    public boolean isPalindrome(ListNode head) {
        Deque<Integer> deque = new LinkedList<>();
        // 연결 리스트를 데크에 삽입
        ListNode node = head;
        while (node != null) {
            deque.add(node.val);
            node = node.next;
        }

        // 데크가 모드 비거나(짝수 개 일 때) 1개 이하(홀수 개 일 때)가 될 때까지 비교
        while (!deque.isEmpty() && deque.size() > 1) {
            // 데크의 양 끝을 추출해 팰린드롬 여부 확인
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }
}
