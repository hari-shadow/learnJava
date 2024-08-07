package Cloning;

public class Human implements Cloneable{
    String name ;
    int age;
    int[] arr = new int[] {3,4,5,23,4};
    public Human(String name ,int age ){
        this.age = age;
        this.name = name;
    }
// shallow cloning
//    public Object clone() throws CloneNotSupportedException{
//        Object twin = super.clone();
//        return twin;
//    }


    // deep cloning
    public Object clone() throws CloneNotSupportedException{
        Human twin = (Human) super.clone();

        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < this.arr.length; i++){
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }
}
