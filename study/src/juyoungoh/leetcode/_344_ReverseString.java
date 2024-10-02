package juyoungoh.leetcode;

public class _344_ReverseString {

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        // 서로 중앙으로 이동해 나가다 겹치는 지점에 도달하면 종료
        while (start < end) {
            // 임시 변수를 이용해 값 스왑
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}
