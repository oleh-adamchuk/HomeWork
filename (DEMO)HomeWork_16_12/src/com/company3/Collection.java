package com.company3;

public class Collection implements Iterator {

    private Object[] objects;
    private int index = 0;

    public Collection(Object[] objects) {
        this.objects = objects;
    }

    public Object[] objects() {
        return objects;
    }

    public void setNumbers(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return index < objects.length;
    }

    @Override
    public Object next() {
        for (index = 0; index < objects.length; index++) {
            if (index % 2 == 1) {
                index = 0;
                return objects[index];
            }}return objects[index];


    }
    }
