package juyoungoh.programmers.lv0;

public class _120864 {

    public static int solution(String my_string) {
        int answer = 0;

        String str = my_string.replaceAll("[^0-9]", ",");
        String str2[] = str.split(",");

        for (int i = 0; i < str2.length; i++) {
            if (!(str2[i].isBlank()) || !(str2[i].equals("")) || !(str2[i].isEmpty())) {
                answer += Integer.parseInt(str2[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123Z"));
    }
}
