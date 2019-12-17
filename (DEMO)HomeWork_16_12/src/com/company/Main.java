//        String name = "Bob";
//        int a1 = 10;
//        List<String> list = new ArrayList<>();
//        list.add(String.valueOf(a1)); // now String value of int will add to list
//        System.out.println("List element : " + list.get(0));


//MyEntry< ?, Integer> myEntry = new MyEntry();
////        System.out.println(myEntry.getV(new String("adf")));

package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

       Mapp mapp = new Mapp();
       mapp.addNewObject();
       mapp.removeMapForKey();
       mapp.removeMapForValue();
       mapp.setKey();
       System.out.println();
       mapp.listValue();


    }
}





