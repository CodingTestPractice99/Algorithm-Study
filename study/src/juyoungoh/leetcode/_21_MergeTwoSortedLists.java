package juyoungoh.leetcode;

public class _21_MergeTwoSortedLists {

    // ListNode 클래스 정의
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // 두 개의 정렬된 리스트를 병합하는 함수
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 두 노드 중 한쪽이 널이면 널이 아닌 노드를 리턴
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // l2가 더 크면 l1에 재귀 호출 결과를 엮고 l1을 리턴
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    // 연결 리스트를 출력하는 함수
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    // 메인 함수
    public static void main(String[] args) {
        // 첫 번째 리스트 생성: 1 -> 2 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(5);

        // 두 번째 리스트 생성: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // 병합할 클래스 인스턴스 생성
        _21_MergeTwoSortedLists solution = new _21_MergeTwoSortedLists();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // 병합된 리스트 출력
        System.out.print("Merged List: ");
        printList(mergedList);
    }
}
