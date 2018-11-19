package com.hibian.tree;

public interface Tree {
    Node find(Integer key);//查找节点
    boolean insert(Integer key);//插入节点
    boolean delete(Integer key);//删除节点
}
