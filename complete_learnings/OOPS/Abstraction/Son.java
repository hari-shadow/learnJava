package OOPS.Abstraction;

public class Son extends Parent{

    @Override
    void fun(String name){
        System.out.println(name);
    }

    @Override
    int num(int num) {
        return num;
    }

    static void hari(){
        System.out.println("nar");
    }

}
