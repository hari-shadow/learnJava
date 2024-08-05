package OOPS.Abstraction;

public class Daughter extends Parent{
    @Override
    void fun(String name){
        System.out.println(name);
    }

    @Override
    int num(int num) {
        return 0;
    }
}
