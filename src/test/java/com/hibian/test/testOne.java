package com.hibian.test;

import com.hibian.Bean.Checkerboard;
import com.hibian.Bean.Color;
import com.hibian.Bean.Piece;
import com.hibian.Main.playGobang;
import org.junit.Test;

public class testOne {
    @Test
    public void test1(){
        Checkerboard c = Checkerboard.getInstance();
        c.printBoard();
        c.addPiece(new Piece(1, Color.WHITE,7,7));
        c.addPiece(new Piece(2,Color.BLACK,7,8));
        c.printBoard();
        Piece piece = c.getPiece(7, 7);
        Piece piece1 = c.getPiece(7, 8);
        c.clearAll();
        c.printBoard();

        if (piece!=null){
            System.out.println(piece);
        }
        if (piece1!=null) {
            System.out.println(piece1);
        }else {
            System.out.println("piece1为空");
        }
    }
}
