package juyoungoh.programmers.lv0;

public class _181886 {

    public static String[] solution(String[] names) {
        String[] answer;

        if (names.length % 5 != 0) {
            answer = new String[names.length / 5 + 1];
        } else {
            answer = new String[names.length / 5];
        }
        answer[0] = names[0];

        int index = 5;

        if (names.length > 1) {
            for (int i = 1; i < names.length; i++) {
                if (index < names.length) {
                    answer[i] = names[index];
                    index += 5;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"}));
    }
}
