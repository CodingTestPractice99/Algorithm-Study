package juyoungoh.leetcode;

public class _206_ReverseLinkedList {

    // ListNode 클래스 정의 (값과 다음 노드 참조)
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    // reverse 메서드: 재귀적으로 연결 리스트를 역순으로 변환
    public ListNode reverse(ListNode node, ListNode prev) {
        // 현재 노드가 null일 경우 역순으로 변환된 리스트 반환
        if (node == null) {
            return prev;
        }
        // 다음 노드를 미리 저장한 후 현재 노드의 방향을 이전 노드로 변경
        ListNode next = node.next;
        node.next = prev;
        // 재귀 호출로 계속 역순 변환
        return reverse(next, node);
    }

    // reverseList 메서드: head 노드를 시작으로 역순 변환을 시작
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    // main 메서드: 실행 메서드
    public static void main(String[] args) {
        // 예시 리스트 생성 (1 -> 2 -> 3 -> 4 -> 5)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // 역순 변환 메서드 호출
        _206_ReverseLinkedList solution = new _206_ReverseLinkedList();
        ListNode reversedList = solution.reverseList(head);

        // 변환된 리스트 출력
        printList(reversedList);
    }

    // 연결 리스트를 출력하는 메서드
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
}
