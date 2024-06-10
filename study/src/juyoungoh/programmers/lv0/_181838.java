package juyoungoh.programmers.lv0;

public class _181838 {
    public static int solution(int[] date1, int[] date2) {
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < date1.length; i++) {
            str1 += String.valueOf(date1[i]);
            str2 += String.valueOf(date2[i]);
        }

        int d1 = Integer.parseInt(str1);
        int d2 = Integer.parseInt(str2);

        if (d1 < d2) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2021,12,28}, new int[]{2021,12,29}));
        System.out.println(solution(new int[]{1024,10,24}, new int[]{1024,10,24}));
    }
}
