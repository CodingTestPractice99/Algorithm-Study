package juyoungoh.programmers.lv0;

public class _120906 {

    public static int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n); // "1234"
        String array[] = str.split("");

        for (int i = 0; i < array.length; i++) {
            answer += Integer.parseInt(array[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1234));
        System.out.println(solution(930211));
    }
}
