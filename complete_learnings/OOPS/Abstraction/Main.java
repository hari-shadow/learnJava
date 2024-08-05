package OOPS.Abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.fun("hari");
        System.out.println(son.sum(5,4));

        System.out.println(son.num(6));

        Parent ps = new Parent() {

            @Override
            void fun(String name) {
                System.out.println("par");
            }

            @Override
            int num(int num) {
                return 0;
            }
        };
        Son ss = new Son() {

            @Override
            void fun(String name) {
                System.out.println("pasdfssdr");
            }

            @Override
            int num(int num) {
                return 0;
            }
        };
        ps.fun("fg");

        Parent.hari();
        son.hari();

    }
}
