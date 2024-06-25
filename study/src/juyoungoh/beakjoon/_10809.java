package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int alphabetNum[] = new int[26];
        String alphabet[] = new String[26];

        alphabet[0] = "a";
        alphabet[1] = "b";
        alphabet[2] = "c";
        alphabet[3] = "d";
        alphabet[4] = "e";
        alphabet[5] = "f";
        alphabet[6] = "g";
        alphabet[7] = "h";
        alphabet[8] = "i";
        alphabet[9] = "j";
        alphabet[10] = "k";
        alphabet[11] = "l";
        alphabet[12] = "m";
        alphabet[13] = "n";
        alphabet[14] = "o";
        alphabet[15] = "p";
        alphabet[16] = "q";
        alphabet[17] = "r";
        alphabet[18] = "s";
        alphabet[19] = "t";
        alphabet[20] = "u";
        alphabet[21] = "v";
        alphabet[22] = "w";
        alphabet[23] = "x";
        alphabet[24] = "y";
        alphabet[25] = "z";

        for (int i = 0; i < alphabetNum.length; i++) {
            alphabetNum[i] = -1;
        }

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (String.valueOf(input.charAt(i)).equals(alphabet[j]) && alphabetNum[j] == -1) {
                    alphabetNum[j] = i;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabetNum.length; i++) {
            sb.append(alphabetNum[i]).append(" ");
        }
        System.out.println(sb);
    }
}
