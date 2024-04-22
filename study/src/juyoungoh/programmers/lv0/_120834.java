package juyoungoh.programmers.lv0;

public class _120834 {
    public static String solution(int age) {
        String answer = "";
        String ages = String.valueOf(age);
        String arr[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        for (int i = 0; i < ages.length(); i++) {
            answer += arr[Integer.parseInt(String.valueOf(ages.charAt(i)))];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(23)); // cd
        System.out.println(solution(51)); // fb
        System.out.println(solution(1000)); // baa
    }
}
