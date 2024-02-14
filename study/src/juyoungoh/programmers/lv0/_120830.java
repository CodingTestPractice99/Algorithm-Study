package juyoungoh.programmers.lv0;

public class _120830 {

    public static int solution(int sheep, int juice) {
        int sheepMoney = 12000;
        int juiceMoney = 2000;
        int juiceCount = 0;
        int disCount = 0;
        int total = 0;
        int juiceTotal = 0;

        if (sheep >= 10 || juice != 0) {
            juiceCount = sheep / 10;
            disCount = juiceCount * juiceMoney;
            juiceTotal = juice * juiceMoney;
            return total = (sheepMoney * sheep) - disCount + juiceTotal;
        } else if (sheep < 10) {
            return total = (sheepMoney * sheep) + (juiceMoney * juice);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 3));
        System.out.println(solution(64, 6));
    }
}
