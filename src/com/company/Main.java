package com.company;

import java.util.Arrays;

class Array<E>{
    E[] data;
    private int count;
    private int capacity;

    public Array(int capacity){
        this.data = (E[])(new Object[capacity]);
        this.count = 0;
        this.capacity = capacity;
    }

    public boolean addItem(E item){
        if (this.count == capacity){
            return false;
        }
        this.data[this.count] = item;
        this.count++;
        return true;
    }

    public boolean removeItem(int index){
        if (index > this.count-1){
            return false;
        }
        for (int i = index; i<this.capacity-1; i++) {
            this.data[i] = this.data[i+1];
        }
        this.data[this.count-1] = null;
        this.count--;
        return true;
    }

    @Override
    public String toString() {
        return "Array{" +
                "data=" + Arrays.toString(data) +
                ", count=" + count +
                ", capacity=" + capacity +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {

    }
}
