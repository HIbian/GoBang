package com.hibian.Bean;

public class Checkerboard {
    //单例模式
    private static Checkerboard checkerboard = null;
    private Checkerboard(){}
    public static Checkerboard getInstance(){
        if (checkerboard==null){
            checkerboard = new Checkerboard();
        }
        return checkerboard;
    }

    //设置棋盘大小
    private int size = 15;
    //15*15的棋盘
    private Piece[][] pieces = new Piece[size][size];

    //添加棋子
    public boolean addPiece(Piece p){
        if(pieces[p.getX()][p.getY()]!=null){
            return false;
        }
        pieces[p.getX()][p.getY()] = p;
        return true;
    }

    //获得指定位置棋子
    public Piece getPiece(Integer X,Integer Y){
        if (size>=X && size>=Y){
            return pieces[X][Y];
        }
        return null;
    }
    //根据order获取棋子
    public Piece getPiece(Integer order){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (pieces[i][j]==null){
                    continue;
                }
                if (pieces[i][j].getOrger()==order){
                    return pieces[i][j];
                }
            }
        }
        return null;
    }

    //判断是否获胜
    public boolean isWin(Piece piece){
        int total=1;
        Color nowColor = piece.getColor();
        Integer x = piece.getX();
        Integer y = piece.getY();
        //横向扫描
        //向左
        for (int i = 1; i <= 4; i++) {
            if (y-i<0){
                break;
            }else if (pieces[x][y-i]==null){
                break;
            }else if (pieces[x][y-i].getColor()!=nowColor){
                break;
            }
            total++;
        }
        //向右
        for (int i = 1; i <= 4; i++) {
            if (y+i>=size){
                break;
            }else if (pieces[x][y+i]==null){
                break;
            }else if (pieces[x][y+i].getColor()!=nowColor){
                break;
            }
            total++;
        }
        if (total>=5){
            return true;
        }
        //竖向扫描
        total=1;//重置total
        //向上
        for (int i = 1; i <= 4; i++) {
            if (x-i<0){
                break;
            }else if (pieces[x-i][y]==null){
                break;
            }else if (pieces[x-i][y].getColor()!=nowColor){
                break;
            }
            total++;
        }
        //向下
        for (int i = 1; i <= 4; i++) {
            if (x+i>=size){
                break;
            }else if (pieces[x+i][y]==null){
                break;
            }else if (pieces[x+i][y].getColor()!=nowColor){
                break;
            }
            total++;
        }
        if (total>=5){
            return true;
        }
        //左上到右下扫描
        total=1;
        //左上
        for (int i = 1; i <=4; i++) {
            if (x-i<0 || y-i<0){
                break;
            }else if (pieces[x-i][y-i]==null){
                break;
            }else if (pieces[x-i][y-i].getColor()!=nowColor){
                break;
            }
            total++;
        }
        //右下
        for (int i = 1; i <=4; i++) {
            if (x+i>=size || y+i>=size){
                break;
            }else if (pieces[x+i][y+i]==null){
                break;
            }else if (pieces[x+i][y+i].getColor()!=nowColor){
                break;
            }
            total++;
        }
        if (total>=5){
            return true;
        }
        //左下到右上扫描
        total=1;
        //左下
        for (int i = 1; i <=4; i++) {
            if (x+i>=size || y-i<0){
                break;
            }else if (pieces[x+i][y-i]==null){
                break;
            }else if (pieces[x+i][y-i].getColor()!=nowColor){
                break;
            }
            total++;
        }
        //右上
        for (int i = 1; i <=4; i++) {
            if (x-i<0 || y+i>=size){
                break;
            }else if (pieces[x-i][y+i]==null){
                break;
            }else if (pieces[x-i][y+i].getColor()!=nowColor){
                break;
            }
            total++;
        }
        return total>=5;
    }

    //打印棋盘
    public void printBoard(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <size ; j++) {
                if (pieces[i][j]==null){
                    System.out.print("╂");
                    continue;
                }
                if (pieces[i][j].getColor()==Color.WHITE){
                    System.out.print("●");
                }else {
                    System.out.print("○");
                }
            }
            System.out.println(i);
        }
        for (int i = 0; i < size; i++) {
            if (i<6){
                System.out.print(i+"..");
            }else if (i<7){
                System.out.print(i+".");
            }else{
                System.out.print(i);
            }
        }
        System.out.println("\n----------------------------------------");
    }

    //清空棋盘
    public void clearAll(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (pieces[i][j]!=null){
                    pieces[i][j]=null;
                }
            }
        }
    }
}
