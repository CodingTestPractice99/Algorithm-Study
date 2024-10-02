package juyoungoh.programmers.lv0;

public class _181855 {
    public static int solution(String[] strArr) {
        int answer = 0;
        int count[] = new int[31];

        for (int i = 0; i < strArr.length; i++) {
            int length = strArr[i].length();
            count[length] += 1;
        }

        for (int i = 1; i < count.length; i++) {
            if (answer < count[i]) {
                answer = count[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a","bc","d","efg","hi"}));
    }
}
