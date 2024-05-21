package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _181919 {
    public static int[] solution(int n) {
        int count = 1;
        int count2 = 1;
        int a = n;
        int b = n;
          while (a > 1) {
              if (a % 2 == 0) {
                  a /= 2;
                  count++;
              } else if (a % 2 != 0) {
                  a = (3 * a) + 1;
                  count++;
              }
          }

        int[] answer = new int[count];
          answer[0] = n;
        while (b > 1) {
            if (b % 2 == 0) {
                b /= 2;
                answer[count2] = b;
                count2++;
            } else if (b % 2 != 0) {
                b = (3 * b) + 1;
                answer[count2] = b;
                count2++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
    }
}
