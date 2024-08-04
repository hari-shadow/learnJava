package OOPS;

public class WrapperClassExamplt {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
        Integer a = 10;// Integer is a wrapper class and a , b are objects. you may think this would swap . but no . Integer wrapper class is declared as final;
        Integer b = 20;
        swap ( a,b);
        System.out.println(a +" "+b);

//        final int a = 10;
//        a = 20;

        final JUST obj1 = new JUST("hari");
        obj1.name = "siva";
        System.out.println(obj1.name);
    }
    static void swap(int a , int b){ // this will not swap because java has only pass by value , primitives has no objects;
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap(Integer a ,Integer b){ // this will also not swap because Integer class is declared as "final"
        Integer temp = a;
        a = b;
        b = temp;
    }
}
class JUST{
    String name;
    JUST(String name){
        this.name = name;
    }
}