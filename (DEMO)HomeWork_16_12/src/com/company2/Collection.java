package com.company2;

public class Collection {
    Number[] numbers;

    public Collection(Number[] numbers) {
        this.numbers = numbers;
    }
    public Collection() {
    }

    void createMethod(){
        CreateClass createClass = new CreateClass();
        createClass.hasNext();
    }

    public static void main(String[] args) {

        Collection collection = new Collection();
        collection.createMethod();




    }



    class CreateClass implements Iterator{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }

    class InnerClass implements Iterator{

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
