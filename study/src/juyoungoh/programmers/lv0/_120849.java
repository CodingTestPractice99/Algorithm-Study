package juyoungoh.programmers.lv0;

public class _120849 {

    public static String solution(String my_string) {
        char a = 'a';
        char A = 'A';
        char e = 'e';
        char E = 'E';
        char i2 = 'i';
        char I = 'I';
        char o = 'o';
        char O = 'O';
        char u = 'u';
        char U = 'U';

        StringBuilder sb = new StringBuilder();
        char[] c = my_string.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (!(c[i] == a || c[i] == A ||
                c[i] == e || c[i] == E ||
                c[i] == i2 || c[i] == I ||
                c[i] == o || c[i] == O ||
                c[i] == u || c[i] == U)
            ) {
                sb.append(c[i]);
            }
        }
        String answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("bus"));
        System.out.println(solution("nice to meet you"));
    }
}
