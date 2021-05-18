package day17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> list = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            list.add(ChessPiece.PAWN_WHITE);
            System.out.print(ChessPiece.PAWN_WHITE.getRepresentation() + " ");
        }
        for (int i = 0; i < 4; i++){
            list.add(ChessPiece.ROOK_BLACK);
            System.out.print(ChessPiece.ROOK_BLACK.getRepresentation() + " ");
        }
    }
}