package com.hibian.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tree {

    public static void main(String[] args) {
        TreeMap<String,String> treeMap = new TreeMap<String, String>();
        treeMap.put("a","a");
        treeMap.put("c", "c");
        treeMap.put("b", "b");
        Set<Map.Entry<String, String>> entries = treeMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next);
        }
    }
}
