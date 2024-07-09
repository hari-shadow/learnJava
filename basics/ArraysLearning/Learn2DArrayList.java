package ArraysLearning;

import java.util.ArrayList;
import java.util.Scanner;

public class Learn2DArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // single dimension arraylist

//        ArrayList<Integer> arraylist = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            arraylist.add(i,input.nextInt());
//
//        }
//
//        for(Integer arr : arraylist){
//            System.out.println(arr+ " ");
//        }

        //initialization of arraylist of 2d
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            arrayList.add(new ArrayList<>());
        }
        // initialization end

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayList.get(i).add(input.nextInt());
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arrayList.get(i).get(j) + " ");
            }
            System.out.println();
        }


        System.out.println(arrayList);
        input.close();
    }


}
