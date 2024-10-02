package juyoungoh.programmers.lv1;

public class _120902 {
    public static int solution(String my_string) {
        int answer = 0;
        String strArr[] = my_string.split(" ");

        for (int i = 0; i < strArr.length; i++) {

            if (strArr[i].equals("+")) {
            } else {
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("3 + 4"));
    }
}
