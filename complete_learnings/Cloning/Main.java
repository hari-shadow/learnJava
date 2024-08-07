package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human hari = new Human("Hari", 21);
        System.out.println(hari.name);
        System.out.println(hari.age);

        Human twin = (Human) hari.clone();
        System.out.println(Arrays.toString(hari.arr));
        System.out.println(Arrays.toString(twin.arr));

        System.out.println(twin.arr[2]);
        hari.arr[2] = 15;

        System.out.println(Arrays.toString(hari.arr));
        System.out.println(Arrays.toString(twin.arr));


    }
}
