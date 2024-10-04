package juyoungoh.leetcode;

public class _2_AddTwoNumbers_1 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 값을 계산할 임시 노드 선언
        ListNode node = new ListNode(0);
        // 임시 노드를 첫 번째 노드로 선언
        ListNode root = node;

        // 자릿수의 합(sum), 자리올림수(carry), 나머지(remainder) 를 저장할 변수 선언
        int sum, carry = 0, remainder;
        // 모든 연결 리스트를 끝까지 순회하고, 자리올림수도 0이 될 때까지 진행
        while (l1 != null || l2 != null || carry != 0) {
            sum = 0;
            // 첫 번째 연결 리스트 합산 및 진행
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            // 두 번째 연결 리스트 합산 및 진행
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // 노드의 값으로 사용할 나머지 계산
            remainder = (sum + carry) % 10;
            // 10으로 나누었을 때 몫은 자릿수가 증가했다는 의미이므로 자리올림수로 사용
            carry = (sum + carry) / 10;
            // 나머지는 다음 노드의 값으로 지정
            node.next = new ListNode(remainder);
            // 계산할 노드를 다음으로 이동
            node = node.next;
        }
        // 첫 번째 노드는 임시 노드이므로 그 다음부터 결과로 리턴
        return root.next;
    }

    // ListNode 클래스 정의
    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // main 메소드 추가
    public static void main(String[] args) {
        // list1 2 -> 4 -> 3
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(3);

        // list2 5 -> 6 -> 2
        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(2);

        // _2_AddTwoNumbers_1 클래스 인스턴스 생성
        _2_AddTwoNumbers_1 solution = new _2_AddTwoNumbers_1();

        // 두 리스트의 합산 결과
        ListNode result = solution.addTwoNumbers(list1, list2);

        // 결과 출력
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }
}
