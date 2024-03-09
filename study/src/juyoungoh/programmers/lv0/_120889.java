package juyoungoh.programmers.lv0;

import java.util.Arrays;

public class _120889 {

    // 남의 코드
    public static int solution2(int[] slides) {
        int answer = 0;
        Arrays.sort(slides);

        if (slides[2] < slides[0] + slides[1]) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }

    // 삽질한 나의 코드

    public static int solution(int[] slides) {
        int maxLength = 0;
        int minLength = 0;
        int minLength2 = 0;

        int maxIndex = 0;
        int minIndex = 0;
        int min2Index = 0;


        if (slides[0] == slides[1] && slides[2] == slides[0] && slides[1] == slides[2]) { // 정삼각형 일때
            return 1;
        } else if (!(slides[0] == slides[1]) && !(slides[1] == slides[2]) && !(slides[0]
            == slides[2])) { // 삼각형 길이가 다 다를때
            for (int i = 0; i < slides.length; i++) {
                if (maxLength < slides[i]) {
                    maxLength = slides[i];
                    maxIndex = i;
                }
            }
            for (int i = 0; i < slides.length; i++) {
                if (maxLength != slides[i] && maxIndex != i) {
                    minLength = slides[i];
                    minIndex = i;
                }
            }
            for (int i = 0; i < slides.length; i++) {
                if (minLength != slides[i] && minIndex != i && i != maxIndex) {
                    minLength2 = slides[i];
                    min2Index = i;
                }
            }
            if (maxLength < (minLength + minLength2)) {
                return 1;
            } else {
                return 2;
            }
        } else if (slides[0] == slides[1] || slides[1] == slides[2] || slides[0] == slides[2]) {
            // 이등변 삼각형일 때
            if (slides[0] == slides[1] && slides[0] + slides[1] > slides[2]) { // 2, 2, 1
                return 1;
            } else if (slides[0] == slides[2] && slides[2] + slides[0] > slides[1]) { // 2, 1, 2
                return 1;
            } else if (slides[1] == slides[2] && slides[1] + slides[2] == slides[0]) { // 2, 1, 1
                return 2;
            } else if (slides[1] == slides[2] && slides[2] + slides[1] > slides[0]) { // 5 3 3
                return 1;
            } else if (slides[0] == slides[1] && slides[0] + slides[1] > slides[2]) { // 3 3 5
                return 1;
            } else if (slides[0] == slides[2] && slides[0] + slides[2] > slides[1]) { // 3 5 3
                return 1;
            } else if (slides[1] == slides[2] && slides[0] + slides[1] > slides[2]) { // 1, 999, 999
                return 1;
            } else if (slides[0] == slides[1] && slides[0] + slides[1] < slides[2]) { // 1, 1, 999
                return 2;
            } else if (slides[1] == slides[2] && slides[1] + slides[2] >= slides[0]) { // 2, 1, 1
                return 2;
            } else if (slides[0] == slides[2] && slides[1] > slides[2]) { // 2, 4, 2
                return 2;
            }
        }
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 999})); // 2 *
        System.out.println(solution(new int[]{2, 1, 1})); // 2 *
        System.out.println(solution(new int[]{2, 4, 2})); // 2 *
    }
}
