package com.company;

public class MyEntry<K,V> {

    K k;
    V v;

    public MyEntry(){


    }

    public MyEntry(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV(String adf) {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }

}
