package com.hibian.tree;

public class TreeImpl implements Tree {

    private Node root;
    public Node getRoot() {
        return root;
    }

    public Node find(Integer key) {
        Node next= root;
        while (next!=null){
            if (next.getData()>key){//搜索值小于根节点,去左节点找
                    next = next.getLeftNode();
            }else if (next.getData()<key){
                    next = next.getRightNode();
            }else{
                return next;
            }
        }
        return null;
    }

    public boolean insert(Integer key) {
        Node newNode = new Node(key);//创建新的节点
        if (root==null){//根节点没有的话,在根节点添加
            root=newNode;
            return true;
        }

        Node nextNode = root;//根节点不为空
        //根节点有东西,比较大小,判断需要在左节点添加还是右节点,为空的话直接添加,相等的话返回false
        while (nextNode!=null){
            //判断是否相等
            if(nextNode.getData().equals(key)){//有重复值,可以选择count+1,也可以选择直接返回false,这里返回false,添加失败
                return false;
            }else if (nextNode.getData()>key){//节点值大于KEY,应该添加到左节点,为空的话直接添加,不为空的话,继续判断
                if (nextNode.getLeftNode()==null){
                    nextNode.setLeftNode(newNode);
                    return true;
                }
                nextNode = nextNode.getLeftNode();
            }else{
                if (nextNode.getRightNode()==null){
                    nextNode.setRightNode(newNode);
                    return true;
                }
                nextNode = nextNode.getRightNode();
            }
        }
        return true;
    }

    //遍历
    public void infixOrder(Node current){//中序遍历
        if (current!=null){
            infixOrder(current.getLeftNode());
            System.out.print(current.getData()+" ");
            infixOrder(current.getRightNode());
        }
    }
    public void preOrder(Node current){//前序遍历
        if (current!=null){
            System.out.print(current.getData()+" ");
            preOrder(current.getLeftNode());
            preOrder(current.getRightNode());
        }
    }
    public void postOrder(Node current){//后序遍历
        if (current!=null){
            postOrder(current.getLeftNode());
            postOrder(current.getRightNode());
            System.out.print(current.getData()+" ");
        }
    }


    public boolean delete(Integer key) {
        return false;
    }
}
