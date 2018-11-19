package com.hibian.tree;

public class Node {//二叉树节点类
    private Integer data;//节点的数据
    private Node leftNode;//左节点数据
    private Node rightNode;//右节点数据

    public Node() {
    }

    public Node(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public void display(){//展示节点内容
        System.out.println(data);
    }
}
