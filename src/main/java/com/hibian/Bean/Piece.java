package com.hibian.Bean;

import java.util.Arrays;

public class Piece {
    //落子顺序
    private Integer orger;
    //棋子颜色
    private Color color;
    //位置
    private Integer X;
    private Integer Y;

    public Piece() { }

    public Piece(Integer orger, Color color, Integer x, Integer y) {
        this.orger = orger;
        this.color = color;
        X = x;
        Y = y;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "orger=" + orger +
                ", color=" + color +
                ", X=" + X +
                ", Y=" + Y +
                '}';
    }

    public Integer getOrger() {
        return orger;
    }

    public void setOrger(Integer orger) {
        this.orger = orger;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getX() {
        return X;
    }

    public void setX(Integer x) {
        X = x;
    }

    public Integer getY() {
        return Y;
    }

    public void setY(Integer y) {
        Y = y;
    }
}
