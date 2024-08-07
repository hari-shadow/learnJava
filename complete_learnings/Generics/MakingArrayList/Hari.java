package Generics.MakingArrayList;

import java.util.Arrays;

public class Hari {
    private int[] arr;
    private static int DEFAULT_VALUE = 10;
    private int size = 0; // also works as an index value

    Hari(){
        this.arr = new int[DEFAULT_VALUE];
    }

    public int[] getArr(){
        return this.arr; // same as the explanation in the below function
    }

    public void add(int value){
        if (arr.length == size){ //can also use this.arr.length --> current initialization will also work same
            // because the add() is called via the object and that object will pass inside the function also
            resize();
        }
        this.arr[size++] = value;
    }

    public void set(int index, int value){
        this.arr[index] = value;
    }

    private void resize(){
        int[] temp = new int[2 * arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            temp[i] = this.arr[i];
        }
        this.arr = temp;
    }

    public int remove(){
        return arr[--size];
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
