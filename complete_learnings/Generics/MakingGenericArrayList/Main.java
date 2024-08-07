package Generics.MakingGenericArrayList;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Hari<Integer> obj = new Hari<>();
        obj.set(5,20);
        obj.add(5);
        obj.add(5);
        obj.add(5);
        obj.add(5);
        obj.add(5);
        obj.add(5);
        obj.add(5);
        obj.add(5);
        obj.add(5);
        obj.add(5);
        obj.add(5);

        Hari<Integer> obj2 = new Hari<>();
        obj2.add(6);
        obj2.add(6);
        obj2.add(6);
        obj2.add(7);
//        System.out.println(Arrays.toString(obj.getArr()));
        System.out.println(Arrays.toString(obj2.getArr()));
        System.out.println(obj2.remove());
        System.out.println(obj2.size());
        System.out.println(obj.size());
        System.out.println(obj);
    }


}
