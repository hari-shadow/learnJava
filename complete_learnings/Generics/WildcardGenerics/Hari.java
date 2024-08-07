package Generics.WildcardGenerics;

import java.util.Arrays;

public class Hari<H extends Number> {
    private Object[] arr;
    private static final int DEFAULT_VALUE = 10;
    private int size = 0; // also works as an index value

    Hari(){
        this.arr = new Object[DEFAULT_VALUE];
    }

    public Object[] getArr(){
        return this.arr; // same as the explanation in the below function
    }

    public void add(H value){
        if (arr.length == size){ //can also use this.arr.length --> current initialization will also work same
            // because the add() is called via the object and that object will pass inside the function also
            resize();
        }
        this.arr[size++] = value;
    }

    public void set(int index,H value){
        this.arr[index] = value;
    }

    private void resize(){
        Object[] temp = new Object[2 * arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            temp[i] = this.arr[i];
        }
        this.arr = temp;
    }

    public H remove(){
        return (H)arr[--size];
    }

    public int size(){
        return size;
    }

//    public String toString(){
//        return Arrays.toString(arr);
//    }


    @Override
    public String toString() {
        return "Hari{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }
}