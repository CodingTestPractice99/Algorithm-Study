package juyoungoh.beakjoon;

public class _4673 {
    public static void main(String[] args) {
        boolean bool[] = new boolean[10000];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            int num = d(i + 1);
            if (bool.length - 1 >= num) {
                bool[num - 1] = true;
            }
        }

        for (int i = 0; i < bool.length - 1; i++) {
            if (!(bool[i])) {
                sb.append(i+1).append("\n");
            }
        }
        System.out.print(sb);
    }

    private static int d(int n) {
        int number = n;
        int sum = n;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
