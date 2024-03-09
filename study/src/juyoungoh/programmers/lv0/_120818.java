package juyoungoh.programmers.lv0;

public class _120818 {

    public static int solution(int price) {
        double answerDouble = 0.0;

        if (price >= 500000) {
            answerDouble = (double) price * 0.8;
            return (int) answerDouble;
        } else if (price >= 300000) {
            answerDouble = (double) price * 0.9;
            return (int) answerDouble;
        } else if (price >= 100000) {
            answerDouble = (double) price * 0.95;
            return (int) answerDouble;
        } else {
            return price;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(150000));
        System.out.println(solution(580000));
        System.out.println(solution(100000));
    }
}
