package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5622 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char charStr[] = str.toCharArray();

        int time[] = new int[26];
        time[0] = 3;
        time[1] = 3;
        time[2] = 3;
        time[3] = 4;
        time[4] = 4;
        time[5] = 4;
        time[6] = 5;
        time[7] = 5;
        time[8] = 5;
        time[9] = 6;
        time[10] = 6;
        time[11] = 6;
        time[12] = 7;
        time[13] = 7;
        time[14] = 7;
        time[15] = 8;
        time[16] = 8;
        time[17] = 8;
        time[18] = 8;
        time[19] = 9;
        time[20] = 9;
        time[21] = 9;
        time[22] = 10;
        time[23] = 10;
        time[24] = 10;
        time[25] = 10;

        String alphabet[] = new String[26];
        alphabet[0] = "A";
        alphabet[1] = "B";
        alphabet[2] = "C";
        alphabet[3] = "D";
        alphabet[4] = "E";
        alphabet[5] = "F";
        alphabet[6] = "G";
        alphabet[7] = "H";
        alphabet[8] = "I";
        alphabet[9] = "J";
        alphabet[10] = "K";
        alphabet[11] = "L";
        alphabet[12] = "M";
        alphabet[13] = "N";
        alphabet[14] = "O";
        alphabet[15] = "P";
        alphabet[16] = "Q";
        alphabet[17] = "R";
        alphabet[18] = "S";
        alphabet[19] = "T";
        alphabet[20] = "U";
        alphabet[21] = "V";
        alphabet[22] = "W";
        alphabet[23] = "X";
        alphabet[24] = "Y";
        alphabet[25] = "Z";

        int answer = 0;

        for (int i = 0; i < charStr.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (String.valueOf(charStr[i]).equals(alphabet[j])) {
                    answer += time[j];
                }
            }
        }
        System.out.println(answer);
    }
}
