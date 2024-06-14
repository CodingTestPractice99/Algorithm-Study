package juyoungoh.programmers.lv0;

public class _120912 {

    public static int solution(int[] array) {
        int answer = 0;
        String str = "";

        for (int i = 0; i < array.length; i++) {
            str += String.valueOf(array[i]);
        }

        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals("7")) {
                answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 77, 17}));
        System.out.println(solution(new int[]{10, 29}));
    }
}
