package com.company2;

import java.util.Iterator;

public class Test {

    private Number[] numbers;
    private int index = 0;


    public Test(Number[] numbers) {
        this.numbers = numbers;
    }


    void createMethodHasNext(){
        SimpleIterator simpleIterator = new SimpleIterator();
        simpleIterator.next();
    }

    void createMethodNext(){
        SimpleIterator simpleIterator = new SimpleIterator();
        simpleIterator.next();
    }
    class SimpleIterator implements Iterator {


        @Override
        public boolean hasNext() {
            return index < numbers.length;
        }

        @Override
        public Object next() {
//            for (int i = 0; i < numbers.length; i++) {
//                if (i % 2 == 1) {
//                    i = 0;
//                }
//            }
            return numbers[index++];
        }
    }

    class SimpleIterator2 implements Iterator{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }

}