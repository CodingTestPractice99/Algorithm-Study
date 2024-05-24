package juyoungoh.programmers.lv0;

public class _120891 {
    public static int solution(int order) {
        int answer = 0;
        String number = String.valueOf(order);

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '3' || number.charAt(i) == '6' ||
            number.charAt(i) == '9') {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(29423));
    }
}
