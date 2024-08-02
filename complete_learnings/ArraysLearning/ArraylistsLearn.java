package ArraysLearning;

import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Arrays;

public class ArraylistsLearn {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(34);
        arrayList.add(56);
        arrayList.add(456);
        arrayList.add(535);

        System.out.println(arrayList);
        int[] arr = new int[arrayList.size()];
        System.out.println(arr.toString());
        input.close();
    }
}
