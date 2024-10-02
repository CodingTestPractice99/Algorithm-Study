package juyoungoh.programmers.lv1;

public class _82612 {
    public static long solution(int price, int money, int count) {
        long priceSum = 0;
        for (int i = 1; i <= count; i++) {
            priceSum += price * i;
        }

        if ((priceSum - money) <= 0) {
            return 0;
        }
        return priceSum - money;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }
}
