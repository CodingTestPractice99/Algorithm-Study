package juyoungoh.programmers.lv0;

/**
 * 장군개미 - 5 병정개미 - 3 일개미 - 1
 */
public class _120837 {

    public static int solution(int hp) {
        int answer = 0;
        int hp2 = hp;

        while (hp2 >= 1) {
            if (hp2 >= 5) {
                answer += hp2 / 5;
                hp2 = hp2 % 5;
            } else if (hp2 >= 3) {
                answer += hp2 / 3;
                hp2 = hp2 % 3;
            } else if (hp2 >= 1) {
                answer += hp2 / 1;
                hp2 = hp2 % 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // System.out.println(solution(23)); // 5
        System.out.println(solution(24)); // 6
        System.out.println(solution(999)); // 201
    }
}
