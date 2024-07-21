package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class _2577_1 {

    /**
     * 1. 입력
     * 2. 합계
     * 3. 숫자 -> 문자열 -> 문자 배열
     * 4. 중복 제거
     * 5. ,를 붙여서 출력
     */
    /**
     * 개선
     * 1. arrSum[] 이 꼭 필요할까?
     * 2. HashSet을 쓰고 다시 정렬할 필요가 있을까?
     * 3. , 붙이고 출력하는 로직이 과하게 복잡하지 않은가? (join 활용)
     */
    public static void main(String[] args) throws IOException {
        int sum = userInput();
        Set<Integer> integerSet = numberCalculate(sum);
        printNumber(integerSet);
    }

    private static void printNumber(Set<Integer> integerSet) {
        List<String> list = new ArrayList<>();
        for (Integer num : integerSet) {
            list.add(String.valueOf(num));
        }
        String strJoin = String.join(", ", list);
        System.out.println(strJoin);
    }

    private static Set<Integer> numberCalculate(int sum) {
        Set<Integer> integerSet = new TreeSet<>();

        while (sum >= 1) {
            int number = sum % 10;
            integerSet.add(number);
            sum /= 10;
        }
        return integerSet;
    }

    private static int userInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 1;

        for (int i = 0; i < 3; i++) {
            sum *= Integer.parseInt(br.readLine());
        }
        return sum;
    }
}
