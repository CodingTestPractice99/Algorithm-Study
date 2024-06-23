package juyoungoh.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");

        int chessCount[] = new int[6];

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        chessCount[0] = Integer.parseInt(input[0]);
        chessCount[1] = Integer.parseInt(input[1]);
        chessCount[2] = Integer.parseInt(input[2]);
        chessCount[3] = Integer.parseInt(input[3]);
        chessCount[4] = Integer.parseInt(input[4]);
        chessCount[5] = Integer.parseInt(input[5]);

        int answerKing = king - chessCount[0];
        int answerQueen = queen - chessCount[1];
        int answerRook = rook - chessCount[2];
        int answerBishop = bishop - chessCount[3];
        int answerKnight = knight - chessCount[4];
        int answerPawn = pawn - chessCount[5];

        System.out.println(answerKing + " " + answerQueen + " " + answerRook + " " + answerBishop + " " + answerKnight + " " + answerPawn);
    }
}
