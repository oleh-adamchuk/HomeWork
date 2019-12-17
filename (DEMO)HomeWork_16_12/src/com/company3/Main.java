package com.company3;

public class Main {

    public static void main(String[] args) {

        Integer[] integers = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};

        Collection2 collection2 = new Collection2(integers);

        while (collection2.hasNext()){
            Integer integer = (Integer) collection2.next();
            System.out.println(integer);
        }
    }
}
