package com.hibian.Main;

import com.hibian.Bean.Checkerboard;
import com.hibian.Bean.Color;
import com.hibian.Bean.Piece;

import java.util.Scanner;

public class playGobang {
    public static void main(String[] args) {
        //初始化棋盘
        Checkerboard c = Checkerboard.getInstance();
        c.clearAll();
        c.printBoard();
        Integer count = 1;

        boolean isGoOn = true;
        Color turnColor = Color.BLACK;

        //控制台输入
        Scanner scanner = new Scanner(System.in);

        while (isGoOn){
            System.out.println("轮到"+turnColor+"落子,现在是第"+count+"手");

            //获取坐标
            System.out.println("输入x y坐标用空格分离:");
            String s = scanner.nextLine();
            System.out.println(s);
            String[] split = s.split(" ");
            //落子
            Piece piece = new Piece(count, turnColor, new Integer(split[0]), new Integer(split[1]));
            boolean b = c.addPiece(piece);
            if (!b){
                System.out.println("请重新落子!!!!");
                continue;
            }
            //打印棋盘
            c.printBoard();
            //判断胜利条件
            boolean win = c.isWin(piece);
            if (win){
                System.out.println(turnColor+"获得胜利!!!");
                break;
            }
            //跟换颜色,增加count
            turnColor = turnColor==Color.WHITE?Color.BLACK:Color.WHITE;
            count++;
        }

    }
}
