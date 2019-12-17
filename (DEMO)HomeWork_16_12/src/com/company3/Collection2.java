package com.company3;

public class Collection2 implements Iterator{

    private Number[] numbers;
    private int index = 0;

    public Collection2(Number[] numbers) {
        this.numbers = numbers;
    }

    public Number[] numbers() {
        return numbers;
    }

    public void setNumbers(Number[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        return index < numbers.length;
    }

    @Override
    public Object next() {
        for (index = numbers.length; index >= 0; index -= 2 ){
        index = 0;
        }
       return numbers[index];
    }
}
