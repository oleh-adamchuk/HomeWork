package com.company;


import java.util.*;

public class Mapp<K,V> {

    K k; V v;

    Map<Integer , Integer> map = new HashMap<>();


    public void addNewObject(){

        map.put(1,1);
        map.put(2,112);
        map.put(3,1213);
        map.put(4,154);
        map.put(5,17);
        map.put(6,16);
        map.put(7,16);
        map.put(8,10);
        map.put(9,166);


    }

    public void removeMapForKey(){
        map.remove(1);
    }

    public void removeMapForValue(){
        map.remove(166);
    }

    public void setKey() {
        for (Integer integer : map.keySet()){
            System.out.println(integer);
        }
    }

    public void listValue(){
        for (Integer i : map.values()){
            System.out.println(i);
        }

    }

    public void allMap(){

    }
}




