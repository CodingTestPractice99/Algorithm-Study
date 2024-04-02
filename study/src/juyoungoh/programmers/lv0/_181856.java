package juyoungoh.programmers.lv0;

public class _181856 {

    public static int solution(int[] arr1, int[] arr2) {
        int arr11 = 0;
        int arr22 = 0;

        if (arr1.length > arr2.length) {
            return 1;
        } else if (arr1.length < arr2.length) {
            return -1;
        } else if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                arr11 += arr1[i];
            }

            for (int i = 0; i < arr2.length; i++) {
                arr22 += arr2[i];
            }

            if (arr11 > arr22) {
                return 1;
            } else if (arr11 < arr22) {
                return -1;
            } else {
                return 0;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 13}, new int[]{70, 11, 2}));
        System.out.println(solution(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36}));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 3, 3, 3, 3}));
    }
}
