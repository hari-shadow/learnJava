package OOPS.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box boxObject = new Box(2,3);
//        System.out.println(boxObject.height);
//
//        AnotherBox anotherBox = new AnotherBox(3,5,6,5);
//        System.out.println(boxObject.length+ " "+anotherBox.weight+" "+anotherBox.height+" "+anotherBox.weight);
//
//        AnotherBox anotherBox1 = new AnotherBox(1,1,1,1);
//
//        System.out.println(boxObject.weight);

        AnotherBox just = new AnotherBox();
        just.weight = 23;
//        AnotherBox jute = new AnotherBox(just);
//        jute.weight = 10;
//        System.out.println(jute.weight);
//

        Box theBox = new AnotherBox(just);

    }
}
