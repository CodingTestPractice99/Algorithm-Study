package juyoungoh.programmers.lv0;

public class _181926 {
    public static int solution(int n, String control) {
        int answer = n;
       char str[] = control.toCharArray();

        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'w') {
                answer += 1;
            } else if (str[i] == 's') {
                answer -= 1;
            } else if (str[i] == 'd') {
                answer += 10;
            } else if (str[i] == 'a') {
                answer -= 10;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(0, "wsdawsdassw"));
    }
}
