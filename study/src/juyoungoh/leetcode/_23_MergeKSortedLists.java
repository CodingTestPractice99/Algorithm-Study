package juyoungoh.leetcode;

import java.util.PriorityQueue;

public class _23_MergeKSortedLists {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> {
            //동일한 값이면 무시
            if (o1.val == o2.val) {
                return 0;
            }
            //새로운 값(o1)이 기본 값(o2)보다 크면 뒤에 위치
            else if (o1.val > o2.val) {
                return 1;
            } else {
                return -1;
            }
        });

        ListNode root = new ListNode(0);
        ListNode tail = root;

        //각 연결 리스트의 첫 번째 노드를 큐에 저장
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        //큐가 모두 빌 때까지 반복
        while (!pq.isEmpty()) {
            //우선 순위에 따라 추출, 다음 노드로 이동
            tail.next = pq.poll();
            tail = tail.next;

            //추출한 연결 리스트의 다음 노드는 다시 큐에 저장
            if (tail.next != null) {
                pq.add(tail.next);
            }
        }
        return root.next;
    }

    public static void main(String[] args) {
        _23_MergeKSortedLists solution = new _23_MergeKSortedLists();

        // 입력 리스트 생성: [1 -> 4 -> 5], [1 -> 3 -> 4], [2 -> 7]
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(7);

        // 배열에 각 리스트 추가
        ListNode[] lists = new ListNode[]{list1, list2, list3};

        // 리스트 병합 수행
        ListNode result = solution.mergeKLists(lists);

        // 결과 출력
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.print("null");
    }
}
