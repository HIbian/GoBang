package com.hibian.test;

import com.hibian.Bean.Checkerboard;
import com.hibian.Bean.Color;
import com.hibian.Bean.Piece;
import com.hibian.tree.Node;
import com.hibian.tree.Tree;
import com.hibian.tree.TreeImpl;
import org.junit.Test;

import java.util.Random;

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
    @Test
    public void test2(){
        Tree t1 = new TreeImpl();
        t1.insert(5);
        Node node = t1.find(5);
        System.out.println(node.getData());
        t1.insert(2);
        t1.insert(7);
        System.out.println(node.getLeftNode().getData()+" "+node.getRightNode().getData());
        t1.insert(3);
    }
    @Test
    public void test3(){
        TreeImpl t3 = new TreeImpl();
        t3.insert(5);
        t3.insert(2);
        t3.insert(7);
        t3.insert(3);
        t3.infixOrder(t3.getRoot());
        System.out.println("\n---------------------------");
        t3.preOrder(t3.getRoot());
        System.out.println("\n---------------------------");
        t3.postOrder(t3.getRoot());
    }
    @Test
    public void test4(){
        TreeImpl t3 = new TreeImpl();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            t3.insert(random.nextInt(10000));
        }
        t3.infixOrder(t3.getRoot());
        System.out.println("\n-----------------------");
        t3.preOrder(t3.getRoot());
        System.out.println("\n-----------------------");
        t3.postOrder(t3.getRoot());
        System.out.println("\n-----------------------");
        System.out.println("Min="+t3.getMin());
        System.out.println("Max="+t3.getMax());
    }

    @Test
    public void findparentTest(){
        TreeImpl t3 = new TreeImpl();
        t3.insert(5);
        t3.insert(2);
        t3.insert(7);
        t3.insert(3);
        t3.infixOrder(t3.getRoot());
        System.out.println("\n-----------------------");
        Node findparent = t3.findparent(2);
        System.out.println(findparent.getData());
        Node findparent1 = t3.findparent(7);
        System.out.println(findparent1.getData());
        Node findparent2 = t3.findparent(3);
        System.out.println(findparent2.getData());
    }
    @Test
    public void delTest1(){
        TreeImpl t3 = new TreeImpl();
        t3.insert(5);
        t3.insert(2);
        t3.insert(7);
        t3.insert(3);
        t3.infixOrder(t3.getRoot());
        System.out.println("\n-----------------------");
        t3.delete(7);
        t3.infixOrder(t3.getRoot());
    }
    @Test
    public void delTest2(){
        TreeImpl t3 = new TreeImpl();
        t3.insert(5);
        t3.insert(2);
        t3.insert(7);
        t3.insert(3);
        t3.infixOrder(t3.getRoot());
        System.out.println("\n-----------------------");
        t3.delete(2);
        t3.infixOrder(t3.getRoot());
    }
    @Test
    public void getNextValueTest(){
        TreeImpl t3 = new TreeImpl();
        t3.insert(5);
        t3.insert(2);
        t3.insert(7);
        t3.insert(3);
        t3.insert(6);
        t3.insert(20);
        t3.insert(15);
        t3.insert(19);
        t3.insert(22);
        t3.insert(23);
        Node node7 = t3.find(7);
        Node nextValue = t3.getNextValue(node7);
        System.out.println(nextValue.getData());
    }
    @Test
    public void delTest3(){
        TreeImpl t3 = new TreeImpl();
        t3.insert(5);
        t3.insert(2);
        t3.insert(7);
        t3.insert(3);
        t3.insert(6);
        t3.insert(20);
        t3.insert(15);
        t3.insert(19);
        t3.insert(22);
        t3.insert(23);
        t3.infixOrder(t3.getRoot());
        System.out.println("\n---------------------");
        t3.delete(7);
        t3.delete(20);
        t3.delete(5);
        t3.infixOrder(t3.getRoot());
    }
}
